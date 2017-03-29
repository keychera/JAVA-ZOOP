package animal_list;

import animal.*;
import location.Location;

public class Dolphin extends Animal {
  public Dolphin(){
    this(45);
  }
  
  public Dolphin(int weight){
    position = new Location();
    classification = new Classification("Delphinidae","Delphinus","delphis");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("water");
  }

   
  public String Interact() {
	  return "dolphin's SKREE";
  }

   
  public void Render() {
    System.out.print('D');
  }
}
