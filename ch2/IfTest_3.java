package com.bigdata30.ch2;

public class IfTest_3{

	//<�������� boolean�� �Լ�>
	public boolean boolTest(){
		// ��������
		boolean bool = false;
/* -> �ּ� Ǯ�� ������+����, �ּ� �ް� ������+���� �ϸ� ������� �ٸ��� ���´�.
		if (!bool){
			bool = true;
		}
*/
		return bool;
	}

	public static void main(String args[]){
		
		// IfTest_3 Ŭ������ i3 ���������� ����ϱ� ���� �Ű������� ���� �����ڷ� �ν��Ͻ� �ߴ�.
		//    ->�� ����Ǹ� : i3 ���������� boolTest() �Լ��� ȣ�� �� �� �ִ�.
		IfTest_3 i3 = new IfTest_3();
		
		// i3 ���������� boolTest() �Լ��� ȣ���� ������� boolean�̴�.
		// -> boolean �������� bool ���������� i3.boolTest() ���ϰ��� ���� �� �ִ�.
		// => bool ���� ���� if ���� ����ȴ�.

		boolean bool = i3.boolTest();

		if (bool)
		{
			System.out.println("�Լ��� �� ���� �Ǿ����ϴ�.");
		}else{
			System.out.println("�Լ��� �� ������� �ʾҽ��ϴ�.");
		}
	} // end of main()

} // end of IfTest_3 class