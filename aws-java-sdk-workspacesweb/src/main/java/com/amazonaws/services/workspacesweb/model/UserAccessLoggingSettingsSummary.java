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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of user access logging settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UserAccessLoggingSettingsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserAccessLoggingSettingsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Kinesis stream.
     * </p>
     */
    private String kinesisStreamArn;
    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     */
    private String userAccessLoggingSettingsArn;

    /**
     * <p>
     * The ARN of the Kinesis stream.
     * </p>
     * 
     * @param kinesisStreamArn
     *        The ARN of the Kinesis stream.
     */

    public void setKinesisStreamArn(String kinesisStreamArn) {
        this.kinesisStreamArn = kinesisStreamArn;
    }

    /**
     * <p>
     * The ARN of the Kinesis stream.
     * </p>
     * 
     * @return The ARN of the Kinesis stream.
     */

    public String getKinesisStreamArn() {
        return this.kinesisStreamArn;
    }

    /**
     * <p>
     * The ARN of the Kinesis stream.
     * </p>
     * 
     * @param kinesisStreamArn
     *        The ARN of the Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessLoggingSettingsSummary withKinesisStreamArn(String kinesisStreamArn) {
        setKinesisStreamArn(kinesisStreamArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettingsArn
     *        The ARN of the user access logging settings.
     */

    public void setUserAccessLoggingSettingsArn(String userAccessLoggingSettingsArn) {
        this.userAccessLoggingSettingsArn = userAccessLoggingSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     * 
     * @return The ARN of the user access logging settings.
     */

    public String getUserAccessLoggingSettingsArn() {
        return this.userAccessLoggingSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettingsArn
     *        The ARN of the user access logging settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessLoggingSettingsSummary withUserAccessLoggingSettingsArn(String userAccessLoggingSettingsArn) {
        setUserAccessLoggingSettingsArn(userAccessLoggingSettingsArn);
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
        if (getKinesisStreamArn() != null)
            sb.append("KinesisStreamArn: ").append(getKinesisStreamArn()).append(",");
        if (getUserAccessLoggingSettingsArn() != null)
            sb.append("UserAccessLoggingSettingsArn: ").append(getUserAccessLoggingSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAccessLoggingSettingsSummary == false)
            return false;
        UserAccessLoggingSettingsSummary other = (UserAccessLoggingSettingsSummary) obj;
        if (other.getKinesisStreamArn() == null ^ this.getKinesisStreamArn() == null)
            return false;
        if (other.getKinesisStreamArn() != null && other.getKinesisStreamArn().equals(this.getKinesisStreamArn()) == false)
            return false;
        if (other.getUserAccessLoggingSettingsArn() == null ^ this.getUserAccessLoggingSettingsArn() == null)
            return false;
        if (other.getUserAccessLoggingSettingsArn() != null && other.getUserAccessLoggingSettingsArn().equals(this.getUserAccessLoggingSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKinesisStreamArn() == null) ? 0 : getKinesisStreamArn().hashCode());
        hashCode = prime * hashCode + ((getUserAccessLoggingSettingsArn() == null) ? 0 : getUserAccessLoggingSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public UserAccessLoggingSettingsSummary clone() {
        try {
            return (UserAccessLoggingSettingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.UserAccessLoggingSettingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
