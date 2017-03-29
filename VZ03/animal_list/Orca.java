package animal_list;

import animal.*;
import location.Location;

public class Orca extends Animal {
  public Orca(){
    this(90);
  }
  
  public Orca(int weight){
    position = new Location();
    classification = new Classification("Delphinidae","Orcinus","orca");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("water");
  }

   
  public String Interact() {
	  return "SPLASHING RAWR";
  }

   
  public void Render() {
    System.out.print('O');
  }
}
