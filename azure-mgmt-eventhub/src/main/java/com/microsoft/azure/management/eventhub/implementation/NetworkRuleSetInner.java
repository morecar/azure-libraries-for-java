/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.implementation;

import com.microsoft.azure.management.eventhub.DefaultAction;
import java.util.List;
import com.microsoft.azure.management.eventhub.NWRuleSetVirtualNetworkRules;
import com.microsoft.azure.management.eventhub.NWRuleSetIpRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Description of NetworkRuleSet resource.
 */
@JsonFlatten
public class NetworkRuleSetInner extends ProxyResource {
    /**
     * Default Action for Network Rule Set. Possible values include: 'Allow',
     * 'Deny'.
     */
    @JsonProperty(value = "properties.defaultAction")
    private DefaultAction defaultAction;

    /**
     * List VirtualNetwork Rules.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<NWRuleSetVirtualNetworkRules> virtualNetworkRules;

    /**
     * List of IpRules.
     */
    @JsonProperty(value = "properties.ipRules")
    private List<NWRuleSetIpRules> ipRules;

    /**
     * Get default Action for Network Rule Set. Possible values include: 'Allow', 'Deny'.
     *
     * @return the defaultAction value
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set default Action for Network Rule Set. Possible values include: 'Allow', 'Deny'.
     *
     * @param defaultAction the defaultAction value to set
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get list VirtualNetwork Rules.
     *
     * @return the virtualNetworkRules value
     */
    public List<NWRuleSetVirtualNetworkRules> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set list VirtualNetwork Rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withVirtualNetworkRules(List<NWRuleSetVirtualNetworkRules> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get list of IpRules.
     *
     * @return the ipRules value
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.ipRules;
    }

    /**
     * Set list of IpRules.
     *
     * @param ipRules the ipRules value to set
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withIpRules(List<NWRuleSetIpRules> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

}
