package core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    // ANSI escape code constants for text colors
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";

    //  @Before("execution(* com.tutorial.aopdemo.*.*(..))")
    @Before("execution(* *(..))") // Zielt auf alle Methoden im Paket
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(RED + "Methode aufgerufen: " + YELLOW + joinPoint.getSignature().getName() + RESET);
//        System.out.println(GREEN + "*************************************************************************" + RESET);
    }

    @AfterReturning(pointcut = "execution(* *(..))", returning = "result") // Nach erfolgreichem Abschluss der Methode
//  @AfterReturning(pointcut = "execution(* com.tutorial.aopdemo.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println(BLUE + "Methode erfolgreich abgeschlossen: " + YELLOW + joinPoint.getSignature().getName() + BLUE + " - Rückgabewert: " + PURPLE + result);
        System.out.println(GREEN + "*************************************************************************" + RESET);
    }

    // @AfterThrowing(pointcut = "execution(* com.tutorial.aopdemo.*.*(..))", throwing = "exception")
    // Wenn die Methode eine Ausnahme wirft
    @AfterThrowing(pointcut = "execution(* com.tutorial.aopdemo.service.KontoService.abhebung(int))", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println(RED + "Methode hat eine Ausnahme ausgelöst: " + YELLOW + joinPoint.getSignature().getName() + " - Fehler: " + exception + RESET);
        System.out.println(RED + "Fehler: " + YELLOW + exception.getMessage() + CYAN + " Exception handled by aspect." + RESET);
        System.out.println(GREEN + "*************************************************************************" + RESET);
    }
}
