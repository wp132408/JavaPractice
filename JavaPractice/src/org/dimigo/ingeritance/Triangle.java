/**
 * 
 */
package org.dimigo.ingeritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *    ㅣ_Triangle
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Triangle extends Figure {
	private int width;
	private int height;
	
	Triangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	Triangle(int centerX, int centerY, int width, int height)
	{
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea()
	{
		return width * height / 2;
	}
	
	protected void printCenter()
	{
		System.out.print("삼각형 ");
		super.printCenter();
	}
}
