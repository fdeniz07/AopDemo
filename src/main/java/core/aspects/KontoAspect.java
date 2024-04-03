package core.aspects;

import com.tutorial.aopdemo.service.KontoService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class KontoAspect {

    final int MIN_BETRAG = 10;

    @Before("execution(* com.tutorial.aopdemo.service.KontoService.abhebung(int)) && args(betrag)")
    public void bevorRueckzug(JoinPoint joinPoint, int betrag) {
        Object[] args = joinPoint.getArgs();
        KontoService kontoService = (KontoService) joinPoint.getTarget();
        System.out.println("Bevor Geld abheben (" + betrag + "€) : von der Konto: " + kontoService.getKontoStand() + "€");
    }

    @After("execution(* com.tutorial.aopdemo.service.KontoService.abhebung(int)) && args(betrag)")
    public void nachRueckzug(JoinPoint joinPoint, int betrag) {
        Object[] args = joinPoint.getArgs();
        KontoService kontoService = (KontoService) joinPoint.getTarget();
        System.out.println("Nach dem Geld abheben (" + betrag + "€) :  von der Konto: " + kontoService.getKontoStand() + "€");
    }
}
