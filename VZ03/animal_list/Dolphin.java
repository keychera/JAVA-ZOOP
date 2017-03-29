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
    habitatStatus = new HabitatStatus("water");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "dolphin's SKREE";
  }

  @Override
  public void Render() {
    System.out.print('D');
  }
}
