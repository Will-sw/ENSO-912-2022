package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class DivisaoTest {

    Divisao divide;

    @BeforeEach
    public void Setup(){
        divide = new Divisao();
    }
    
    @Test
    public void VerificarCasoBase(){
        Setup();
        double resultado = divide.calculaDivisao(12,2);
        assertEquals(6.0,resultado);
    }

    @Test
    public void VerificarDivisaoNumeroNegativ(){
        Setup();
        double resultado = divide.calculaDivisao(-8,2);
        assertEquals(-4.0,resultado);
    }
}