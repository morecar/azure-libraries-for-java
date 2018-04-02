/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.implementation;

import com.microsoft.azure.management.keyvault.VaultProperties;
import com.microsoft.azure.management.keyvault.VaultPatchProperties;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import com.microsoft.azure.management.keyvault.Vault;
import rx.Observable;
import rx.functions.Func1;

class VaultImpl extends GroupableResourceImpl<Vault, VaultInner, VaultImpl, KeyVaultManager> implements Vault, Vault.Definition, Vault.Update {
    private VaultPatchParametersInner updateParameter;
    private VaultCreateOrUpdateParametersInner createParameter;
    VaultImpl(String name, VaultInner inner, KeyVaultManager manager) {
        super(name, inner, manager);
        this.updateParameter = new VaultPatchParametersInner();
        this.createParameter = new VaultCreateOrUpdateParametersInner();
    }

    @Override
    public VaultProperties properties() {
        return this.inner().properties();
    }

    @Override
    public VaultImpl withProperties(VaultProperties properties) {
        this.createParameter.withProperties(properties);
        return this;
    }

    @Override
    public VaultImpl withProperties(VaultPatchProperties properties) {
        this.updateParameter.withProperties(properties);
        return this;
    }

    @Override
    public Observable<Vault> createResourceAsync() {
        final VaultsInner client = this.manager().inner().vaults();
        //
        this.createParameter.withLocation(this.inner().location());
        this.createParameter.withTags(this.inner().getTags());
        //
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
                .map(new Func1<VaultInner, VaultInner>() {
                    @Override
                    public VaultInner call(VaultInner vaultInner) {
                        updateParameter = new VaultPatchParametersInner();
                        createParameter = new VaultCreateOrUpdateParametersInner();
                        return vaultInner;
                    }
                })
                .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Vault> updateResourceAsync() {
        final VaultsInner client = this.manager().inner().vaults();
        //
        this.updateParameter.withTags(this.inner().getTags());
        //
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
                .map(new Func1<VaultInner, VaultInner>() {
                    @Override
                    public VaultInner call(VaultInner vaultInner) {
                        updateParameter = new VaultPatchParametersInner();
                        createParameter = new VaultCreateOrUpdateParametersInner();
                        return vaultInner;
                    }
                })
                .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VaultInner> getInnerAsync() {
        final VaultsInner client = this.manager().inner().vaults();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }
}
