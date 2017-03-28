package animal_list;

import animal.*;
import location.Location;


public class ArcticFox extends Animal{
	public ArcticFox(){
	this (20);
	}
	
	public ArcticFox(int weight){
	    position = new Location();
	    classification = new Classification("Canidae","Vulpes","lagopus");
	    dietStatus = new DietStatus(weight,true,false);
	    habitatStatus = new HabitatStatus("land");
	    tame_status = false;
	}
	
	  @Override
	  public String Interact() {
	    return "ARCTIC RAWR";
	  }

	  @Override
	  public void Render() {
	    System.out.print('f');
	  }
}


