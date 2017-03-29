package animal_list;

import animal.*;
import location.Location;

public class Komodo extends Animal {
  public Komodo(){
    this(40);
  }
  
  public Komodo(int weight){
    position = new Location();
    classification = new Classification("Varanidae","Varanus","komodoensis");
    dietStatus = new DietStatus(weight,true,false);
    habitatStatus = new HabitatStatus("land");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "HSSS";
  }

  @Override
  public void Render() {
    System.out.print('K');
  }
}
