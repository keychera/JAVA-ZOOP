package animal_list;

import animal.*;
import location.Location;

public class BlackKite extends Animal {
  public BlackKite(){
    this(10);
  }
  
  public BlackKite(int weight){
    position = new Location();
    classification = new Classification("Accipitridae","Milvus","migrans");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("air");
  }

   
  public String Interact() {
	  return "dark flip flop";
  }

   
  public void Render() {
    System.out.print('k');
  }
}
