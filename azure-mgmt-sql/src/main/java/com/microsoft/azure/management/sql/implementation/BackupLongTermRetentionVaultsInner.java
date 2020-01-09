/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupLongTermRetentionVaults.
 */
public class BackupLongTermRetentionVaultsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupLongTermRetentionVaultsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of BackupLongTermRetentionVaultsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupLongTermRetentionVaultsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(BackupLongTermRetentionVaultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupLongTermRetentionVaults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupLongTermRetentionVaultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionVaults get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/backupLongTermRetentionVaults/{backupLongTermRetentionVaultName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("backupLongTermRetentionVaultName") String backupLongTermRetentionVaultName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionVaults createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/backupLongTermRetentionVaults/{backupLongTermRetentionVaultName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("backupLongTermRetentionVaultName") String backupLongTermRetentionVaultName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body BackupLongTermRetentionVaultInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionVaults beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/backupLongTermRetentionVaults/{backupLongTermRetentionVaultName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("backupLongTermRetentionVaultName") String backupLongTermRetentionVaultName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body BackupLongTermRetentionVaultInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.BackupLongTermRetentionVaults listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/backupLongTermRetentionVaults")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupLongTermRetentionVaultInner object if successful.
     */
    public BackupLongTermRetentionVaultInner get(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupLongTermRetentionVaultInner> getAsync(String resourceGroupName, String serverName, final ServiceCallback<BackupLongTermRetentionVaultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionVaultInner object
     */
    public Observable<BackupLongTermRetentionVaultInner> getAsync(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<BackupLongTermRetentionVaultInner>, BackupLongTermRetentionVaultInner>() {
            @Override
            public BackupLongTermRetentionVaultInner call(ServiceResponse<BackupLongTermRetentionVaultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionVaultInner object
     */
    public Observable<ServiceResponse<BackupLongTermRetentionVaultInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String backupLongTermRetentionVaultName = "RegisteredVault";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, backupLongTermRetentionVaultName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupLongTermRetentionVaultInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupLongTermRetentionVaultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupLongTermRetentionVaultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupLongTermRetentionVaultInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupLongTermRetentionVaultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupLongTermRetentionVaultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupLongTermRetentionVaultInner object if successful.
     */
    public BackupLongTermRetentionVaultInner createOrUpdate(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, recoveryServicesVaultResourceId).toBlocking().last().body();
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupLongTermRetentionVaultInner> createOrUpdateAsync(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId, final ServiceCallback<BackupLongTermRetentionVaultInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, recoveryServicesVaultResourceId), serviceCallback);
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<BackupLongTermRetentionVaultInner> createOrUpdateAsync(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, recoveryServicesVaultResourceId).map(new Func1<ServiceResponse<BackupLongTermRetentionVaultInner>, BackupLongTermRetentionVaultInner>() {
            @Override
            public BackupLongTermRetentionVaultInner call(ServiceResponse<BackupLongTermRetentionVaultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<BackupLongTermRetentionVaultInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (recoveryServicesVaultResourceId == null) {
            throw new IllegalArgumentException("Parameter recoveryServicesVaultResourceId is required and cannot be null.");
        }
        final String backupLongTermRetentionVaultName = "RegisteredVault";
        final String apiVersion = "2014-04-01";
        BackupLongTermRetentionVaultInner parameters = new BackupLongTermRetentionVaultInner();
        parameters.withRecoveryServicesVaultResourceId(recoveryServicesVaultResourceId);
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, backupLongTermRetentionVaultName, apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<BackupLongTermRetentionVaultInner>() { }.getType());
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackupLongTermRetentionVaultInner object if successful.
     */
    public BackupLongTermRetentionVaultInner beginCreateOrUpdate(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, recoveryServicesVaultResourceId).toBlocking().single().body();
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackupLongTermRetentionVaultInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId, final ServiceCallback<BackupLongTermRetentionVaultInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, recoveryServicesVaultResourceId), serviceCallback);
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionVaultInner object
     */
    public Observable<BackupLongTermRetentionVaultInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, recoveryServicesVaultResourceId).map(new Func1<ServiceResponse<BackupLongTermRetentionVaultInner>, BackupLongTermRetentionVaultInner>() {
            @Override
            public BackupLongTermRetentionVaultInner call(ServiceResponse<BackupLongTermRetentionVaultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a server backup long term retention vault.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recoveryServicesVaultResourceId The azure recovery services vault resource id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackupLongTermRetentionVaultInner object
     */
    public Observable<ServiceResponse<BackupLongTermRetentionVaultInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String recoveryServicesVaultResourceId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (recoveryServicesVaultResourceId == null) {
            throw new IllegalArgumentException("Parameter recoveryServicesVaultResourceId is required and cannot be null.");
        }
        final String backupLongTermRetentionVaultName = "RegisteredVault";
        final String apiVersion = "2014-04-01";
        BackupLongTermRetentionVaultInner parameters = new BackupLongTermRetentionVaultInner();
        parameters.withRecoveryServicesVaultResourceId(recoveryServicesVaultResourceId);
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, backupLongTermRetentionVaultName, apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackupLongTermRetentionVaultInner>>>() {
                @Override
                public Observable<ServiceResponse<BackupLongTermRetentionVaultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackupLongTermRetentionVaultInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackupLongTermRetentionVaultInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackupLongTermRetentionVaultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackupLongTermRetentionVaultInner>() { }.getType())
                .register(201, new TypeToken<BackupLongTermRetentionVaultInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets server backup long term retention vaults in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;BackupLongTermRetentionVaultInner&gt; object if successful.
     */
    public List<BackupLongTermRetentionVaultInner> listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets server backup long term retention vaults in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackupLongTermRetentionVaultInner>> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<List<BackupLongTermRetentionVaultInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets server backup long term retention vaults in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BackupLongTermRetentionVaultInner&gt; object
     */
    public Observable<List<BackupLongTermRetentionVaultInner>> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<BackupLongTermRetentionVaultInner>>, List<BackupLongTermRetentionVaultInner>>() {
            @Override
            public List<BackupLongTermRetentionVaultInner> call(ServiceResponse<List<BackupLongTermRetentionVaultInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets server backup long term retention vaults in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BackupLongTermRetentionVaultInner&gt; object
     */
    public Observable<ServiceResponse<List<BackupLongTermRetentionVaultInner>>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<BackupLongTermRetentionVaultInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<BackupLongTermRetentionVaultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackupLongTermRetentionVaultInner>> result = listByServerDelegate(response);
                        List<BackupLongTermRetentionVaultInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<BackupLongTermRetentionVaultInner>> clientResponse = new ServiceResponse<List<BackupLongTermRetentionVaultInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BackupLongTermRetentionVaultInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BackupLongTermRetentionVaultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BackupLongTermRetentionVaultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
