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


import java.util.Optional;

public class UserAgentUtil {

    public static String getUserAgent(AdditionalOptions additionalOptions) {
        String sdkVersion = "1.1.0";
        String userAgent = "fireblocks/sdk/java/" + sdkVersion;
        if (!Optional.ofNullable(additionalOptions)
                .map(AdditionalOptions::isAnonymousPlatform)
                .orElse(false)) {
            String osType = SystemWrapper.getProperty("os.name");
            String osVersion = SystemWrapper.getProperty("os.version");
            String osArch = SystemWrapper.getProperty("os.arch");

            userAgent += " (" + osType + " " + osVersion + "; " + osArch + ")";
        }

        if (Optional.ofNullable(additionalOptions)
                .map(AdditionalOptions::getUserAgent)
                .isPresent()) {
            String customUserAgent = additionalOptions.getUserAgent();
            userAgent = customUserAgent + " " + userAgent;
        }

        return userAgent;
    }
}
