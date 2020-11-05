/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05_uf2_examen_final;

import java.security.InvalidParameterException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 *
 * @author Adria
 */
public class AvaluadorTest3 {
    
    private Avaluador instance;
    private Estudiant Estudiant;
    
    @Rule
    public Timeout globalTimeout = Timeout.millis(250);
    
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    
    
    public AvaluadorTest3() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando Test...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando Test...");
    }
    
    @Before
    public void setUp() {
        instance = new Avaluador();
        
        Estudiant = new Estudiant("Adria", 3.0, 6.0, 8.0);
        
    }
    
    @After
    public void tearDown() {
        instance = null;
        
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        thrown.expect(Exception.class);
            thrown.expectCause(Is.isA(InvalidParameterException.class));
            thrown.expectMessage(CoreMatchers.startsWith("Alguna de les notes no supera '5'"));
        assertEquals(6.33,instance.mitjanaSiSupera(Estudiant), 1.0E-1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(5.66, instance.mitjana(Estudiant), 1.0E-1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana()throws Exception {
//           assertEquals(7.00, instance.mitjana(Estudiant), 1.0E-1);     
    }
    
}
