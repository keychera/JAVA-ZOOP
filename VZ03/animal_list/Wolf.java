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
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

   
  public String Interact() {
	  return "A STANDARD RAWR";
  }

   
  public void Render() {
    System.out.print('W');
  }
}
