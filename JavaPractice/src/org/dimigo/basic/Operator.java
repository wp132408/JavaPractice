package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 10;
		double h = 5.8;
		double sa = ((a+b) * h) / 2;
		
		a = 9;
		h = 5.4;
		
		double pyung = a * h;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sa);
		System.out.println("평행사변형 넓이 : " + pyung);
		
		
		if(sa > pyung)
		{
			System.out.println("사다리꼴이 평행사변형보다 " + (sa - pyung) + "더 큽니다.");
		}
		
		else
		{
			System.out.println("사다리꼴이 평행사변형보다 " + (pyung - sa) + "더 큽니다.");
		}
	}

}
