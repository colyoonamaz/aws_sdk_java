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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListIdentityProvidersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListIdentityProvidersRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> PORTALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.GREEDY_PATH).marshallLocationName("portalArn").build();

    private static final ListIdentityProvidersRequestMarshaller instance = new ListIdentityProvidersRequestMarshaller();

    public static ListIdentityProvidersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListIdentityProvidersRequest listIdentityProvidersRequest, ProtocolMarshaller protocolMarshaller) {

        if (listIdentityProvidersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listIdentityProvidersRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listIdentityProvidersRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listIdentityProvidersRequest.getPortalArn(), PORTALARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
