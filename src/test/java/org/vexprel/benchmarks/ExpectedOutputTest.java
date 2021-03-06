/*
 * =============================================================================
 *
 *   Copyright (c) 2019, The VEXPREL team (http://www.vexprel.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.vexprel.benchmarks;

import org.vexprel.benchmarks.benchmark01.ByteBuddyGetterBenchmark;
import org.vexprel.benchmarks.benchmark01.IntrospectionMethodBenchmark;
import org.vexprel.benchmarks.benchmark01.NormalCodeBenchmark;
import org.junit.Assert;
import org.junit.Test;

public class ExpectedOutputTest {

    @Test
    public void testNormalCode() throws Exception {
        final NormalCodeBenchmark bench = new NormalCodeBenchmark();
        bench.setup();
        Assert.assertEquals(bench.buildUser().getName(), bench.benchmark());
    }


    @Test
    public void testIntrospectionMethod() throws Exception {
        final IntrospectionMethodBenchmark bench = new IntrospectionMethodBenchmark();
        bench.setup();
        Assert.assertEquals(bench.buildUser().getName(), bench.benchmark());
    }


    @Test
    public void testByteBuddyGetter() throws Exception {
        final ByteBuddyGetterBenchmark bench = new ByteBuddyGetterBenchmark();
        bench.setup();
        Assert.assertEquals(bench.buildUser().getName(), bench.benchmark());
    }


}
