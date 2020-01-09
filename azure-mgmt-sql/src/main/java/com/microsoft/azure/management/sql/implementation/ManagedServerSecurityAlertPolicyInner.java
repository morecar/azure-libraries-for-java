/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.SecurityAlertPolicyState;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A managed server security alert policy.
 */
@JsonFlatten
public class ManagedServerSecurityAlertPolicyInner extends ProxyResource {
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or
     * a policy has not been applied yet on the specific database. Possible
     * values include: 'New', 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", required = true)
    private SecurityAlertPolicyState state;

    /**
     * Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly,
     * Data_Exfiltration, Unsafe_Action.
     */
    @JsonProperty(value = "properties.disabledAlerts")
    private List<String> disabledAlerts;

    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     */
    @JsonProperty(value = "properties.emailAddresses")
    private List<String> emailAddresses;

    /**
     * Specifies that the alert is sent to the account administrators.
     */
    @JsonProperty(value = "properties.emailAccountAdmins")
    private Boolean emailAccountAdmins;

    /**
     * Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold
     * all Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.storageEndpoint")
    private String storageEndpoint;

    /**
     * Specifies the identifier key of the Threat Detection audit storage
     * account.
     */
    @JsonProperty(value = "properties.storageAccountAccessKey")
    private String storageAccountAccessKey;

    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Specifies the UTC creation time of the policy.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Get specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database. Possible values include: 'New', 'Enabled', 'Disabled'.
     *
     * @return the state value
     */
    public SecurityAlertPolicyState state() {
        return this.state;
    }

    /**
     * Set specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database. Possible values include: 'New', 'Enabled', 'Disabled'.
     *
     * @param state the state value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withState(SecurityAlertPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
     *
     * @return the disabledAlerts value
     */
    public List<String> disabledAlerts() {
        return this.disabledAlerts;
    }

    /**
     * Set specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action.
     *
     * @param disabledAlerts the disabledAlerts value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withDisabledAlerts(List<String> disabledAlerts) {
        this.disabledAlerts = disabledAlerts;
        return this;
    }

    /**
     * Get specifies an array of e-mail addresses to which the alert is sent.
     *
     * @return the emailAddresses value
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set specifies an array of e-mail addresses to which the alert is sent.
     *
     * @param emailAddresses the emailAddresses value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Get specifies that the alert is sent to the account administrators.
     *
     * @return the emailAccountAdmins value
     */
    public Boolean emailAccountAdmins() {
        return this.emailAccountAdmins;
    }

    /**
     * Set specifies that the alert is sent to the account administrators.
     *
     * @param emailAccountAdmins the emailAccountAdmins value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.emailAccountAdmins = emailAccountAdmins;
        return this;
    }

    /**
     * Get specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @return the storageEndpoint value
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     *
     * @param storageEndpoint the storageEndpoint value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get specifies the identifier key of the Threat Detection audit storage account.
     *
     * @return the storageAccountAccessKey value
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set specifies the identifier key of the Threat Detection audit storage account.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @return the retentionDays value
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set specifies the number of days to keep in the Threat Detection audit logs.
     *
     * @param retentionDays the retentionDays value to set
     * @return the ManagedServerSecurityAlertPolicyInner object itself.
     */
    public ManagedServerSecurityAlertPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get specifies the UTC creation time of the policy.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

}
