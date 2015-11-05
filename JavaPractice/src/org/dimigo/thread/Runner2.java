/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *    ㅣ_Runner
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Runner2 implements Runnable{
	private String name;
	private int meter;
	
	public Runner2(String name)
	{
		this.name = name;
		meter = 100;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 출발");
		for(int i = meter; i >= 0; i-=10)
		{
			System.out.println(name + " " + i + "미터");
			
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(name + " 골인");
	}
}
