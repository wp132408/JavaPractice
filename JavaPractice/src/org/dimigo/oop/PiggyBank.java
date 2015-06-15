/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_PiggyBank
 *
 * 1. 개요:돼지 은행
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount)
	{
		balance += amount;
		System.out.println(member.getMemberName() + amount + "원 넣음");
		System.out.println();
	}
	
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
		System.out.println();
	}
}
