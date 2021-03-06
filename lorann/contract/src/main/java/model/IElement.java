package model;

import java.awt.Image;

import showboard.ISquare;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Group 3
 * @version 1.0
 */
public interface IElement extends ISquare {

	/**
	 * Get position x
	 * 
	 * @return x
	 * 			position x
	 */
	int getX();

	/**
	 * Get position y
	 * 
	 * @return y
	 * 			postion y
	 */
	int getY();

	/**
	 * Set the position x
	 * 
	 * @param x
	 * 			position x
	 */

	void setX(int x);

	/**
	 * Set the position y
	 * 
	 * @param y
	 *			position y
	 */
	void setY(int y);

	/**
	 * set the image
	 * 
	 * @param image
	 *				Set Image
	 */
	void setImage(Image image);

}
