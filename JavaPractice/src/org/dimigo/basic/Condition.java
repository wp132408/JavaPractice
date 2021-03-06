package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int cartype = 0;
		int distance = 20;
		String Cartype;
		int basic_cost = 0;
		int final_cost = 0;	
		
		switch(cartype)
		{
		case 0:
			Cartype = "고속버스";
			basic_cost = 850;
			break;
		case 1:
			Cartype = "경차";
			basic_cost = 300;
			break;
		default :
			Cartype = "그 외";
			basic_cost = 600;
			break;
		}
		
		switch(Cartype)
		{
		case "고속버스" :
			if(distance == 0)
			{
				final_cost += basic_cost + 300 * (distance / 10);
			}
			else
			{
				final_cost += basic_cost + 300 * ((distance-1) / 10);
			}
			
			break;
			
		case "경차" :
			if(distance == 0)
			{
				final_cost += basic_cost + 200 * (distance / 10);
			}
			else
			{
				final_cost += basic_cost + 200 * ((distance-1) / 10);
			}
			break;
			
		default :
			if(distance == 0)
			{
				final_cost += basic_cost + 200 * (distance / 10);
			}
			else
			{
				final_cost += basic_cost + 200 * ((distance-1) / 10);
			}
			break;
		}
		
		System.out.println("<<고속도로 요금표>>");
		System.out.println("차종 : " + Cartype);
		System.out.println("주행 거리 : " + distance + "km");
		System.out.println("최종 요금 : " + final_cost + "원");
	}

}
