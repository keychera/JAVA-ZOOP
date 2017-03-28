package animal_list;

import animal.*;
import location.Location;


public class Lion extends Animal{
	public Lion(){
	this (30);
	}
	
	public Lion (int weight){
	    position = new Location();
	    classification = new Classification("Felidae","Panthera","leo");
	    dietStatus = new DietStatus(weight,true,false);
	    habitatStatus = new HabitatStatus("land");
	    tame_status = false;
	}
	
	  @Override
	  public String Interact() {
	    return "A PROPER RAWR";
	  }

	  @Override
	  public void Render() {
	    System.out.print('L');
	  }
}


