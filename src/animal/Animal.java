package animal;

import renderable.*;
import location.*;

abstract public class Animal extends Renderable implements ILocation, IClassification, IDiet, IHabitat, ITameStatus{
  protected Location position;
  protected Classification classification;
  protected Diet diet;
  protected Habitat habitat;
  protected boolean tame_status;
  
  abstract public String Interact ();
  
  //!!! consider removing interface ILocation
  public Integer GetX(){
    return position.x;
  }
  
  public Integer GetY(){
    return position.y;
  }
  
  public void SetX(Integer _x){
    position.x = _x;
  }
  
  public void SetY(Integer _y){
    position.y = _y;
  }
  
  public void SetXY(Integer _x, Integer _y){
    position.x = _x;
    position.y = _y;
  }
  
  public String GetFamily(){
    return classification.family;
  }
  
  public String GetGenus(){
    return classification.genus;
  }
  
  public String GetSpecies(){
    return classification.species;
  }
  
  public Integer GetWeight(){
    return diet.weight;
  }
  
  public boolean IsCarnivore(){
    return diet.meat_diet && !diet.plant_diet;
  }
  
  public boolean IsHerbivore(){
    return diet.plant_diet && !diet.meat_diet;
  }
  
  public boolean IsOmnivore(){
    return diet.meat_diet && diet.plant_diet;
  }
  
  public boolean IsFlying(){
    return habitat.flying;
  }
  
  public boolean IsLand(){
    return habitat.land;
  }
  
  public boolean IsWater(){
    return habitat.water;
  }
  
  public boolean IsTame(){
    return tame_status;
  }
}
