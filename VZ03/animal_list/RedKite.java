package animal_list;

import animal.*;
import location.Location;

public class RedKite extends Animal {
  public RedKite(){
    this(10);
  }
  
  public RedKite(int weight){
    position = new Location();
    classification = new Classification("Accipitridae","Milvus","milvus");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("air");
  }

   
  public String Interact() {
	  return "flip flop";
  }

   
  public void Render() {
    System.out.print('R');
  }
}
