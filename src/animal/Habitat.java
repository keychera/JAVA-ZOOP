package animal;

public class Habitat{
  public final boolean land;
  public final boolean water;
  public final boolean flying;
  
  public Habitat(boolean _land, boolean _water, boolean _flying){
    land = _land;
    water = _water;
    flying = _flying;
  }
  
  public Habitat(String key){
    switch(key){
      case "land":
      case "Land":
        land = true;
        water = false;
        flying = false;
        break;
      case "water":
      case "Water":
        land = false;
        water = true;
        flying = false;
        break;
      case "air":
      case "Air":
      case "flying":
      case "Flying":
        land = false;
        water = false;
        flying = true;
        break;
      default:
        land = false;
        water = false;
        flying = false;
    }
  }
}