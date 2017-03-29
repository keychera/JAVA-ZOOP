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
    habitatStatus = new HabitatStatus("land");
  }

  @Override
  public String Interact() {
	  return "IM WITH JAWA";
  }

  @Override
  public void Render() {
    System.out.print('S');
  }
}
