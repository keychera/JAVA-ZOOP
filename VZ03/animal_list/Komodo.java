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
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

   
  public String Interact() {
	  return "HSSS";
  }

   
  public void Render() {
    System.out.print('K');
  }
}
