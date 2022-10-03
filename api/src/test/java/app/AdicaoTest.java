package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdicaoTest {
    
    @Test
    public void verificaSomaNegativo(){
        Adicao adicao = new Adicao();
        double resultado = adicao.calcula("5", "-3");
        assertEquals(2, resultado);
    }

    @Test
    public void verificaSomaDecimal(){
        Adicao adicao = new Adicao();
        double resultado = adicao.calcula("5.5", "10.5");
        assertEquals(16, resultado);
    }
}