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

public class ValidationUtils {

    public static void assertParamExistsAndNotEmpty(
            String functionName, String paramName, String paramValue) throws ApiException {
        ValidationUtils.assertParamExists(functionName, paramName, paramValue);
        if (paramValue.isEmpty()) {
            throw new ApiException(
                    400,
                    String.format(
                            "The required parameter '%s' was empty when calling '%s'",
                            paramName, functionName));
        }
    }

    public static void assertParamExists(String functionName, String paramName, Object paramValue)
            throws ApiException {
        if (paramValue == null) {
            throw new ApiException(
                    400,
                    String.format(
                            "The required parameter '%s' is missing from call to '%s'",
                            paramName, functionName));
        }
    }
}