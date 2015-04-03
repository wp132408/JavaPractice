package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		for(int i = 1; i < 11; i++)
		{
			for(int j =1; j<11; j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println(" ");
		}
	}

}
