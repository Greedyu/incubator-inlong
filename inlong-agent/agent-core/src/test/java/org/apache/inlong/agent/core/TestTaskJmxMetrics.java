/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.agent.core;

import org.apache.inlong.agent.metrics.AgentJmxMetricListener;
import org.apache.inlong.agent.metrics.task.TaskJmxMetrics;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestTaskJmxMetrics {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgentBaseTestsHelper.class);

    @Test
    public void testAgentMetrics() {
        try {
            TaskJmxMetrics taskJmxMetrics = (TaskJmxMetrics) new AgentJmxMetricListener().taskMetrics;
            taskJmxMetrics.incRetryingTaskCount();
            Assert.assertEquals(taskJmxMetrics.module, "AgentTaskMetric");
        } catch (Exception ex) {
            LOGGER.error("error happens" + ex);
        }
    }

}
