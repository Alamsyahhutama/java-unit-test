package kang.alamsyah.hutama.test;


import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class SlowTest {

    @Execution(ExecutionMode.CONCURRENT)

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void TestSlow1() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void TestSlow2() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void TestSlow3() throws InterruptedException {
        Thread.sleep(4_000);
    }
}
