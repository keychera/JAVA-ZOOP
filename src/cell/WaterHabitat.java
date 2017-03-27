package cell;
/**
 * @class	WaterHabitat
 * @brief	class to define Habitat as WaterHabitat
 */
public class WaterHabitat extends Habitat{
        /**
	 * default construstor
	 * this will construct Habitat
         * @
	 */
      public WaterHabitat()
      {
          super();
      }
        /**
	 * fuction to print 
	 * this will return "~"
         * @
	 */
      public void Render()
      {
          System.out.print('~');
      }
        /**
	 * type getter 
	 * this will return "WaterHabitat"
         * @return String
	 */
      public String GetType()
      {
          return "WaterHabitat";
      }
};
