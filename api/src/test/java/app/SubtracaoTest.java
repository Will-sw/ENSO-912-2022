package app;

import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.jupiter.api.BeforeEach;
 
public class SubtracaoTest {
   
    Subtracao sub;
   
    @BeforeEach
    public void Setup(){
        sub = new Subtracao();
    }
    @Test
    public void VerificarCasoBase(){
        double resultado = sub.calcula("7","5");
        assertEquals(2.0,resultado);
    }
 
    @Test
    public void VerificarSubtracaoNumeroNegativ(){
        double resultado = sub.calcula("-7","2");
        assertEquals(-9.0,resultado);
    }
}
