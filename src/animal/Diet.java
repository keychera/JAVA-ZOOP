package animal;

public class Diet {
  public Integer weight;
  public final boolean meat_diet;
  public final boolean plant_diet;
  
  public Diet(Integer _weight, boolean meat, boolean plant){
    weight = _weight;
    meat_diet = meat;
    plant_diet = plant;
  }
}
