package animal_list;

import animal.*;
import location.Location;

public class GoldenEagle extends Animal {
  public GoldenEagle(){
    this(25);
  }
  
  public GoldenEagle(int weight){
    position = new Location();
    classification = new Classification("Accipitridae","Aquila","chrysaetos");
    dietStatus = new DietStatus(weight,true,false);
    habitatStatus = new HabitatStatus("air");
  }

  @Override
  public String Interact() {
	  return "GOLDEN BAWK";
  }

  @Override
  public void Render() {
    System.out.print('e');
  }
}
