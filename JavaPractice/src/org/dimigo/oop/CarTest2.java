/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_CarTest2
 *
 * 1. 개요:CarTest
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class CarTest2 {
	public static void main(String[] args) {
		Car3 modern = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 Gia = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 samsung = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("<< 자동차 목록 >> ");
		System.out.println("제조사명 : " + modern.getCompany());
		System.out.println("모델명 : " + modern.getModel());
		System.out.println("색상 : " + modern.getColor());
		System.out.println("최대속도 : " + modern.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", modern.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + Gia.getCompany());
		System.out.println("모델명 : " + Gia.getModel());
		System.out.println("색상 : " + Gia.getColor());
		System.out.println("최대속도 : " + Gia.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", Gia.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + samsung.getCompany());
		System.out.println("모델명 : " + samsung.getModel());
		System.out.println("색상 : " + samsung.getColor());
		System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", samsung.getPrice()) + "원");
		System.out.println();
	}

}