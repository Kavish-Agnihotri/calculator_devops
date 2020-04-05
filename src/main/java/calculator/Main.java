package calculator;

import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String args[])
	{
		Scanner Scan=new Scanner(System.in);
		int flag=0;

		do
		{
		System.out.println("\t \t \tCalculator Application");
		System.out.println("Menu List :");
		System.out.println("\t1.Addition");
		System.out.println("\t2.Subtraction");
		System.out.println("\t3.Multiplication");
		System.out.println("\t4.Division");
		System.out.println("\t5.Exit");

		int choice=Scan.nextInt();

		switch(choice)
		{
			case 1:
			{
				int a,b;
				System.out.print("Enter Number 1:");
				a=Scan.nextInt();
				System.out.print("Enter Number 2:");
				b=Scan.nextInt();

				System.out.println("Result :"+(a+b));
				break;
			}

			case 2:
			{
				int a,b;
				System.out.print("Enter Number 1:");
				a=Scan.nextInt();
				System.out.print("Enter Number 2:");
				b=Scan.nextInt();

				System.out.println("Result :"+(a-b));
				break;
			}

			case 3:
			{
				int a,b;
				System.out.print("Enter Number 1:");
				a=Scan.nextInt();
				System.out.print("Enter Number 2:");
				b=Scan.nextInt();

				System.out.println("Result :"+(a*b));
				break;
			}

			case 4:
			{
				int a,b;
				System.out.print("Enter Number 1:");
				a=Scan.nextInt();
				System.out.print("Enter Number 2:");
				b=Scan.nextInt();

				System.out.println("Result :"+(a/b));
				break;
			}

			default:
			{
				flag=1;
			}
		}

	    }
	    while(flag!=1);

	}
}
