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
	    tame_status = true;
habitatStatus = new HabitatStatus("water");
	}
	
	   
	  public String Interact() {
	    return "a rare blub";
	  }

	   
	  public void Render() {
	    System.out.print('A');
	  }
}


