/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ㅣ_IPhone
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class IPhone extends SmartPhone{
	IPhone()
	{
		
	}
	
	IPhone(String model, String company, int price)
	{
		super(model, company, price);
	}
	
	public void pay()
	{
		System.out.print("에플 페이로 ");
		super.pay();
	}
	
	public void useAirDrop()
	{
		System.out.println("AirDrop기능을 사용합니다.");
	}
}
