/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ㅣ_SmartPhone
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	SmartPhone()
	{
		
	}
	
	SmartPhone(String model, String company, int price)
	{
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn()
	{
		System.out.println(model + "전원을 켭니다.");
	}
	
	public void turnOff()
	{
		System.out.println(model + "전원을 끕니다.");
	}
	
	public void pay()
	{
		System.out.println("결제합니다.");
	}
	
	public void useSpecialFunction(SmartPhone phone)
	{
		if(phone == null) return;
		if(phone instanceof IPhone) ((IPhone)phone).useAirDrop();
		if(phone instanceof Galaxy) ((Galaxy)phone).useWirelessCharging();
	}
	@Override
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price);
	}
}
