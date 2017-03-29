package animal_list;

import animal.*;
import location.Location;

public class Clownfish extends Animal {
  public Clownfish(){
    this(2);
  }
  
  public Clownfish(int weight){
    position = new Location();
    classification = new Classification("Pomacentridae","Ocellaris","clownfish");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("water");
  }

   
  public String Interact() {
	  return "lil blub";
  }

   
  public void Render() {
    System.out.print('C');
  }
}
