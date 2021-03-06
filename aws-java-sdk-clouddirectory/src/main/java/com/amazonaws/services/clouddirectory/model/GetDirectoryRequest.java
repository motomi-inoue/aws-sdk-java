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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDirectoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the directory.
     * </p>
     */
    private String directoryArn;

    /**
     * <p>
     * The ARN of the directory.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory.
     * </p>
     * 
     * @return The ARN of the directory.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDirectoryRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDirectoryRequest == false)
            return false;
        GetDirectoryRequest other = (GetDirectoryRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        return hashCode;
    }

    @Override
    public GetDirectoryRequest clone() {
        return (GetDirectoryRequest) super.clone();
    }

}
