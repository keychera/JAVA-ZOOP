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
    habitatStatus = new HabitatStatus("water");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "lil *majestic* blub";
  }

  @Override
  public void Render() {
    System.out.print('d');
  }
}
