/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author a21mariopm
 */
public class ContadorAscendenteTest {
    
    public ContadorAscendenteTest() {
    }

    /**
     * Test of incrementar method, of class ContadorAscendente.
     */
    @Test
    public void testIncrementar() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(900);
        int expResult = 901;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }

    /**
     * Test of reiniciar method, of class ContadorAscendente.
     */
    @Test
    public void testReiniciar() {
        System.out.println("reiniciar");
        ContadorAscendente instance = new ContadorAscendente(900);
        instance.reiniciar();
    }

    /**
     * Test of cambiarValor method, of class ContadorAscendente.
     */
    @Test
    public void testCambiarValor() {
        System.out.println("cambiarValor");
        int modificador = 2;
        ContadorAscendente instance = new ContadorAscendente(1);
        int expResult = 3;
        int result = instance.cambiarValor(modificador);
        assertEquals(expResult, result);
    }


    /**
     * Test of toString method, of class ContadorAscendente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContadorAscendente instance = new ContadorAscendente(900);
        String expResult = "ContadorAscendente{" + "valorActual=" + 900 + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
