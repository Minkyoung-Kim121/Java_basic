package a.b.c;

public class A{

	//������ : �⺻ ������
	//   Ư¡)�������� ������ �� �ȴ�.
	//       void�� �־ �� �ȴ�.
	//       ������ ������ return Ű���嵵 ������� �ʴ´�.
	//       �����(������� ���� ��) ���� �⺻ �������̴�.
	//       �⺻ �����ڴ� �Ű������� ����� �Ѵ�.
	public A(){
		System.out.println("A() ������ >>> : ");
	}

	public static void main(String args[]){
		System.out.println("main() �Լ� >>> : ");
		A a = new A();

	}
} // end of A class
/*
C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javap a.b.c.A
Compiled from "A.java"
public class a.b.c.A {
  public a.b.c.A();
  public static void main(java.lang.String[]);
}
*/