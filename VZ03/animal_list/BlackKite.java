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
    habitatStatus = new HabitatStatus("air");
  }

  @Override
  public String Interact() {
	  return "dark flip flop";
  }

  @Override
  public void Render() {
    System.out.print('k');
  }
}
