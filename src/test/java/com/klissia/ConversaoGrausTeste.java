package com.klissia;

import static org.junit.Assert.*;
import org.junit.Test;


public class ConversaoGrausTeste {
   @Test
    public void testConversao(){
        float c = 40;
        float valorEsperado = 104;
        float valorRetornado = ConversaoGraus.CalcularFahr(c);
		assertEquals(valorEsperado, valorRetornado);
    }
}
