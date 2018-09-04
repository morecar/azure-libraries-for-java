/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.ConnectionMonitor;
import com.microsoft.azure.v2.management.network.ConnectionMonitorDestination;
import com.microsoft.azure.v2.management.network.ConnectionMonitorQueryResult;
import com.microsoft.azure.v2.management.network.ConnectionMonitorSource;
import com.microsoft.azure.v2.management.network.NetworkWatcher;
import com.microsoft.azure.v2.management.network.ProvisioningState;
import com.microsoft.azure.v2.management.network.model.HasNetworkInterfaces;
import com.microsoft.azure.v2.management.resources.fluentcore.model.implementation.CreatableUpdatableImpl;
import com.microsoft.azure.v2.management.resources.fluentcore.utils.Utils;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implementation for Connection Monitor and its create and update interfaces.
 */
@LangDefinition
public class ConnectionMonitorImpl extends
        CreatableUpdatableImpl<ConnectionMonitor, ConnectionMonitorResultInner, ConnectionMonitorImpl>
        implements
        ConnectionMonitor,
        ConnectionMonitor.Definition {
    private final ConnectionMonitorsInner client;
    private final ConnectionMonitorInner createParameters;
    private final NetworkWatcher parent;

    ConnectionMonitorImpl(String name, NetworkWatcherImpl parent, ConnectionMonitorResultInner innerObject,
                          ConnectionMonitorsInner client) {
        super(name, innerObject);
        this.client = client;
        this.parent = parent;
        this.createParameters = new ConnectionMonitorInner().withLocation(parent.regionName());
    }

    @Override
    protected Maybe<ConnectionMonitorResultInner> getInnerAsync() {
        return this.client.getAsync(parent.resourceGroupName(), parent.name(), name());
    }

    @Override
    public String location() {
        return inner().location();
    }

    @Override
    public Map<String, String> tags() {
        Map<String, String> tags = this.inner().getTags();
        if (tags == null) {
            tags = new TreeMap<>();
        }
        return Collections.unmodifiableMap(tags);
    }

    @Override
    public ConnectionMonitorSource source() {
        return inner().source();
    }

    @Override
    public ConnectionMonitorDestination destination() {
        return inner().destination();
    }

    @Override
    public boolean autoStart() {
        return Utils.toPrimitiveBoolean(inner().autoStart());
    }

    @Override
    public ProvisioningState provisioningState() {
        return inner().provisioningState();
    }

    @Override
    public OffsetDateTime startTime() {
        return inner().startTime();
    }

    @Override
    public String monitoringStatus() {
        return inner().monitoringStatus();
    }

    @Override
    public int monitoringIntervalInSeconds() {
        return Utils.toPrimitiveInt(inner().monitoringIntervalInSeconds());
    }

    @Override
    public void stop() {
        stopAsync().blockingAwait();
    }

    @Override
    public Completable stopAsync() {
        return this.client.stopAsync(parent.resourceGroupName(), parent.name(), name())
                .andThen(refreshAsync())
                .flatMapCompletable(o ->  Completable.complete());
    }

    @Override
    public void start() {
        startAsync().blockingAwait();
    }

    @Override
    public Completable startAsync() {
        return this.client.startAsync(parent.resourceGroupName(), parent.name(), name())
                .andThen(refreshAsync())
                .flatMapCompletable(o ->  Completable.complete());
    }

    @Override
    public ConnectionMonitorQueryResult query() {
        return queryAsync().blockingGet();
    }

    @Override
    public Maybe<ConnectionMonitorQueryResult> queryAsync() {
        return this.client.queryAsync(parent.resourceGroupName(), parent.name(), name())
                .map(inner -> new ConnectionMonitorQueryResultImpl(inner));
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    @Override
    public Observable<ConnectionMonitor> createResourceAsync() {
        return this.client.createOrUpdateAsync(parent.resourceGroupName(), parent.name(), this.name(), createParameters)
                .map(innerToFluentMap(this))
                .toObservable();
    }

    @Override
    public String id() {
        return inner().id();
    }

    @Override
    public ConnectionMonitorImpl withSourceId(String resourceId) {
        ensureConnectionMonitorSource().withResourceId(resourceId);
        return this;
    }

    @Override
    public ConnectionMonitorImpl withSource(HasNetworkInterfaces vm) {
        ensureConnectionMonitorSource().withResourceId(vm.id());
        return this;
    }

    @Override
    public ConnectionMonitorImpl withDestinationId(String resourceId) {
        ensureConnectionMonitorDestination().withResourceId(resourceId);
        return this;
    }

    @Override
    public ConnectionMonitorImpl withDestination(HasNetworkInterfaces vm) {
        ensureConnectionMonitorDestination().withResourceId(vm.id());
        return this;
    }

    @Override
    public DefinitionStages.WithDestinationPort withDestinationAddress(String address) {
        ensureConnectionMonitorDestination().withAddress(address);
        return this;
    }

    private ConnectionMonitorSource ensureConnectionMonitorSource() {
        if (createParameters.source() == null) {
            createParameters.withSource(new ConnectionMonitorSource());
        }
        return createParameters.source();
    }

    private ConnectionMonitorDestination ensureConnectionMonitorDestination() {
        if (createParameters.destination() == null) {
            createParameters.withDestination(new ConnectionMonitorDestination());
        }
        return createParameters.destination();
    }

    @Override
    public ConnectionMonitorImpl withDestinationPort(int port) {
        ensureConnectionMonitorDestination().withPort(port);
        return this;
    }

    @Override
    public ConnectionMonitorImpl withSourcePort(int port) {
        ensureConnectionMonitorSource().withPort(port);
        return this;
    }

    @Override
    public ConnectionMonitorImpl withoutAutoStart() {
        createParameters.withAutoStart(false);
        return this;
    }

    @Override
    public final ConnectionMonitorImpl withTags(Map<String, String> tags) {
        this.createParameters.withTags(new HashMap<>(tags));
        return this;
    }

    @Override
    public ConnectionMonitorImpl withTag(String key, String value) {
        if (this.createParameters.tags() == null) {
            this.createParameters.withTags(new HashMap<String, String>());
        }
        this.createParameters.tags().put(key, value);
        return this;
    }

    @Override
    public ConnectionMonitorImpl withoutTag(String key) {
        if (this.createParameters.tags() != null) {
            this.createParameters.tags().remove(key);
        }
        return this;
    }

    @Override
    public ConnectionMonitorImpl withMonitoringInterval(int seconds) {
        createParameters.withMonitoringIntervalInSeconds(seconds);
        return this;
    }
}
