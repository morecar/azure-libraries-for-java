/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.implementation.VirtualMachineInstanceViewInner;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a Virtual Machine Update.
 */
@JsonFlatten
public class VirtualMachineUpdate extends UpdateResource {
    /**
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started -&gt;**. Enter any required information
     * and then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /**
     * Specifies the hardware settings for the virtual machine.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /**
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /**
     * Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     */
    @JsonProperty(value = "properties.additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /**
     * Specifies the operating system settings for the virtual machine.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /**
     * Specifies the network interfaces of the virtual machine.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /**
     * Specifies the boot diagnostic settings state.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /**
     * Specifies information about the availability set that the virtual
     * machine should be assigned to. Virtual machines specified in the same
     * availability set are allocated to different nodes to maximize
     * availability. For more information about availability sets, see [Manage
     * the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance,
     * see [Planned maintenance for virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability
     * set at creation time. An existing VM cannot be added to an availability
     * set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a
     * non-null properties.virtualMachineScaleSet reference.
     */
    @JsonProperty(value = "properties.availabilitySet")
    private SubResource availabilitySet;

    /**
     * Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the
     * same virtual machine scale set are allocated to different nodes to
     * maximize availability. Currently, a VM can only be added to virtual
     * machine scale set at creation time. An existing VM cannot be added to a
     * virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot
     * exist along with a non-null properties.availabilitySet reference.
     * &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01.
     */
    @JsonProperty(value = "properties.virtualMachineScaleSet")
    private SubResource virtualMachineScaleSet;

    /**
     * Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /**
     * Specifies the priority for the virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values
     * include: 'Regular', 'Low', 'Spot'.
     */
    @JsonProperty(value = "properties.priority")
    private VirtualMachinePriorityTypes priority;

    /**
     * Specifies the eviction policy for the Azure Spot virtual machine. Only
     * supported value is 'Deallocate'. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01. Possible values include: 'Deallocate',
     * 'Delete'.
     */
    @JsonProperty(value = "properties.evictionPolicy")
    private VirtualMachineEvictionPolicyTypes evictionPolicy;

    /**
     * Specifies the billing related details of a Azure Spot virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     */
    @JsonProperty(value = "properties.billingProfile")
    private BillingProfile billingProfile;

    /**
     * Specifies information about the dedicated host that the virtual machine
     * resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     */
    @JsonProperty(value = "properties.host")
    private SubResource host;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The virtual machine instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineInstanceViewInner instanceView;

    /**
     * Specifies that the image or disk that is being used was licensed
     * on-premises. This element is only used for images that contain the
     * Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible values
     * are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt;
     * Windows_Server &lt;br&gt;&lt;br&gt; If this element is included in a
     * request for an update, the value must match the initial value. This
     * value cannot be updated. &lt;br&gt;&lt;br&gt; For more information, see
     * [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "properties.licenseType")
    private String licenseType;

    /**
     * Specifies the VM unique ID which is a 128-bits identifier that is
     * encoded and stored in all Azure IaaS VMs SMBIOS and can be read using
     * platform BIOS commands.
     */
    @JsonProperty(value = "properties.vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /**
     * The identity of the virtual machine, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineIdentity identity;

    /**
     * The virtual machine zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     *
     * @return the plan value
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     *
     * @param plan the plan value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get specifies the hardware settings for the virtual machine.
     *
     * @return the hardwareProfile value
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set specifies the hardware settings for the virtual machine.
     *
     * @param hardwareProfile the hardwareProfile value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get specifies additional capabilities enabled or disabled on the virtual machine.
     *
     * @return the additionalCapabilities value
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set specifies additional capabilities enabled or disabled on the virtual machine.
     *
     * @param additionalCapabilities the additionalCapabilities value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get specifies the operating system settings for the virtual machine.
     *
     * @return the osProfile value
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set specifies the operating system settings for the virtual machine.
     *
     * @param osProfile the osProfile value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get specifies the network interfaces of the virtual machine.
     *
     * @return the networkProfile value
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set specifies the network interfaces of the virtual machine.
     *
     * @param networkProfile the networkProfile value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     *
     * @return the availabilitySet value
     */
    public SubResource availabilitySet() {
        return this.availabilitySet;
    }

    /**
     * Set specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     *
     * @param availabilitySet the availabilitySet value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withAvailabilitySet(SubResource availabilitySet) {
        this.availabilitySet = availabilitySet;
        return this;
    }

    /**
     * Get specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01.
     *
     * @return the virtualMachineScaleSet value
     */
    public SubResource virtualMachineScaleSet() {
        return this.virtualMachineScaleSet;
    }

    /**
     * Set specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01.
     *
     * @param virtualMachineScaleSet the virtualMachineScaleSet value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withVirtualMachineScaleSet(SubResource virtualMachineScaleSet) {
        this.virtualMachineScaleSet = virtualMachineScaleSet;
        return this;
    }

    /**
     * Get specifies information about the proximity placement group that the virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set specifies information about the proximity placement group that the virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values include: 'Regular', 'Low', 'Spot'.
     *
     * @return the priority value
     */
    public VirtualMachinePriorityTypes priority() {
        return this.priority;
    }

    /**
     * Set specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values include: 'Regular', 'Low', 'Spot'.
     *
     * @param priority the priority value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withPriority(VirtualMachinePriorityTypes priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get specifies the eviction policy for the Azure Spot virtual machine. Only supported value is 'Deallocate'. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values include: 'Deallocate', 'Delete'.
     *
     * @return the evictionPolicy value
     */
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set specifies the eviction policy for the Azure Spot virtual machine. Only supported value is 'Deallocate'. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values include: 'Deallocate', 'Delete'.
     *
     * @param evictionPolicy the evictionPolicy value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        return this;
    }

    /**
     * Get specifies the billing related details of a Azure Spot virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the billingProfile value
     */
    public BillingProfile billingProfile() {
        return this.billingProfile;
    }

    /**
     * Set specifies the billing related details of a Azure Spot virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @param billingProfile the billingProfile value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
        return this;
    }

    /**
     * Get specifies information about the dedicated host that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @return the host value
     */
    public SubResource host() {
        return this.host;
    }

    /**
     * Set specifies information about the dedicated host that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @param host the host value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withHost(SubResource host) {
        this.host = host;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtual machine instance view.
     *
     * @return the instanceView value
     */
    public VirtualMachineInstanceViewInner instanceView() {
        return this.instanceView;
    }

    /**
     * Get specifies that the image or disk that is being used was licensed on-premises. This element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this element is included in a request for an update, the value must match the initial value. This value cannot be updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set specifies that the image or disk that is being used was licensed on-premises. This element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this element is included in a request for an update, the value must match the initial value. This value cannot be updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @param licenseType the licenseType value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the identity of the virtual machine, if configured.
     *
     * @return the identity value
     */
    public VirtualMachineIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the virtual machine, if configured.
     *
     * @param identity the identity value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withIdentity(VirtualMachineIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the virtual machine zones.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the virtual machine zones.
     *
     * @param zones the zones value to set
     * @return the VirtualMachineUpdate object itself.
     */
    public VirtualMachineUpdate withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
