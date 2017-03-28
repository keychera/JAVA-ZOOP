package animal;

import renderable.*;
import location.*;

abstract public class Animal extends Renderable implements ILocation, IClassification, IDiet, IHabitat, ITameStatus{
  protected Location position;
  protected Classification classification;
  protected DietStatus dietStatus;
  protected HabitatStatus habitatStatus;
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
    return dietStatus.weight;
  }
  
  public boolean IsCarnivore(){
    return dietStatus.meat_diet && !dietStatus.plant_diet;
  }
  
  public boolean IsHerbivore(){
    return dietStatus.plant_diet && !dietStatus.meat_diet;
  }
  
  public boolean IsOmnivore(){
    return dietStatus.meat_diet && dietStatus.plant_diet;
  }
  
  public boolean IsFlying(){
    return habitatStatus.flying;
  }
  
  public boolean IsLand(){
    return habitatStatus.land;
  }
  
  public boolean IsWater(){
    return habitatStatus.water;
  }
  
  public boolean IsTame(){
    return tame_status;
  }
}
