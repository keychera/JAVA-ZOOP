package cell;
/**
 * @file	LandHabitat.java
 * @author	Harum Lokawati
 * @date	March 2017
 * @version VZ03
 * 
 * @brief	the header file containing class declaration LandHabitat
 */

public class LandHabitat extends Habitat{
        /**
	 * @brief default construstor
	 * this will construct Habitat
	 */
    public LandHabitat()
    {
        super();
    }
       /**
	 * @brief fuction to print 
	 * this will return "l"
         * @return void
		 */
    public void Render()
    {
        System.out.print('^');
    }
        /**
	 * @brief type getter 
	 * this will return "LandHabitat"
         * @return char*
	 */
    public  String GetType()
    {
        return "LandHabitat";
    }
};
