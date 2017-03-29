package animal_list;

import animal.*;
import location.Location;

public class Narwhal extends Animal {
  public Narwhal(){
    this(45);
  }
  
  public Narwhal(int weight){
    position = new Location();
    classification = new Classification("Monodontidae","Monodon","monoceros");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("water");
  }

   
  public String Interact() {
	  return "NARWHAL SPLASH";
  }

   
  public void Render() {
    System.out.print('N');
  }
}
