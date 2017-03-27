package tour;
import cell.Cell;
import location.Location;
import zoo.Zoo;

public class Tour{
  Zoo zoo_ref;
  Location route;
  int route_distance;
  int route_pointer;
  
  class Path {
    public int x;
    public int y;
    public int counter;
    
    boolean equal(Path p){
      return x == p.x && y == p.y && counter == p.counter;
    }
    
    boolean moreThan(Path p){
      return counter > p.counter;
    }
    
    boolean lessThan(Path p){
      return counter < p.counter;
    }
  }
  
  public Tour(Zoo zoo,int entranceNum,int exitNum) {
    
  }

  int InteractAroundRoute(Location r,int dir) {
    return 0;
  }
  
  void InteractHabitat(Cell c) {
  }
   
  void RestartRoute() {
  }
  
  void TraceRoute() {
  }
   
  void TraceWholeRoute() {
  }
  
  int GetRouteDistance() {
    return 0;
  }
 
  int GetRoutePointer() {
    return 0;
  }
  
  void PrintRoute() {
  }
}
