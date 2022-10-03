package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class MultiplicacaoTest {
    
    Multiplicacao mult;
    
    @BeforeEach
    public void Setup(){
        mult = new Multiplicacao();
    }
    @Test
    public void VerificarCasoBase(){
        double resultado = mult.calcula("2","2");
        assertEquals(4.0,resultado);
    }

    @Test
    public void VerificarMultiplicacaoNumeroNegativ(){
        double resultado = mult.calcula("-2","2");
        assertEquals(-4.0,resultado);
    }
}
