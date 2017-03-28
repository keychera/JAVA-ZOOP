/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_test;

import animal.Animal;
import location.Location;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import zoo.Cage;

/**
 *
 * @author Harum Lokawati
 */
public class CageTest {
    
    public CageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of GetSize method, of class Cage.
     */
    @Test
    public void testGetSize() {
        System.out.println("GetSize");
        Cage instance = new Cage();
        Integer expResult = null;
        Integer result = instance.GetSize();
        assertEquals(expResult, result);
        instance = new Cage("",10);
        result = instance.GetSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of GetArea method, of class Cage.
     */
    @Test
    public void testGetArea() {
        System.out.println("GetArea");
        Cage instance = new Cage();
        Location[] expResult = null;
        Location[] result = instance.GetArea();
        assertArrayEquals(expResult, result);
        instance = new Cage("",10);
        expResult = null;
        result = instance.GetArea();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of MovementManager method, of class Cage.
     */
    @Test
    public void testMovementManager() {
        System.out.println("MovementManager");
        Cage instance = new Cage();
        instance.MovementManager();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Move method, of class Cage.
     */
    @Test
    public void testMove() {
        System.out.println("Move");
        Animal A = null;
        int i = 0;
        Cage instance = new Cage();
        Location expResult = null;
        Location result = instance.Move(A, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsThereAnimal method, of class Cage.
     */
    @Test
    public void testIsThereAnimal() {
        System.out.println("IsThereAnimal");
        Location L = null;
        Cage instance = new Cage();
        boolean expResult = false;
        boolean result = instance.IsThereAnimal(L);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsInCage method, of class Cage.
     */
    @Test
    public void testIsInCage() {
        System.out.println("IsInCage");
        Location L = null;
        Cage instance = new Cage();
        boolean expResult = false;
        boolean result = instance.IsInCage(L);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddAnimal method, of class Cage.
     */
    @Test
    public void testAddAnimal() {
        System.out.println("AddAnimal");
        Animal A = null;
        Cage instance = new Cage();
        instance.AddAnimal(A);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAnimals method, of class Cage.
     */
    @Test
    public void testGetAnimals() {
        System.out.println("GetAnimals");
        Cage instance = new Cage();
        Animal[] expResult = null;
        Animal[] result = instance.GetAnimals();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetNAnimal method, of class Cage.
     */
    @Test
    public void testGetNAnimal() {
        System.out.println("GetNAnimal");
        Cage instance = new Cage();
        int expResult = 0;
        int result = instance.GetNAnimal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetHabitat method, of class Cage.
     */
    @Test
    public void testGetHabitat() {
        System.out.println("GetHabitat");
        Cage instance = new Cage();
        String expResult = "";
        String result = instance.GetHabitat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
