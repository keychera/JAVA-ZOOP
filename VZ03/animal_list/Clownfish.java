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
    habitatStatus = new HabitatStatus("water");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "lil blub";
  }

  @Override
  public void Render() {
    System.out.print('C');
  }
}
