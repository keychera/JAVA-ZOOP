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
	    habitatStatus = new HabitatStatus("land");
	    tame_status = false;
	}
	
	  @Override
	  public String Interact() {
	    return "AGILE RAWR";
	  }

	  @Override
	  public void Render() {
	    System.out.print('t');
	  }
}


