/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_CarTest
 *
 * 1. 개요:CarTest
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		Car modern = new Car();
		Car Gia = new Car();
		Car samsung = new Car();
		
		modern.setCompany("현대자동차");
		modern.setModel("제네시스");
		modern.setColor("검정색");
		modern.setMaxSpeed(225);
		modern.setPrice(50000000);
		
		Gia.setCompany("기아자동차");
		Gia.setModel("K7");
		Gia.setColor("흰색");
		Gia.setMaxSpeed(246);
		Gia.setPrice(40000000);
		
		samsung.setCompany("삼성자동차");
		samsung.setModel("SM7");
		samsung.setColor("회색");
		samsung.setMaxSpeed(200);
		samsung.setPrice(38000000);
		
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