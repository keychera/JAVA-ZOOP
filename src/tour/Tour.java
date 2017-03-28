package tour;
import cell.Cell;
import location.Location;
import pathfinder.*;

public class Tour{
  Cell cells[];
  Location route[];
  int route_distance;
  int route_pointer;
  
  public Tour(Cell cells[],int width,int length) {
    
    this.cells = cells;
    Path areaForPathFinding[] = new Path [width * length];
    for(int i = 0;i < width * length;i++){
      int label;
      switch (cells[i].GetType()) {
        case "Road" : label = PathLabel.ROAD.GetValue();break;
        case "Entrance" : label = PathLabel.START.GetValue();break;
        case "Exit" : label = PathLabel.FINISH.GetValue();break;
        default:
          label = PathLabel.WALL.GetValue();
      }
      areaForPathFinding[i] = new Path(cells[i].GetX(),cells[i].GetY(),label);
    }
    
    
    PathFinder findingMachine = new PathFinder(areaForPathFinding,width,length);
    Path route_found[] = findingMachine.getRoute();
    route_distance = findingMachine.getRouteDistance();
    
    route = new Location [route_distance];
    for(int i = 0;i < route_distance;i++){
      route[i] = new Location();
      route[i].x = route_found[i].x;
      route[i].y = route_found[i].y;
    }
    route_pointer = 0;
  }

  public int InteractAroundRoute(Location r,int dir) {
    return 0;
  }
  
  public void InteractWithHabitat(Cell c) {
  }
   
  public void RestartRoute() {
    route_pointer = 0;
  }
  
  public void TraceRoute() {
  }
   
  public void TraceWholeRoute() {
  }
  
  public int GetRouteDistance() {
    return route_distance;
  }
 
  public int GetRoutePointer() {
    return route_pointer;
  }
  
  public void PrintRoute() {
    for(int i = 0;i < route_distance;i++){
      System.out.print(route[i].x);
      System.out.print(",");
      System.out.print(route[i].y);
      System.out.println();
    }
  }
}
