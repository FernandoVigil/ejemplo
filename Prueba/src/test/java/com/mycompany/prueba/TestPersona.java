/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class TestPersona {

    public static Persona p;
    public static Persona pNull;

    public TestPersona() {
    }

    @BeforeClass
    public static void setUpClass() {
        p = new Persona();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void persona() {
        System.out.println("Test clase Persona");
        p.nombre = "holaqwqw";
        assertTrue(p.getNombre().length() > 5);
    }

    @Test(expected = NullPointerException.class)
    public void personaVacio() {
        System.out.println("Test clase Persona");
        pNull.setNombre(null);
        pNull.getNombre().toUpperCase();
    }
}
