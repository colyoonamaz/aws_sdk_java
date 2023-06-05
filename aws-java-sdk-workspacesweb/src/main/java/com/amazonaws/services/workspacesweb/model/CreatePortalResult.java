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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreatePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePortalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     */
    private String portalArn;
    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     */
    private String portalEndpoint;

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     */

    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @return The ARN of the web portal.
     */

    public String getPortalArn() {
        return this.portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withPortalArn(String portalArn) {
        setPortalArn(portalArn);
        return this;
    }

    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     * 
     * @param portalEndpoint
     *        The endpoint URL of the web portal that users access in order to start streaming sessions.
     */

    public void setPortalEndpoint(String portalEndpoint) {
        this.portalEndpoint = portalEndpoint;
    }

    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     * 
     * @return The endpoint URL of the web portal that users access in order to start streaming sessions.
     */

    public String getPortalEndpoint() {
        return this.portalEndpoint;
    }

    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     * 
     * @param portalEndpoint
     *        The endpoint URL of the web portal that users access in order to start streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withPortalEndpoint(String portalEndpoint) {
        setPortalEndpoint(portalEndpoint);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPortalArn() != null)
            sb.append("PortalArn: ").append(getPortalArn()).append(",");
        if (getPortalEndpoint() != null)
            sb.append("PortalEndpoint: ").append(getPortalEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortalResult == false)
            return false;
        CreatePortalResult other = (CreatePortalResult) obj;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        if (other.getPortalEndpoint() == null ^ this.getPortalEndpoint() == null)
            return false;
        if (other.getPortalEndpoint() != null && other.getPortalEndpoint().equals(this.getPortalEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode + ((getPortalEndpoint() == null) ? 0 : getPortalEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreatePortalResult clone() {
        try {
            return (CreatePortalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
