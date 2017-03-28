package location;

public interface ILocation {
	/**
	   * @brief getter for X value
	   * @return int
	   */
  public int GetX();
	  /**
	   * @brief getter for Y value
	   * @return int
	   */
  public int GetY();
	  /**
	   * @brief setter for X value
	   * @param _x
	   */
  public void SetX(int _x);
	  /**
	   * @brief setter for Y value
	   * @param _y
	   */
  public void SetY(int _y);
	  
	    /**
	   * @brief setter for X and Y value simultaneously
	   * @param _x
	   * @param _y
	   */
  public void SetXY(int _x,int _y);
}
