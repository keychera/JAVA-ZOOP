package cell;
import renderable.*;
//import location.*;
/**
 *
 * Class Cell
 * abstract class of Cell as a component of the zoo
 * @author	Harum Lokawati
 * @since	March 2017
 * @version     VZ03
 * 
 */

public abstract class Cell extends Renderable {
    /**
     * default constructor
     * construct Renderable and Location
     */
    public Cell()
    {
        super();
    }
    /**
     * constructor with parameter ,construct Cell and set Location(x,y)
     * @param x 
     * @param y 
     */
    public Cell(int x, int y)
    {
       
    }
    /**
     * pure virtual for name getter
     * @
     */

    abstract String GetName();
    /**
     * pure virtual for type getter
     * @ 
     */
    abstract String GetType();
};
