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
