package animal_list;

import animal.*;
import location.Location;

public class Cat extends Animal {
  Cat(){
    this(10);
  }
  
  Cat(int weight){
    position = new Location();
    classification = new Classification("Felidae","Felis","Catus");
    diet = new Diet(weight,true,false);
    habitat = new Habitat("land");
  }

  @Override
  public String Interact() {
    return "NYAA";
  }

  @Override
  public void Render() {
    System.out.print('c');
  }
}
