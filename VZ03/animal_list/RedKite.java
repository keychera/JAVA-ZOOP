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
    habitatStatus = new HabitatStatus("air");
    tame_status = true;
  }

  @Override
  public String Interact() {
	  return "flip flop";
  }

  @Override
  public void Render() {
    System.out.print('R');
  }
}
