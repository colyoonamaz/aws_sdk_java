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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure containing configurations related to insights.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/InsightsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * </p>
     */
    private Boolean insightsEnabled;
    /**
     * <p>
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on
     * a group with InsightsEnabled set to true.
     * </p>
     */
    private Boolean notificationsEnabled;

    /**
     * <p>
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * </p>
     * 
     * @param insightsEnabled
     *        Set the InsightsEnabled value to true to enable insights or false to disable insights.
     */

    public void setInsightsEnabled(Boolean insightsEnabled) {
        this.insightsEnabled = insightsEnabled;
    }

    /**
     * <p>
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * </p>
     * 
     * @return Set the InsightsEnabled value to true to enable insights or false to disable insights.
     */

    public Boolean getInsightsEnabled() {
        return this.insightsEnabled;
    }

    /**
     * <p>
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * </p>
     * 
     * @param insightsEnabled
     *        Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightsConfiguration withInsightsEnabled(Boolean insightsEnabled) {
        setInsightsEnabled(insightsEnabled);
        return this;
    }

    /**
     * <p>
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * </p>
     * 
     * @return Set the InsightsEnabled value to true to enable insights or false to disable insights.
     */

    public Boolean isInsightsEnabled() {
        return this.insightsEnabled;
    }

    /**
     * <p>
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on
     * a group with InsightsEnabled set to true.
     * </p>
     * 
     * @param notificationsEnabled
     *        Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be
     *        enabled on a group with InsightsEnabled set to true.
     */

    public void setNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    /**
     * <p>
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on
     * a group with InsightsEnabled set to true.
     * </p>
     * 
     * @return Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be
     *         enabled on a group with InsightsEnabled set to true.
     */

    public Boolean getNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    /**
     * <p>
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on
     * a group with InsightsEnabled set to true.
     * </p>
     * 
     * @param notificationsEnabled
     *        Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be
     *        enabled on a group with InsightsEnabled set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightsConfiguration withNotificationsEnabled(Boolean notificationsEnabled) {
        setNotificationsEnabled(notificationsEnabled);
        return this;
    }

    /**
     * <p>
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on
     * a group with InsightsEnabled set to true.
     * </p>
     * 
     * @return Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be
     *         enabled on a group with InsightsEnabled set to true.
     */

    public Boolean isNotificationsEnabled() {
        return this.notificationsEnabled;
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
        if (getInsightsEnabled() != null)
            sb.append("InsightsEnabled: ").append(getInsightsEnabled()).append(",");
        if (getNotificationsEnabled() != null)
            sb.append("NotificationsEnabled: ").append(getNotificationsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightsConfiguration == false)
            return false;
        InsightsConfiguration other = (InsightsConfiguration) obj;
        if (other.getInsightsEnabled() == null ^ this.getInsightsEnabled() == null)
            return false;
        if (other.getInsightsEnabled() != null && other.getInsightsEnabled().equals(this.getInsightsEnabled()) == false)
            return false;
        if (other.getNotificationsEnabled() == null ^ this.getNotificationsEnabled() == null)
            return false;
        if (other.getNotificationsEnabled() != null && other.getNotificationsEnabled().equals(this.getNotificationsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightsEnabled() == null) ? 0 : getInsightsEnabled().hashCode());
        hashCode = prime * hashCode + ((getNotificationsEnabled() == null) ? 0 : getNotificationsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public InsightsConfiguration clone() {
        try {
            return (InsightsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.InsightsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
