package animal_list;

import animal.*;
import location.Location;


public class RedFox extends Animal{
	public RedFox(){
	this (20);
	}
	
	public RedFox(int weight){
	    position = new Location();
	    classification = new Classification("Canidae","Vulpes","vulpes");
	    dietStatus = new DietStatus(weight,true,false);
	    tame_status = true;
habitatStatus = new HabitatStatus("land");
	    tame_status = false;
	}
	
	   
	  public String Interact() {
	    return "RAWR with passion";
	  }

	   
	  public void Render() {
	    System.out.print('F');
	  }
}


