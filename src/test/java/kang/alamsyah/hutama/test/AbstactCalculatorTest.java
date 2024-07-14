package kang.alamsyah.hutama.test;

import kang.alamsyah.hutama.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})

public class AbstactCalculatorTest {

    protected Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
    }
}
