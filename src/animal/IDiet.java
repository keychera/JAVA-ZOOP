package animal;


/**
 * @class AnimalDiet Interface
 * @brief interface for animal to have dietary properties
 * animal can have either meat diet or plant diet or both
 */
public interface IDiet {
  /**
   * @brief this will return whether the animal has meatdiet or not
   * @return bool
   */
  public boolean IsCarnivore();
  
  /**
   * @brief this will return whether the animal has plantdiet or not
   * @return bool
   */
  public boolean IsHerbivore();
  
  /**
   * @brief this will return whether the animal has both diet or not
   * @return bool
   */
  public boolean IsOmnivore();
  
  /**
   * @brief getter for weight
   * @return integer
   */
  Integer GetWeight();
}
