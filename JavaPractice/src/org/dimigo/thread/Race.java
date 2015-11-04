/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *    ㅣ_Race
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		Thread Ukjae = new Runner("정욱재");
		Thread ojin = new Runner("이어진");
		
		
		Ukjae.start();
		ojin.start();
		
		System.out.println("main thread end");
	}

}
