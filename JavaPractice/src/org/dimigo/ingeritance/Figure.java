/**
 * 
 */
package org.dimigo.ingeritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *    ㅣ_Figure
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	Figure()
	{
		
	}
	
	Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea()
	{
		return 0.0;
	}
}
