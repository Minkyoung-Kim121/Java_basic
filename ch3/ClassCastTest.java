package a.b.c;

public class ClassCastTest{

	public static void main(String args[]){
	
	// <�θ�/�ڽ� Ŭ���� ��� ��� 4����> �� ������ ���� ���� 1,2��
	// 1. �ڽ�Ŭ���� �ڽ� = new �ڽ�Ŭ����();
	AAA a = new AAA();
	a.water();
	System.out.println(">>> : " + a.color);
	System.out.println(">>> : " + a.door);
	a.drive();
	a.stop();

	// ����ȯ
	BBB b = null;
	b = a; // b = (BBB)�� ������ a;
	b.drive();
	b.stop();
	System.out.println(">>> : " + b.color);
	System.out.println(">>> : " + b.door);
	
//	b.water();
	AAA a1 = (AAA)b;
	a1.water(); // -> water
	

	
	// 2. �θ�Ŭ���� �θ� = new �ڽ�Ŭ����(); -> �θ�Ŭ���� ����, �ڽ� �ν��Ͻ�
	BBB b1 = new AAA();
	b1.drive();
	b1.stop();
	System.out.println(">>> : " + b1.color);
	System.out.println(">>> : " + b1.door);
	
//	b1.water();
	AAA a2 = (AAA)b1;
	a2.water(); // -> water

	// 3. �θ�Ŭ���� �θ� = new �θ�Ŭ����();
	// 4. �ڽ�Ŭ���� �ڽ� = (�ڽ�Ŭ����)new �θ�Ŭ����(); -> �ڹٿ��� ���������� ���x
	
	}

}