/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    ㅣ_FamilyMember
 *
 * 1. 개요:패밀리 멤버
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName)
	{
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName()
	{
		return this.memberName;
	}
	
	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원수 : " + memberCnt + "명");
		System.out.println();
	}

}
