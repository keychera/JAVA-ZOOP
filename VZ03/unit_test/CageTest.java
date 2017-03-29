/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_test;

import animal.Animal;
import animal_list.Cat;
import location.Location;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import zoo.Cage;

/**
 *
 * @author Harum Lokawati
 */
public class CageTest {
    private Cage C;
    
    @Before
    public void initialize() {
      C = new Cage("LandHabitat",10);
      for(int i = 0; i < C.GetSize(); i++)
      {
        C.GetArea()[i] = new Location (i,0);
      }
      Animal A = new Cat();
      C.AddAnimal(A);
    }

    /**
     * Test of GetSize method, of class Cage.
     */
    @Test
    public void testGetSize() {
        System.out.println("GetSize");
        Integer expResult = 10;
        Integer result = C.GetSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of MovementManager method, of class Cage.
     */
    @Test
    public void testMovementManager() {
        System.out.println("MovementManager");
        if(C.GetNAnimal()>0)
        {
          int X = C.GetAnimals()[C.GetNAnimal()-1].GetX();
          int Y = C.GetAnimals()[C.GetNAnimal()-1].GetY();
          C.MovementManager();
          System.out.format("before movement manager x: %d, y: %d \n", X,Y);
          System.out.format("after movement manager x: %d, y: %d \n", C.GetAnimals()[C.GetNAnimal()-1].GetX(),C.GetAnimals()[C.GetNAnimal()-1].GetY());
          assertTrue(C.GetAnimals()[C.GetNAnimal()-1].GetX()!=X);
          assertTrue(C.GetAnimals()[C.GetNAnimal()-1].GetY()==Y);
        }
    }

    /**
     * Test of Move method, of class Cage.
     */
    @Test
    public void testMove() {
        System.out.println("Move");
        Cage Ca = new Cage("LandHabitat",10);
        for(int i = 0; i < Ca.GetSize(); i++)
        {
          Ca.GetArea()[i] = new Location (i,0);
        }
        Animal B = new Cat();
        Ca.AddAnimal(B);
        System.out.println(Ca.GetNAnimal());
        Location result = new Location(Ca.GetAnimals()[Ca.GetNAnimal()-1].GetX(),Ca.GetAnimals()[Ca.GetNAnimal()-1].GetY());
        Location expResult = Ca.Move(Ca.GetAnimals()[Ca.GetNAnimal()-1], 0);
        System.out.format("MoveUp = before : (%d,%d) , after : (%d,%d)", expResult.x,expResult.y, result.x,result.y);
        System.out.println();
        expResult = Ca.Move(Ca.GetAnimals()[Ca.GetNAnimal()-1], 1);
        System.out.format("MoveRight = before : (%d,%d) , after : (%d,%d)", expResult.x,expResult.y, result.x,result.y);
        System.out.println();
        expResult = Ca.Move(Ca.GetAnimals()[Ca.GetNAnimal()-1], 2);
        System.out.format("MoveDown = before : (%d,%d) , after : (%d,%d)", expResult.x,expResult.y, result.x,result.y);
        System.out.println();
        expResult = Ca.Move(Ca.GetAnimals()[Ca.GetNAnimal()-1], 3);
        System.out.format("MoveLeft = before : (%d,%d) , after : (%d,%d)", expResult.x,expResult.y, result.x,result.y);
        System.out.println();
    }

    /**
     * Test of IsThereAnimal method, of class Cage.
     */
    @Test
    public void testIsThereAnimal() {
        System.out.println("IsThereAnimal");
        Location L = new Location(C.GetAnimals()[C.GetNAnimal()-1].GetX(),C.GetAnimals()[C.GetNAnimal()-1].GetY());
        boolean expResult = true;
        boolean result = C.IsThereAnimal(L);
        assertEquals(expResult, result);
        L.x -=1;
        result = C.IsThereAnimal(L);
        expResult = false;
        assertEquals(expResult, result);
    }

    /**
     * Test of IsInCage method, of class Cage.
     */
    @Test
    public void testIsInCage() {
        System.out.println("IsInCage");
        Location L = new Location(1,0);
        assertTrue(C.IsInCage(L));
        L.y = 1;
        assertFalse(C.IsInCage(L));
    }

    /**
     * Test of AddAnimal method, of class Cage.
     */
    @Test
    public void testAddAnimal() {
        System.out.println("AddAnimal");
        Animal NewAn = new Cat();
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
        C.AddAnimal(NewAn);
        System.out.format("jumlah animal : %d \n",C.GetNAnimal());
        System.out.format("size : %d\n",C.GetSize());
    }

    /**
     * Test of GetAnimals method, of class Cage.
     */
    @Test
    public void testGetAnimals() {
        System.out.println("GetAnimals");
        Animal An = C.GetAnimals()[C.GetNAnimal()-1];
        System.out.println(An.GetFamily());
        System.out.println(An.GetGenus());
        System.out.println(An.GetSpecies());
        System.out.println(An.GetWeight());
    }

    /**
     * Test of GetNAnimal method, of class Cage.
     */
    @Test
    public void testGetNAnimal() {
        System.out.println("GetNAnimal");
        Cage instance = new Cage("LandHabitat",10);
        for(int i = 0; i < instance.GetSize(); i++)
        {
          instance.GetArea()[i] = new Location (i,0);
        }
        int expResult = 0;
        int result = instance.GetNAnimal();
        assertEquals(expResult, result);
        Animal tryan = new Cat();
        instance.AddAnimal(tryan);
        expResult++;
        result = instance.GetNAnimal();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetHabitat method, of class Cage.
     */
    @Test
    public void testGetHabitat() {
        System.out.println("GetHabitat");
        Cage instance = new Cage("LandHabitat",10);
        String expResult = "LandHabitat";
        String result = instance.GetHabitat();
        assertEquals(expResult, result);
    }
    
}
