/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ㅣ_Galaxy
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Galaxy extends SmartPhone{
	Galaxy()
	{
		
	}
	
	Galaxy(String model, String company, int price)
	{
		super(model, company, price);
	}
	
	public void pay()
	{
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharging()
	{
		System.out.println("무선충전기능을 사용합니다.");
	}

}
