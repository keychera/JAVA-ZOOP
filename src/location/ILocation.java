package location;

public interface ILocation {
	/**
	   * @brief getter for X value
	   * @return integer
	   */
  public Integer GetX();
	  /**
	   * @brief getter for Y value
	   * @return integer
	   */
  public Integer GetY();
	  /**
	   * @brief setter for X value
	   * @param x
	   * @return void
	   */
  public void SetX(Integer _x);
	  /**
	   * @brief setter for Y value
	   * @param y
	   * @return void
	   */
  public void SetY(Integer _y);
	  
	    /**
	   * @brief setter for X and Y value simultaneously
	   * @param X
	   * @param y
	   * @return void
	   */
  public void SetXY(Integer _x,Integer _y);
}
