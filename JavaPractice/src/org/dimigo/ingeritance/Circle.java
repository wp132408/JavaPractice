/**
 * 
 */
package org.dimigo.ingeritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *    ㅣ_Circle
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Circle extends Figure {
	private int radius;
	
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	Circle(int centerX, int centerY, int radius)
	{
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea()
	{
		return Math.PI * radius * radius;
	}
}
