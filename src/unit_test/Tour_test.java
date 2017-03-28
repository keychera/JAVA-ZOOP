package unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.*;
import tour.Tour;

public class Tour_test {

  @Test
  public void testTour() {
    /*map test 
     * X X X X F X
     * X         X
     * X X X X   X
     * X   X     X
     * S       X X
     * X X X X X X
     */
    
    int width = 6;
    int length = 6;
    Cell cells[] = new Cell [width * length];
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
          cells[iteration] = new LandHabitat();
        }
        cells[iteration].SetX(i);
        cells[iteration].SetY(j);
        iteration++;
      }
    }
    
    iteration = 0;
    for(int j = 0;j < length;j++){
      for(int i = 0;i < width;i++){
        cells[iteration].Render();
        System.out.print(" ");
        iteration++;
      }
      System.out.println();
    }
    
    
    Tour tour = new Tour(cells,width,length);
    tour.PrintRoute();
    
    assertEquals(9,tour.GetRouteDistance());
  }

}
