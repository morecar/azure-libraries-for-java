/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.SubResource;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Specifies information about the availability set that the virtual machine
 * should be assigned to. Only tags may be updated.
 */
@JsonFlatten
public class AvailabilitySetUpdate extends UpdateResource {
    /**
     * Update Domain count.
     */
    @JsonProperty(value = "properties.platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /**
     * Fault Domain count.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /**
     * A list of references to all virtual machines in the availability set.
     */
    @JsonProperty(value = "properties.virtualMachines")
    private List<SubResource> virtualMachinesProperty;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "properties.statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> statuses;

    /**
     * Sku of the availability set.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the platformUpdateDomainCount value.
     *
     * @return the platformUpdateDomainCount value.
     */
    public Integer platformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set the platformUpdateDomainCount value.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to
     * set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        return this;
    }

    /**
     * Get the platformFaultDomainCount value.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount value.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to
     * set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the virtualMachinesProperty value.
     *
     * @return the virtualMachinesProperty value.
     */
    public List<SubResource> virtualMachinesProperty() {
        return this.virtualMachinesProperty;
    }

    /**
     * Set the virtualMachinesProperty value.
     *
     * @param virtualMachinesProperty the virtualMachinesProperty value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withVirtualMachinesProperty(List<SubResource> virtualMachinesProperty) {
        this.virtualMachinesProperty = virtualMachinesProperty;
        return this;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }
}
