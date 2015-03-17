package org.dimigo.basic;


/**
 * << 첫번째 수행평가 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author 진욱
 * @version 1.0
 */


public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean ismale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("이름 : " + name);
		if(ismale == false)
		{
			System.out.println("성별 : 여자");
		}
		else
		{
			System.out.println("성별 : 남자");
		}
		
		System.out.println("나이 : " + age + "세");
		System.out.printf("키 : %.1f cm\n",height);
		System.out.printf("몸무게 : %.1f kg\n",weight);
		System.out.printf("혈액형 : %c 형\n",bloodtype);
	}

}
