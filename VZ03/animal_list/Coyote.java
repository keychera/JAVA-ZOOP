	package animal_list;

import animal.*;
import location.Location;


public class Coyote extends Animal{
	public Coyote(){
	this (15);
	}
	
	public Coyote(int weight){
	    position = new Location();
	    classification = new Classification("Canidae","Canis","latrans");
	    dietStatus = new DietStatus(weight,true,false);
	    tame_status = true;
habitatStatus = new HabitatStatus("land");
	}
	
	   
	  public String Interact() {
	    return "AGILE RAWR";
	  }

	   
	  public void Render() {
	    System.out.print('t');
	  }
}


