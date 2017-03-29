package animal_list;

import animal.*;
import location.Location;


public class Axolotl extends Animal{
	public Axolotl(){
	this (10);
	}
	
	public Axolotl(int weight){
	    position = new Location();
	    classification = new Classification("Ambystomatidae","Ambystoma","mexicanum");
	    dietStatus = new DietStatus(weight,true,false);
	    habitatStatus = new HabitatStatus("water");
	}
	
	  @Override
	  public String Interact() {
	    return "a rare blub";
	  }

	  @Override
	  public void Render() {
	    System.out.print('A');
	  }
}


