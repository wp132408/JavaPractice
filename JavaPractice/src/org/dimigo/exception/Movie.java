/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *    ㅣ_Movie
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Movie extends Exception {
	private String title;
	private int limitAge;
	
	Movie(String title, int limitAge)
	{
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	
}
