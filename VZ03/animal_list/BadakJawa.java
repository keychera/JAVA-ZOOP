package animal_list;

import animal.*;
import location.Location;

public class BadakJawa extends Animal {
  public BadakJawa(){
    this(70);
  }
  
  public BadakJawa(int weight){
    position = new Location();
    classification = new Classification("Rhinocerotidae","Rhinoceros","sondaicus");
    dietStatus = new DietStatus(weight,true,false);
    habitatStatus = new HabitatStatus("land");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "HMM DON'T MIND ME AND MY ENDANGERED STATUS";
  }

  @Override
  public void Render() {
    System.out.print('J');
  }
}
