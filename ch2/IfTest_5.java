package com.bigdata30.ch2;

public class IfTest_5{

	public static void main(String args[]){

	int point = 60;
//	char grade = ' '; -> �����ڵ� ��ȯ -> char grade = '\u0000';
	char grade = '\u0000'; // char �ʱ�ȭ �� ��

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
	System.out.println("���� >>> : " + grade);

	
	
	} // end of main()

} // end of IfTest_5 class