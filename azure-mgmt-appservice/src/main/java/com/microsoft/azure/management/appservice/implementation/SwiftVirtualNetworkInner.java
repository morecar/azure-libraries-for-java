/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.ProxyOnlyResource;

/**
 * Swift Virtual Network Contract. This is used to enable the new Swift way of
 * doing virtual network integration.
 */
@JsonFlatten
public class SwiftVirtualNetworkInner extends ProxyOnlyResource {
    /**
     * The Virtual Network subnet's resource ID. This is the subnet that this
     * Web App will join. This subnet must have a delegation to
     * Microsoft.Web/serverFarms defined first.
     */
    @JsonProperty(value = "properties.subnetResourceId")
    private String subnetResourceId;

    /**
     * A flag that specifies if the scale unit this Web App is on supports
     * Swift integration.
     */
    @JsonProperty(value = "properties.swiftSupported")
    private Boolean swiftSupported;

    /**
     * Get the Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     *
     * @return the subnetResourceId value
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     *
     * @param subnetResourceId the subnetResourceId value to set
     * @return the SwiftVirtualNetworkInner object itself.
     */
    public SwiftVirtualNetworkInner withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
        return this;
    }

    /**
     * Get a flag that specifies if the scale unit this Web App is on supports Swift integration.
     *
     * @return the swiftSupported value
     */
    public Boolean swiftSupported() {
        return this.swiftSupported;
    }

    /**
     * Set a flag that specifies if the scale unit this Web App is on supports Swift integration.
     *
     * @param swiftSupported the swiftSupported value to set
     * @return the SwiftVirtualNetworkInner object itself.
     */
    public SwiftVirtualNetworkInner withSwiftSupported(Boolean swiftSupported) {
        this.swiftSupported = swiftSupported;
        return this;
    }

}
