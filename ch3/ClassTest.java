package a.b.c;

import java.lang.Object; // Object �� ���� ���� ??
import java.util.ArrayList;
import java.util.Date;

// public abstact class Ŭ�����̸� : �߻�Ŭ���� - �߻��Լ�
// public interface Ŭ���� �̸� : �������̽� Ŭ���� : �߻� �Լ� : �޼ҵ�()
// ��� : ���ϻ�� extends / ���߻�� implements

// �Ϲ� Ŭ����
public class ClassTest extends Object{ // �θ� Object �� �ڽ� ClassTest �� ��ӹ޾Ƽ� �ڿ��� ����.
	// ����
	// ���
	public static final String XXX_XXX = "���ڿ��޿����";
	public static final int XXX_XXY = 1; // ���ڻ��
	
	// �������
	String sVal;
	int iVal;

	// �������� ??
	public String sVal1;
	public int iVal1;

	// Ŭ��������, ����ƽ����
	public static String sVal2;
	public static int iVAl2;

	// ����ȭ : encapsulation
	private String sVal3; // ���������� : private -> �ش�, ���� Ŭ���� �ȿ����� ��� ����
						  //           public -> �ٸ� ��Ű������ ����ٰ��� �� �� �ִ�.
	private String iVal3;

	// ������ : Ŭ������ �Ȱ��� �̸��� �޼ҵ带 �����ϸ� �װ� �������̴�.
	//        �θ� �����ڰ� �ִٸ�, �ڽ��� �ݵ�� �θ��� �����ڸ� �����Ű���� �ڹٿ����� �����ϰ� �ִ�.
	//        ex)     Ŭ������(){}
	//        ex)     public ClassTest(){}
	public ClassTest(){
		this(11);
		
	}

	public ClassTest(String sVal){
		this("Ȳ����", 11);
		this.sVal = sVal;
	}

	public ClassTest(int iVal){
		super();
		this.iVal = iVal;
	}

	public ClassTest(String sVal, int iVal){
		this.sVal = sVal;
		this.iVal = iVal;
	}


	// �Լ�
	public void aM(){
		
	}

	public String bM(){
		return "";
	}

	public static void aaM(){
		
	}

	public static String bbM(){
		return "";
	}

	// main()
	public static void main(String args[]){
		ClassTest ct0 = new ClassTest();
		ClassTest ct1 = new ClassTest(22);
		ClassTest ct2 = new ClassTest("�׽�Ʈ");	


	}


}