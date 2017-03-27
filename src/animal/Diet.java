package animal;

public class Diet {
  public int weight;
  public final boolean meat_diet;
  public final boolean plant_diet;
  
  public Diet(int _weight, boolean meat, boolean plant){
    weight = _weight;
    meat_diet = meat;
    plant_diet = plant;
  }
}
