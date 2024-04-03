package service;

import com.tutorial.aopdemo.service.KontoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KontoUnitTest {

    private KontoService kontoService;

    @BeforeEach
    public void before() {
        kontoService = new KontoService();
    }

    @Test
    public void guthaben_20_Auszahlung_Negativ_thenFail() {
        assertFalse(kontoService.abhebung(-10));
    }

    @Test
    public void guthaben_20_Auszahlung_5_thenSuccess() {
        assertTrue(kontoService.abhebung(5));
    }

    @Test
    public void guthaben_20_Auszahlung_20_thenSuccess() {
        assertTrue(kontoService.abhebung(20));
    }

    @Test
    public void guthaben_20__Auszahlung_100_thenFail() {
        assertFalse(kontoService.abhebung(100));
    }
}
