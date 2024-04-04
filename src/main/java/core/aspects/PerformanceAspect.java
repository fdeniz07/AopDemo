package core.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceAspect {
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";

    @Pointcut("@annotation(core.aspects.MeasureTime) && execution(* *(..))")
    public void measurePointCut() {

    }

    @Around("measurePointCut()")
    public void methodExecutionMeasure(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Die Methode 'around' in unserer Methodenausführung.");
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println(RED + (endTime - startTime) + " ms" + RESET);
    }
}
