/*
 * Copyright (c)  2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.extension.siddhi.execution.math;

import org.wso2.siddhi.annotation.Example;
import org.wso2.siddhi.annotation.Extension;
import org.wso2.siddhi.annotation.Parameter;
import org.wso2.siddhi.annotation.ReturnAttribute;
import org.wso2.siddhi.annotation.util.DataType;
import org.wso2.siddhi.core.config.SiddhiAppContext;
import org.wso2.siddhi.core.exception.SiddhiAppRuntimeException;
import org.wso2.siddhi.core.executor.ExpressionExecutor;
import org.wso2.siddhi.core.executor.function.FunctionExecutor;
import org.wso2.siddhi.core.util.config.ConfigReader;
import org.wso2.siddhi.query.api.definition.Attribute;
import org.wso2.siddhi.query.api.exception.SiddhiAppValidationException;

import java.util.Map;

/**
 * to_radians(a)
 * Converts a from degrees to radians.
 * 1 degrees = Pi / 180 = 0.005555556Pi = 0.0174532925 rad
 * Accept Type(s) :DOUBLE/INT/FLOAT/LONG
 * Return Type(s): DOUBLE
 */
@Extension(
        name = "toRadians",
        namespace = "math",
        description = "This function converts the value given in degrees to radians. It wraps the `java.lang.Math" +
                ".toRadians()` function.",
        parameters = {
                @Parameter(
                        name = "p1",
                        description = "The input value in degrees that should be converted to radians.",
                        type = {DataType.INT, DataType.LONG, DataType.FLOAT, DataType.DOUBLE})},
        returnAttributes = @ReturnAttribute(
                description = "The value in radians after converting the input from degrees." ,
                type = {DataType.DOUBLE}),
        examples = @Example(
                syntax = "define stream InValueStream (inValue double); \n" +
                        "from InValueStream \n" +
                        "select math:toRadians(inValue) as radiansValue \n" +
                        "insert into OutMediationStream;",
                description = "This function converts the input, from degrees to radians and " +
                        "directs the result to 'OutMediationStream' output stream. For example, " +
                        "toRadians(6d) returns 0.10471975511965977.")
)
public class ToRadiansFunctionExtension extends FunctionExecutor {
    @Override
    protected void init(ExpressionExecutor[] expressionExecutors, ConfigReader configReader,
                        SiddhiAppContext siddhiAppContext) {
        if (attributeExpressionExecutors.length != 1) {
            throw new SiddhiAppValidationException("Invalid no of arguments passed to math:to_radians() function, " +
                    "required 1, but found " + attributeExpressionExecutors.length);
        }
        Attribute.Type attributeType = attributeExpressionExecutors[0].getReturnType();
        if (!((attributeType == Attribute.Type.DOUBLE)
                || (attributeType == Attribute.Type.INT)
                || (attributeType == Attribute.Type.FLOAT)
                || (attributeType == Attribute.Type.LONG))) {
            throw new SiddhiAppValidationException("Invalid parameter type found for the argument of " +
                    "math:to_radians() function, required " + Attribute.Type.INT + " or " + Attribute.Type.LONG +
                    " or " + Attribute.Type.FLOAT + " or " + Attribute.Type.DOUBLE +
                    ", but found " + attributeType.toString());
        }
    }

    @Override
    protected Object execute(Object[] data) {
        return null;    // This method won't get called. Hence, unimplemented.
    }

    @Override
    protected Object execute(Object data) {
        if (data != null) {
            //type-conversion
            if (data instanceof Integer) {
                int inputInt = (Integer) data;
                return Math.toRadians((double) inputInt);
            } else if (data instanceof Long) {
                long inputLong = (Long) data;
                return Math.toRadians((double) inputLong);
            } else if (data instanceof Float) {
                float inputFloat = (Float) data;
                return Math.toRadians((double) inputFloat);
            } else if (data instanceof Double) {
                return Math.toRadians((Double) data);
            }
        } else {
            throw new SiddhiAppRuntimeException("Input to the math:to_radians() function cannot be null");
        }
        return null;
    }

    @Override
    public Attribute.Type getReturnType() {
        return Attribute.Type.DOUBLE;
    }

    @Override
    public Map<String, Object> currentState() {
        return null;
    }

    @Override
    public void restoreState(Map<String, Object> map) {

    }
}
