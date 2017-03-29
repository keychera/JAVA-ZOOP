package animal_list;

import animal.*;
import location.Location;

public class Damselfish extends Animal {
  public Damselfish(){
    this(2);
  }
  
  public Damselfish(int weight){
    position = new Location();
    classification = new Classification("Pomacentridae","Stegastes","variabilis");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("water");
  }

   
  public String Interact() {
	  return "lil *majestic* blub";
  }

   
  public void Render() {
    System.out.print('d');
  }
}
