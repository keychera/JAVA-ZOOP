package animal_list;

import animal.*;
import location.Location;

public class Cheetah extends Animal {
  public Cheetah(){
    this(20);
  }
  
  public Cheetah(int weight){
    position = new Location();
    classification = new Classification("Felidae","Acinonyx","jubatus");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

   
  public String Interact() {
    return "*slightly soft* RAWR";
  }

   
  public void Render() {
    System.out.print('C');
  }
}
