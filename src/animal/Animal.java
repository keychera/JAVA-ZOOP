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
  public int GetX(){
    return position.x;
  }
  
  public int GetY(){
    return position.y;
  }
  
  public void SetX(int x){
    this.position.x = x;
  }
  
  public void SetY(int y){
    this.position.y = y;
  }
  
  public void SetXY(int x, int y){
    this.position.x = x;
    this.position.y = y;
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
  
  public int GetWeight(){
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
