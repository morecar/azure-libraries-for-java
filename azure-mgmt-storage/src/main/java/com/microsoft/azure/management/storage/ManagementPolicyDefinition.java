/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that defines the Lifecycle rule. Each definition is made up with a
 * filters set and an actions set.
 */
public class ManagementPolicyDefinition {
    /**
     * An object that defines the action set.
     */
    @JsonProperty(value = "actions", required = true)
    private ManagementPolicyAction actions;

    /**
     * An object that defines the filter set.
     */
    @JsonProperty(value = "filters")
    private ManagementPolicyFilter filters;

    /**
     * Get an object that defines the action set.
     *
     * @return the actions value
     */
    public ManagementPolicyAction actions() {
        return this.actions;
    }

    /**
     * Set an object that defines the action set.
     *
     * @param actions the actions value to set
     * @return the ManagementPolicyDefinition object itself.
     */
    public ManagementPolicyDefinition withActions(ManagementPolicyAction actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get an object that defines the filter set.
     *
     * @return the filters value
     */
    public ManagementPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set an object that defines the filter set.
     *
     * @param filters the filters value to set
     * @return the ManagementPolicyDefinition object itself.
     */
    public ManagementPolicyDefinition withFilters(ManagementPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

}
