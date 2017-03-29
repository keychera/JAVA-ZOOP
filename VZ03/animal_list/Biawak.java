package animal_list;

import animal.*;
import location.Location;

public class Biawak extends Animal {
  public Biawak(){
    this(35);
  }
  
  public Biawak(int weight){
    position = new Location();
    classification = new Classification("Varanidae","Varanus","cerambonensis");
    dietStatus = new DietStatus(weight,true,false);
    habitatStatus = new HabitatStatus("land");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "MORE TERRIFYING HSSS";
  }

  @Override
  public void Render() {
    System.out.print('b');
  }
}
