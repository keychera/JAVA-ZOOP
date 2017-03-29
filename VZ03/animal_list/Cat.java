package animal_list;

import animal.*;
import location.Location;

public class Cat extends Animal {
  public Cat(){
    this(10);
  }
  
  public Cat(int weight){
    position = new Location();
    classification = new Classification("Felidae","Felis","Catus");
    dietStatus = new DietStatus(weight,true,false);
    tame_status = true;
habitatStatus = new HabitatStatus("land");
  }

   
  public String Interact() {
    return "NYAA";
  }

   
  public void Render() {
    System.out.print('c');
  }
}
