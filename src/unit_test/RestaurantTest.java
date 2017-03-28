/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_test;

import cell.Restaurant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harum Lokawati
 */
public class RestaurantTest {
    
    public RestaurantTest() {
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
     * Test of Render method, of class Restaurant.
     */
    @Test
    public void testRender() {
        System.out.println("Render Restaurant");
        Restaurant instance = new Restaurant();
        instance.Render();
        System.out.println("expected : R");
        System.out.print("result : ");
        instance.Render();
        System.out.println();
    }

    /**
     * Test of GetType method, of class Restaurant.
     */
    @Test
    public void testGetType() {
        System.out.println("GetType");
        Restaurant instance = new Restaurant();
        String expResult = "Restaurant";
        String result = instance.GetType();
        assertEquals(expResult, result);
    }
    
}
