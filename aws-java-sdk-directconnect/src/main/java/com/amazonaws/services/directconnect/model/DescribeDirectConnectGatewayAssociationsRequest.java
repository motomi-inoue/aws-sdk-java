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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DescribeDirectConnectGatewayAssociations operation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectConnectGatewayAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String virtualGatewayId;
    /**
     * <p>
     * The maximum number of direct connect gateway associations to return per page.
     * </p>
     * <p>
     * Example: 15
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token provided in the previous describe result to retrieve the next page of the result.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the direct connect gateway.</p>
     *        <p>
     *        Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the direct connect gateway.</p>
     *         <p>
     *         Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the direct connect gateway.</p>
     *        <p>
     *        Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.</p>
     *        <p>
     *        Example: "vgw-abc123ef"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the virtual private gateway.</p>
     *         <p>
     *         Example: "vgw-abc123ef"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.</p>
     *        <p>
     *        Example: "vgw-abc123ef"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * <p>
     * The maximum number of direct connect gateway associations to return per page.
     * </p>
     * <p>
     * Example: 15
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param maxResults
     *        The maximum number of direct connect gateway associations to return per page.</p>
     *        <p>
     *        Example: 15
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of direct connect gateway associations to return per page.
     * </p>
     * <p>
     * Example: 15
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The maximum number of direct connect gateway associations to return per page.</p>
     *         <p>
     *         Example: 15
     *         </p>
     *         <p>
     *         Default: None
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of direct connect gateway associations to return per page.
     * </p>
     * <p>
     * Example: 15
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param maxResults
     *        The maximum number of direct connect gateway associations to return per page.</p>
     *        <p>
     *        Example: 15
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token provided in the previous describe result to retrieve the next page of the result.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param nextToken
     *        The token provided in the previous describe result to retrieve the next page of the result.</p>
     *        <p>
     *        Default: None
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token provided in the previous describe result to retrieve the next page of the result.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The token provided in the previous describe result to retrieve the next page of the result.</p>
     *         <p>
     *         Default: None
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token provided in the previous describe result to retrieve the next page of the result.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param nextToken
     *        The token provided in the previous describe result to retrieve the next page of the result.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAssociationsRequest == false)
            return false;
        DescribeDirectConnectGatewayAssociationsRequest other = (DescribeDirectConnectGatewayAssociationsRequest) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectConnectGatewayAssociationsRequest clone() {
        return (DescribeDirectConnectGatewayAssociationsRequest) super.clone();
    }

}
