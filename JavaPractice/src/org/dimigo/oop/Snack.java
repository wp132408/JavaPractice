/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_Snack
 *
 * 1. 개요:스낵
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){
		
	}
	
	public Snack(String name, String company, int price, int number)
	{
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void PrinkSnack()
	{
		System.out.println("이름 : " + getName());
		System.out.println("제조사 : " + getCompany());
		System.out.println("가격 : " + String.format("%,d", getPrice())+"원");
		System.out.println("개수 : " + getNumber()+"개");
		System.out.println();
	}
	
	public int calcPrice()
	{
		int sum;
		sum = getPrice() * getNumber();
		return sum;
	}
}
