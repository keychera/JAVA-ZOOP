package animal;

public class Diet {
  public int weight;
  public final boolean meat_diet;
  public final boolean plant_diet;
  
  public Diet(int weight, boolean meat_diet, boolean plant_diet){
    this.weight = weight;
    this.meat_diet = meat_diet;
    this.plant_diet = plant_diet;
  }
}
