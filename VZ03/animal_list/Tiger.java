package animal_list;

import animal.*;
import location.Location;


public class Tiger extends Animal{
	public Tiger(){
	this (30);
	}
	
	public Tiger(int weight){
	    position = new Location();
	    classification = new Classification("Felidae","Panthera","tigris");
	    dietStatus = new DietStatus(weight,true,false);
	    habitatStatus = new HabitatStatus("land");
	    tame_status = false;
	}
	
	  @Override
	  public String Interact() {
	    return "COURAGEOUS RAWR";
	  }

	  @Override
	  public void Render() {
	    System.out.print('T');
	  }
}


