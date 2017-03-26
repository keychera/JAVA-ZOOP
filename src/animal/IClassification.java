package animal;


/**
 * @interface AnimalClassification
 * @brief interface for scientific name for animals, that contains three char* for 
 * family, genus, and species name
 */
public interface IClassification
{ 
  /**
   * @brief this will return a char* of the Family name
   */
  public String GetFamily();
  
  /**
   * @brief this will return a char* of the genus name
   */
  public String GetGenus();
  
  /**
   * @brief this will return a char* of the species name
   */
  public String GetSpecies();
}
