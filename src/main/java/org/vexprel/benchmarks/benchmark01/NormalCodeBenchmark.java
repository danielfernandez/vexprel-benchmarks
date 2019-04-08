package org.vexprel.benchmarks.benchmark01;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;

public class NormalCodeBenchmark extends BaseBenchmark {

    private User user;


    @Setup
    public void setup() throws Exception {
        this.user = buildUser();
    }


    @Benchmark
    public String benchmark() throws Exception {
        return this.user.getName();
    }

}
