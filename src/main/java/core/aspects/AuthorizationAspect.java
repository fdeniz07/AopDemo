package core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AuthorizationAspect {
    @Pointcut("execution(* com.tutorial.aopdemo.*.*(..))") // Alle Methoden in Paket com.example.jsf.controller.*
    private void controllerMethods() {} // Dieser Punkt schneidet alle Methoden im Paket JSF Controller ab

    @Before("controllerMethods()")
    public void checkAuthorization() {
        // Hier kommt der Code zur Überprüfung der Berechtigung des Benutzers
        // In diesem Beispiel geben wir nur eine einfache Nachricht aus
        System.out.println("Benutzerberechtigung überprüft.");
    }
}