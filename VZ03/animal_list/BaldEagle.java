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
    tame_status = true;
habitatStatus = new HabitatStatus("air");
  }

   
  public String Interact() {
	  return "BAWK";
  }

   
  public void Render() {
    System.out.print('E');
  }
}
