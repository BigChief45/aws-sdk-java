/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the successful termination of the execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ExecutionSucceededEventDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionSucceededEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON data output by the execution.
     * </p>
     */
    private String output;

    /**
     * <p>
     * The JSON data output by the execution.
     * </p>
     * 
     * @param output
     *        The JSON data output by the execution.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON data output by the execution.
     * </p>
     * 
     * @return The JSON data output by the execution.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON data output by the execution.
     * </p>
     * 
     * @param output
     *        The JSON data output by the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionSucceededEventDetails withOutput(String output) {
        setOutput(output);
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
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionSucceededEventDetails == false)
            return false;
        ExecutionSucceededEventDetails other = (ExecutionSucceededEventDetails) obj;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionSucceededEventDetails clone() {
        try {
            return (ExecutionSucceededEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.ExecutionSucceededEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
