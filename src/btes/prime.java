package btes;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		System.out.println("enter any number");
		int n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}


