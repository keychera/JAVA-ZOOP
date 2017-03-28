package animal;


/**
 * @class AnimalDiet Interface
 * @brief interface for animal to have dietary properties
 * animal can have either meat diet or plant diet or both
 */
public interface IDietStatus {
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
   * @return int
   */
  int GetWeight();
  
  /**
   * @brief setter for weight
   */
  void SetWeight(int weight);
}
