/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05_uf2_examen_final;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author Adria
 */
@RunWith(Parameterized.class)
public class AvaluadorTest2 {

    private Avaluador instance;
    
    @Parameter(0)
    public Estudiant estudiant;
    @Parameter(1)
    public double mitjana;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object [][]{
            {new Estudiant ("Nicolas",4.0,6.0,8.0), 6},
            {new Estudiant ("Adria",4.0,7.0,8.0), 6.33},
            {new Estudiant ("Edurne",4.0,8.0,9.0), 7},
            {new Estudiant ("Juan",3.0,2.0,7.0), 4},
            {new Estudiant ("Jorge",5.0,6.0,5.0), 5.33},
            {new Estudiant ("Ivan",2.0,1.0,8.0), 3.66},
            {new Estudiant ("Alejandro",7.0,6.0,5.0), 6},
            {new Estudiant ("Iker",6.0,6.0,6.0), 6},
            {new Estudiant ("Abilio",3.0,7.0,8.0), 6},
            {new Estudiant ("Olga",9.0,6.0,6.0), 7},
            {new Estudiant ("Adam",2.0,9.0,1.0), 4},
            {new Estudiant ("David",6.0,2.0,2.0), 3.33},
            {new Estudiant ("Maria",7.0,6.0,7.0), 6.66},
            {new Estudiant ("Alfonso",8.0,4.0,9.0), 7},
            {new Estudiant ("Antonio",1.0,7.0,5.0), 4.33}

        };
        
        return Arrays.asList(data);
    }
    
    public AvaluadorTest2() {
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
        assertEquals(mitjana, instance.mitjanaSiSupera(estudiant),1.0E-1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(mitjana, instance.mitjana(estudiant),1.0E-1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() throws Exception {
    }
    
}
