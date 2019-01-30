package btes;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		int x,len=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		x=s.nextInt();
		while (x>0)
		{
			len++;
			x=x/10;
		}
				System.out.println("length of the no."+len);
				
	
		}
		
	}


