package animal_list;

import animal.*;
import location.Location;

public class Wolf extends Animal {
  public Wolf(){
    this(15);
  }
  
  public Wolf(int weight){
    position = new Location();
    classification = new Classification("Canidae","Canis","lupus");
    dietStatus = new DietStatus(weight,true,false);
    habitatStatus = new HabitatStatus("land");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "A STANDARD RAWR";
  }

  @Override
  public void Render() {
    System.out.print('W');
  }
}
