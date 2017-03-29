package animal_list;

import animal.*;
import location.Location;

public class Beluga extends Animal {
  public Beluga(){
    this(50);
  }
  
  public Beluga(int weight){
    position = new Location();
    classification = new Classification("Monodontidae","Delphinapterus","leucas");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("water");
  }

   
  public String Interact() {
	  return "SPLASH";
  }

   
  public void Render() {
    System.out.print('B');
  }
}
