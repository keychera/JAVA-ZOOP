package animal_list;

import animal.*;
import location.Location;

public class BaldEagle extends Animal {
  public BaldEagle(){
    this(30);
  }
  
  public BaldEagle(int weight){
    position = new Location();
    classification = new Classification("Accipitridae","Haliaeetus","leucocephalus");
    dietStatus = new DietStatus(weight,true,false);
    habitatStatus = new HabitatStatus("air");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "BAWK";
  }

  @Override
  public void Render() {
    System.out.print('E');
  }
}
