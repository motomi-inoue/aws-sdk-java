/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineMetadataMarshaller {

    private static final MarshallingInfo<String> PIPELINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineArn").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").build();
    private static final MarshallingInfo<java.util.Date> UPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updated").build();

    private static final PipelineMetadataMarshaller instance = new PipelineMetadataMarshaller();

    public static PipelineMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineMetadata pipelineMetadata, ProtocolMarshaller protocolMarshaller) {

        if (pipelineMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineMetadata.getPipelineArn(), PIPELINEARN_BINDING);
            protocolMarshaller.marshall(pipelineMetadata.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(pipelineMetadata.getUpdated(), UPDATED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
