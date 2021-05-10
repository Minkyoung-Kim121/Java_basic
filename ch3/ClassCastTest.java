package a.b.c;

public class ClassCastTest{

	public static void main(String args[]){
	
	// <부모/자식 클래스 사용 방법 4가지> 중 실제로 쓰는 것은 1,2번
	// 1. 자식클래스 자식 = new 자식클래스();
	AAA a = new AAA();
	a.water();
	System.out.println(">>> : " + a.color);
	System.out.println(">>> : " + a.door);
	a.drive();
	a.stop();

	// 형변환
	BBB b = null;
	b = a; // b = (BBB)가 생략된 a;
	b.drive();
	b.stop();
	System.out.println(">>> : " + b.color);
	System.out.println(">>> : " + b.door);
	
//	b.water();
	AAA a1 = (AAA)b;
	a1.water(); // -> water
	

	
	// 2. 부모클래스 부모 = new 자식클래스(); -> 부모클래스 선언, 자식 인스턴스
	BBB b1 = new AAA();
	b1.drive();
	b1.stop();
	System.out.println(">>> : " + b1.color);
	System.out.println(">>> : " + b1.door);
	
//	b1.water();
	AAA a2 = (AAA)b1;
	a2.water(); // -> water

	// 3. 부모클래스 부모 = new 부모클래스();
	// 4. 자식클래스 자식 = (자식클래스)new 부모클래스(); -> 자바에서 문법적으로 허용x
	
	}

}