/*
 * Fireblocks API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.6.2
 * Contact: support@fireblocks.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fireblocks.sdk;
import java.util.Map;
import java.util.Optional;

class SDKOptions {
    private Integer timeoutInMs;
    private Map<String, String> proxy;
    private Boolean anonymousPlatform;
    private String userAgent;

    public SDKOptions(Integer timeoutInMs, Map<String, String> proxy,
                      Boolean anonymousPlatform, String userAgent) {
        this.timeoutInMs = timeoutInMs;
        this.proxy = proxy;
        this.anonymousPlatform = anonymousPlatform;
        this.userAgent = userAgent;
    }

    public SDKOptions() {
        this.timeoutInMs = 10000;
        this.proxy = null;
        this.anonymousPlatform = null;
        this.userAgent = null;
    }


    public Integer getTimeoutInMs() {
        return timeoutInMs;
    }

    public void setTimeoutInMs(Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
    }

    public Map<String, String> getProxy() {
        return proxy;
    }

    public void setProxy(Map<String, String> proxy) {
        this.proxy = proxy;
    }

    public Boolean getAnonymousPlatform() {
        return anonymousPlatform;
    }

    public void setAnonymousPlatform(Boolean anonymousPlatform) {
        this.anonymousPlatform = anonymousPlatform;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

}

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configuration {
    public static final String VERSION = "1.6.2";
    private String basePath;
    private String apiKey;
    private String secretKey;
    private SDKOptions options;
    public Configuration(){
        this.options = new SDKOptions();
    }

    public Configuration(String basePath, String apiKey, String secretKey, SDKOptions options){
        this.basePath = basePath;
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.options = options;
    }

    public void setBasePath(String basePath){
        this.basePath = basePath;
    }

    public void setOptions(SDKOptions options){
        this.options = options;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public void setSecretKey(String secretKey){
        this.secretKey = secretKey;
    }

    public String getBasePath(){
        return this.basePath;
    }

    public String getApiKey(){
        return this.apiKey;
    }

    public String getSecretKey(){
        return this.secretKey;
    }

    public SDKOptions getOptions(){
        return this.options;
    }

}
