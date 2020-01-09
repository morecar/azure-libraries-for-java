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
 * Properties of key vault.
 */
public class KeyVaultProperties {
    /**
     * The name of KeyVault key.
     */
    @JsonProperty(value = "keyname")
    private String keyName;

    /**
     * The version of KeyVault key.
     */
    @JsonProperty(value = "keyversion")
    private String keyVersion;

    /**
     * The Uri of KeyVault.
     */
    @JsonProperty(value = "keyvaulturi")
    private String keyVaultUri;

    /**
     * Get the name of KeyVault key.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the name of KeyVault key.
     *
     * @param keyName the keyName value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the version of KeyVault key.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the version of KeyVault key.
     *
     * @param keyVersion the keyVersion value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the Uri of KeyVault.
     *
     * @return the keyVaultUri value
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the Uri of KeyVault.
     *
     * @param keyVaultUri the keyVaultUri value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

}
