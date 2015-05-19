/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_SnackTest
 *
 * 1. 개요:스낵테스트
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class SnackTest {

	static int calc = 0;
	public static void main(String[] args) {
		Snack[] snacks = new Snack[]{new Snack("새우깡", "농심" , 1100, 2),new Snack("콘칲", "크라운" , 1200, 1),
				new Snack("허니버터칩", "해태" , 1500, 4)};
		
		for(Snack i : snacks)
		{
			i.PrinkSnack();
			calc += i.calcPrice();
		}
		
		System.out.println("총 구매 금액: " + String.format("%,d", calc) +"원");
	}
}