package a.b.c;

import java.util.Scanner;

public class ForTest_3{
	
	public static void main(String[] a){
		
		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++ )
			{
				System.out.println("("+i+","+j+")");
			}
		}

		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++ )
			{
				System.out.print("("+i+","+j+")");
			}
		}

		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++ )
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}

		for (int i=0; i < 9; i++ )
		{
			for (int j=0; j < 9; j++ )
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}

		for (int i=1; i <= 9; i++ )
		{
			for (int j=1; j <= 9; j++ )
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}

		for (int i=1; i <= 9; i++ )
		{
			for (int j=1; j <= i; j++ )
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}

		for (int i=1; i <= 9; i++ )
		{
			for (int j=1; j <= i; j++ )
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}

		for (int i=1; i <= 9; i++ )
		{
			for (int j=1; j <= i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=1; i <= 9; i++ )
		{
			for (int j=1; j <= i; j++ )
			{
				System.out.print("*");
			}
			System.out.println("@");
		}

	} // end of main()

} // end of ForTest_3 class