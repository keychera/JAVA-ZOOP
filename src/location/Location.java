/**
 * @file	location.h
 * @author	Kevin Erdiza
 * @date	March 2017
 * @version VZ03
 * 
 * @brief	the header file containing class declaration for Location interface
 */
package location;
/**
 * @class	Location
 * @brief	class interface for objects that has 2 dimensional integer location value
 */

public class Location {
  public Integer x;
  public Integer y;
  
  public Location(){
    x = 0;
    y = 0;
  }
  
  public Location(Integer _x,Integer _y){
    x = _x;
    y = _y;
  }
}