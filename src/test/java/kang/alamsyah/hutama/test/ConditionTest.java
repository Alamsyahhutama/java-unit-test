package kang.alamsyah.hutama.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

// @Tag("integration-test") fungsi unit test buat test berdasarkan tag yang disetting
public class ConditionTest {
    @Test
    void testSystemProoerties (){
        Properties properties =  System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    @EnabledOnOs ({OS.WINDOWS})
    public void testRunOnlyWindows(){
    }

    @Test
    @DisabledOnOs ({OS.WINDOWS})
    public void testDisabledOnlyWindows(){
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testEnableOnJava8 (){
    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    void testDisableOnJava8 (){
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
    void testEnableOnJava11To21 (){
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
    void testDisableOnJava11To21 (){
    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle.Corporation")
    })
    void testEnableOnJavaVendorOracle (){
    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle.Corporation")
    })
    void testDisabledOnJavaVendorOracle (){
    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void testEnabledOnProfileDEV (){
    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void testDisabledOnProfileDEV (){
    }
}
