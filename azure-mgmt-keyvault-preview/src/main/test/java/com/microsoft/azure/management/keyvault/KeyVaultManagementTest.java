/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.keyvault;

import com.microsoft.azure.management.keyvault.implementation.KeyVaultManager;
import com.microsoft.azure.management.resources.core.TestBase;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.rest.RestClient;

/**
 * The base for KeyVault manager tests.
 */
public class KeyVaultManagementTest extends TestBase {
    protected static ResourceManager resourceManager;
    protected static KeyVaultManager keyVaultManager;
    protected static String RG_NAME = "";
    protected static String VAULT_NAME = "";

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {

        resourceManager = ResourceManager
                .authenticate(restClient)
                .withSubscription(defaultSubscription);

        keyVaultManager = KeyVaultManager
                .authenticate(restClient, defaultSubscription);
    }

    @Override
    protected void cleanUpResources() {
        if (RG_NAME != "") {
            resourceManager.resourceGroups().beginDeleteByName(RG_NAME);
        }
    }
}
