/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_test;

import animal_list.Cat;
import cell.AirHabitat;
import cell.Cell;
import cell.Entrance;
import cell.Exit;
import cell.LandHabitat;
import cell.Road;
import cell.WaterHabitat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import zoo.Cage;
import zoo.Zoo;

/**
 *
 * @author Harum Lokawati
 */
public class ZooTest {
    
    private Zoo zoo;
    private Cell cells[];
    private int width;
    private int length;
    
    @Before
    public void initialize(){
      /*map test 
       * W W W W F W
       * W         W
       * W A A A   W
       * W   A     W
       * S       L L
       * L L L L L L
       */
      
      width = 6;
      length = 6;
      cells = new Cell [width * length];
      int iteration = 0;
      for(int j = 0;j < length;j++){
        for(int i = 0;i < width;i++){
          if (i == 4 && j == 0){
            cells[iteration] = new Exit();
          } else 
          if (i == 0 && j == 4){
            cells[iteration] = new Entrance();
          } else
          if ((i == 1 && j == 1) || (i == 2 && j == 1) || (i == 3 && j == 1) || (i == 4 && j == 1)
              || (i == 4 && j == 2) || (i == 4 && j == 3) || (i == 3 && j == 3) || (i == 3 && j ==4 )
              || (i == 2 && j ==4 ) || (i == 1 && j ==4 ) || (i == 1 && j ==3)) {
            cells[iteration] = new Road();
          } else {
            if (j >= 4) {
              cells[iteration] = new LandHabitat();
            } else 
            if (j == 0 || i == 0 || i == 5) {
              cells[iteration] = new WaterHabitat();
            } else {
              cells[iteration] = new AirHabitat();
            }
          }
          cells[iteration].SetX(i);
          cells[iteration].SetY(j);
          iteration++;
        }
      }
      /*
      iteration = 0;
      for(int j = 0;j < length;j++){
        for(int i = 0;i < width;i++){
          cells[iteration].Render();
          System.out.print(" ");
          iteration++;
        }
        System.out.println();
      }*/
      zoo = new Zoo(6,6);
      zoo.InitializeZoo(cells);
      zoo.MakeCage();
      Cat neko = new Cat();
      Cat chesire = new Cat();
      Cat kucing = new Cat();
      zoo.AddAnimaltoZoo(neko);
      zoo.AddAnimaltoZoo(chesire);
      zoo.AddAnimaltoZoo(kucing);
    }

    /**
     * Test of GetWidth method, of class Zoo.
     */
    @Test
    public void testGetWidth() {
        System.out.println("GetWidth");
        int expResult = 6;
        int result = zoo.GetWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetLength method, of class Zoo.
     */
    @Test
    public void testGetLength() {
        System.out.println("GetLength");
        int expResult = 6;
        int result = zoo.GetLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetCells method, of class Zoo.
     */
    @Test
    public void testGetCells() {
        System.out.println("GetCells");
        Cell[] result = zoo.GetCells();
        assertEquals("WaterHabitat", result[0].GetType());
        assertEquals("Exit", result[4].GetType());
        assertEquals("LandHabitat", result[35].GetType());
        assertEquals("Entrance", result[24].GetType());
        assertEquals("Road", result[7].GetType());
    }

    /**
     * Test of GetCages method, of class Zoo.
     */
    @Test
    public void testGetCages() {
        System.out.println("GetCages");
        Cage[] result = zoo.GetCages();
        for(int j = 0; j < zoo.GetNCages(); j++)
        {
          System.out.format("%d : ",j);
          for(int i = 0; i < result[j].GetSize(); i++)
          {
            System.out.format("(%d,%d)", result[j].GetArea()[i].x,result[0].GetArea()[i].y);
          }
          System.out.println();
        }
    }

    /**
     * Test of GetNCages method, of class Zoo.
     */
    @Test
    public void testGetNCages() {
        System.out.println("GetNCages");
        assertEquals(3, zoo.GetNCages());
    }

    /**
     * Test of AccessCell method, of class Zoo.
     */
    @Test
    public void testAccessCell() {
        System.out.println("AccessCell");
        int x = 0;
        int y = 0;
        Cell result = zoo.AccessCell(x, y);
        assertEquals(x, result.GetX());
        assertEquals(y, result.GetY());
        assertEquals("WaterHabitat",result.GetType());
    }

    /**
     * Test of ReadAnimal and ReadZoo method, of class Zoo.
     */
    @Test
    public void testReadEx() throws Exception {
        System.out.println("ReadAnimal");
        Zoo instance = new Zoo();
        instance.ReadZoo("E:/Tubes OOP/JAVA-ZOOP/VZ03/zoo/map.txt");
        instance.MakeCage();
        instance.Print(-1,-1);
        Cage[] result = instance.GetCages();
        System.out.println(instance.GetNCages());
        for(int j = 0; j < instance.GetNCages(); j++)
        {
          System.out.format("%d : ",j);
          System.out.print(result[j].GetSize());
          for(int i = 0; i < result[j].GetSize(); i++)
          {
            System.out.format("(%d,%d)", result[j].GetArea()[i].x,result[0].GetArea()[i].y);
          }
          System.out.println();
        }
        instance.ReadAnimal("E:/Tubes OOP/JAVA-ZOOP/VZ03/zoo/map_animal.txt");
        instance.Print(-1,-1);
    }

    /**
     * Test of AddAnimaltoZoo method, of class Zoo.
     */
    @Test
    public void testAddAnimaltoZoo() {
        System.out.println("AddAnimaltoZoo");
        for(int i = 0; i < zoo.GetNCages(); i++)
        {
          System.out.format("animal di cage %d ada: %d \n",i+1,zoo.GetCages()[i].GetNAnimal());
          for(int j = 0; j < zoo.GetCages()[i].GetNAnimal(); j++){
            System.out.format("hewan %d : ", j+1);
            System.out.println(zoo.GetCages()[i].GetAnimals()[j].GetSpecies());
          }
        }
    }

    /**
     * Test of GetIndexCage method, of class Zoo.
     */
    @Test
    public void testGetIndexCage() {
        System.out.println("GetIndexCage");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = zoo.GetIndexCage(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of Print method, of class Zoo.
     */
    @Test
    public void testPrint() {
        System.out.println("Print");
        zoo.Print(4, 0);
    }

    /**
     * Test of CalculateFoodForCage method, of class Zoo.
     */
    @Test
    public void testCalculateFoodForCage() {
        System.out.println("CalculateFoodForCage");
        Cage c = zoo.GetCages()[0];
        int result = zoo.CalculateFoodForCage(c);
        assertTrue(result>=0);
    }

    /**
     * Test of CalculateFoodForAll method, of class Zoo.
     */
    @Test
    public void testCalculateFoodForAll() {
        System.out.println("CalculateFoodForAll");
        int result = zoo.CalculateFoodForAll();
        assertTrue(result>=0);
    }
    
}
