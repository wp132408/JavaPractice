/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *    ㅣ_AgeCheckException
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class AgeCheckException extends Exception{
	AgeCheckException()
	{
		
	}
	
	AgeCheckException(Movie movie)
	{
		System.out.println(movie.getTitle() + " 영화는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}

}
