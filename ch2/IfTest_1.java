package com.bigdata30.ch2;

public class IfTest_1{

	public static void main(String args[]){

/*
A)boolean Ű������ Ư¡) ���� p.375
					 �⺻ �ڷ���
					 i byte : true , false
					 ��������
	1) Wrapper Ŭ����) Boolean
	2) default��) false
  
*/
		boolean bool = false;

		if (bool)
		{
			System.out.println(" bool = false");
		}else{
			System.out.println(" else 111 ");
		}
		
		//! : not ������ (�ݴ� ������)��
		//!bool -> !(bool = false) -> true ��� ���� ����.
		if (!bool)
		{
			System.out.println(" !bool = false = true");
		}else{
			System.out.println(" else 222 ");
		}
	} // end of main()
} // end of IfTest_1 class