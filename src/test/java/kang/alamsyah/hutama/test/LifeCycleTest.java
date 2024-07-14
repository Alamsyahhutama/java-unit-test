package kang.alamsyah.hutama.test;

import org.junit.jupiter.api.Test;

public class LifeCycleTest {
    private String temp;

    @Test
    void testA (){
        temp = "Alam";
    }

    @Test
    void testB (){
        System.out.println(temp);
    }
}
