/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A server DNS alias.
 */
@JsonFlatten
public class ServerDnsAliasInner extends ProxyResource {
    /**
     * The fully qualified DNS record for alias.
     */
    @JsonProperty(value = "properties.azureDnsRecord", access = JsonProperty.Access.WRITE_ONLY)
    private String azureDnsRecord;

    /**
     * Get the fully qualified DNS record for alias.
     *
     * @return the azureDnsRecord value
     */
    public String azureDnsRecord() {
        return this.azureDnsRecord;
    }

}
