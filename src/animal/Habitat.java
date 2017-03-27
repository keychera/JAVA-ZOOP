package animal;

public class Habitat{
  public final boolean land;
  public final boolean water;
  public final boolean flying;
  
  public Habitat(boolean land, boolean water, boolean flying){
    this.land = land;
    this.water = water;
    this.flying = flying;
  }
  
  public Habitat(String key){
    switch(key){
      case "land":
      case "Land":
        this.land = true;
        this.water = false;
        this.flying = false;
        break;
      case "water":
      case "Water":
        this.land = false;
        this.water = true;
        this.flying = false;
        break;
      case "air":
      case "Air":
      case "flying":
      case "Flying":
        this.land = false;
        this.water = false;
        this.flying = true;
        break;
      default:
        this.land = false;
        this.water = false;
        this.flying = false;
    }
  }
}