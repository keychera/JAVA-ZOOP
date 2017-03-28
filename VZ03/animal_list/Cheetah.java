package animal_list;

import animal.*;
import location.Location;


public class Cheetah extends Animal{
	public Cheetah(){
	this (10);
	}
	
	public Cheetah(int weight){
	    position = new Location();
	    classification = new Classification("Felidae","Acinonyx","jubatus");
	    dietStatus = new DietStatus(weight,true,false);
	    habitatStatus = new HabitatStatus("land");
	    tame_status = false;
	}
	
	  @Override
	  public String Interact() {
	    return "*slightly soft* RAWR";
	  }

	  @Override
	  public void Render() {
	    System.out.print('C');
	  }
}


