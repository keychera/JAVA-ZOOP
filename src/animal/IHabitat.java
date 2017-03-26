package animal;

 
/**
 * @class AnimalHabitat
 * @brief interface for habitat for animals,
 * that contain three bool value depicting the three habitat an animal can live:
 * Land, Water, and Flying (Air)
 */
public interface IHabitat {
  /**
   * @brief this will return whether the animal can live on land or not
   */
  public boolean IsLand();
  
  /**
   * @brief this will return whether the animal can live in water or not
   */
  public boolean IsWater();		
  /**
   * @brief this will return whether the animal can fly or not
   */
  public boolean IsFlying();
}
