/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_PiggyBankTest
 *
 * 1. 개요:돼지 은행 테스트
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember Dad = new FamilyMember("아빠");
		FamilyMember Mom = new FamilyMember("엄마");
		FamilyMember Brother = new FamilyMember("남동생");
		FamilyMember Me = new FamilyMember("나");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(Dad, 10000);
		PiggyBank.putMoney(Mom, 20000);
		PiggyBank.putMoney(Brother, 30000);
		PiggyBank.putMoney(Me, 40000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(Me, 60000);
		
		PiggyBank.printBalance();
	}

}
