package animal_list;

import animal.*;
import location.Location;

public class Leopard extends Animal {
  public Leopard(){
    this(20);
  }
  
  public Leopard(int weight){
    position = new Location();
    classification = new Classification("Felidae","Panthera","pardus");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

   
  public String Interact() {
	  return "MAJESTIC RAWR";
  }

   
  public void Render() {
    System.out.print('l');
  }
}
