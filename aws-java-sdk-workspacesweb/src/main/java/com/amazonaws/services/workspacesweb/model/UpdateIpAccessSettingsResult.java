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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIpAccessSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIpAccessSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IP access settings.
     * </p>
     */
    private IpAccessSettings ipAccessSettings;

    /**
     * <p>
     * The IP access settings.
     * </p>
     * 
     * @param ipAccessSettings
     *        The IP access settings.
     */

    public void setIpAccessSettings(IpAccessSettings ipAccessSettings) {
        this.ipAccessSettings = ipAccessSettings;
    }

    /**
     * <p>
     * The IP access settings.
     * </p>
     * 
     * @return The IP access settings.
     */

    public IpAccessSettings getIpAccessSettings() {
        return this.ipAccessSettings;
    }

    /**
     * <p>
     * The IP access settings.
     * </p>
     * 
     * @param ipAccessSettings
     *        The IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpAccessSettingsResult withIpAccessSettings(IpAccessSettings ipAccessSettings) {
        setIpAccessSettings(ipAccessSettings);
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
        if (getIpAccessSettings() != null)
            sb.append("IpAccessSettings: ").append(getIpAccessSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIpAccessSettingsResult == false)
            return false;
        UpdateIpAccessSettingsResult other = (UpdateIpAccessSettingsResult) obj;
        if (other.getIpAccessSettings() == null ^ this.getIpAccessSettings() == null)
            return false;
        if (other.getIpAccessSettings() != null && other.getIpAccessSettings().equals(this.getIpAccessSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAccessSettings() == null) ? 0 : getIpAccessSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIpAccessSettingsResult clone() {
        try {
            return (UpdateIpAccessSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
