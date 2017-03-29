package animal_list;

import animal.*;
import location.Location;

public class BadakSumatra extends Animal {
  public BadakSumatra(){
    this(65);
  }
  
  public BadakSumatra(int weight){
    position = new Location();
    classification = new Classification("Rhinocerotidae","Dicerorhinus","sumatrensis");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

   
  public String Interact() {
	  return "IM WITH JAWA";
  }

   
  public void Render() {
    System.out.print('S');
  }
}
