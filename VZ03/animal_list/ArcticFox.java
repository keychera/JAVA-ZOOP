package animal_list;

import animal.*;
import location.Location;

public class ArcticFox extends Animal {
  public ArcticFox(){
    this(20);
  }
  
  public ArcticFox(int weight){
    position = new Location();
    classification = new Classification("Canidae","Vulpes","lagopus");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

  public String Interact() {
	  return "ARCTIC RAWR";
  }

  public void Render() {
    System.out.print('f');
  }
}
