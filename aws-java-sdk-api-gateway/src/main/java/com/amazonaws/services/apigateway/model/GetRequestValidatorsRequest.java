/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRequestValidatorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of returned results per page.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorsRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @return The current pagination position in the paged result set.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorsRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page.
     * </p>
     * 
     * @return The maximum number of returned results per page.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRequestValidatorsRequest == false)
            return false;
        GetRequestValidatorsRequest other = (GetRequestValidatorsRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetRequestValidatorsRequest clone() {
        return (GetRequestValidatorsRequest) super.clone();
    }

}
