/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05_uf2_examen_final;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Adria
 */
public class AvaluadorTest1 {
    
    private Avaluador instance;
    private Estudiant Estudiant;
    
    

    
    public AvaluadorTest1() {
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
        Estudiant [] Estudiants = new Estudiant[] {
            new Estudiant("Adria", 7.0, 6.0, 5.0), 
            new Estudiant("Edurne", 8.0, 7.0, 9.0),
            new Estudiant("Nicolas", 4.0, 3.0, 6.0)};
        
        assertEquals(Estudiants[1],instance.millorEstudiantPerNotaMitjana(Estudiants));
    }
    
}
