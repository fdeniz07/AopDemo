package service;

import com.tutorial.aopdemo.console.ClassForTest;
import org.junit.jupiter.api.Test;

public class PerformanceAspectTest {

    @Test
    public void aspectRunTest() {
        ClassForTest classForTest = new ClassForTest();
        classForTest.simpleMethod();
        classForTest.simpleMethodWithSleeping();
    }
}
