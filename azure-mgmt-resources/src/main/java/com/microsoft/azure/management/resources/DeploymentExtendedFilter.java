/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment filter.
 */
public class DeploymentExtendedFilter {
    /**
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DeploymentExtendedFilter object itself.
     */
    public DeploymentExtendedFilter withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
