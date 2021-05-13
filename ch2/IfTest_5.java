package com.bigdata30.ch2;

public class IfTest_5{

	public static void main(String args[]){

	int point = 60;
//	char grade = ' '; -> 유니코드 변환 -> char grade = '\u0000';
	char grade = '\u0000'; // char 초기화 한 것

	if (90 <= point)
	{
		grade = 'A';
	}else if (89 <= point)
	{
		grade = 'B';
	}else if (70 <= point)
	{
		grade = 'C';
	}else{
		grade = 'F';
	}
	System.out.println("학점 >>> : " + grade);

	
	
	} // end of main()

} // end of IfTest_5 class