/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workspacesweb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Portal JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortalJsonUnmarshaller implements Unmarshaller<Portal, JsonUnmarshallerContext> {

    public Portal unmarshall(JsonUnmarshallerContext context) throws Exception {
        Portal portal = new Portal();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("authenticationType", targetDepth)) {
                    context.nextToken();
                    portal.setAuthenticationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("browserSettingsArn", targetDepth)) {
                    context.nextToken();
                    portal.setBrowserSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("browserType", targetDepth)) {
                    context.nextToken();
                    portal.setBrowserType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    portal.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    portal.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipAccessSettingsArn", targetDepth)) {
                    context.nextToken();
                    portal.setIpAccessSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSettingsArn", targetDepth)) {
                    context.nextToken();
                    portal.setNetworkSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalArn", targetDepth)) {
                    context.nextToken();
                    portal.setPortalArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalEndpoint", targetDepth)) {
                    context.nextToken();
                    portal.setPortalEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalStatus", targetDepth)) {
                    context.nextToken();
                    portal.setPortalStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rendererType", targetDepth)) {
                    context.nextToken();
                    portal.setRendererType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    portal.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trustStoreArn", targetDepth)) {
                    context.nextToken();
                    portal.setTrustStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userAccessLoggingSettingsArn", targetDepth)) {
                    context.nextToken();
                    portal.setUserAccessLoggingSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userSettingsArn", targetDepth)) {
                    context.nextToken();
                    portal.setUserSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return portal;
    }

    private static PortalJsonUnmarshaller instance;

    public static PortalJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PortalJsonUnmarshaller();
        return instance;
    }
}
