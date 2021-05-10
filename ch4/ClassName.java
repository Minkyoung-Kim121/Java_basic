package a.b.c;


public class ClassName extends Object{

	public void aM(){
		System.out.println("aM()");
	}
	
	public static void main(String args[]){
		
		ClassName cn = new ClassName();
		System.out.println("cn 참조변수 >>> : " + cn);
		System.out.println("cn.getClass() >>> : " + cn.getClass());
		System.out.println("cn.getClass().getName() >>> : " + cn.getClass().getName());

		Object obj = new ClassName();
		System.out.println("obj 참조변수 >>> : " + obj);
		// 부모클래스 obj 에서 자식클래스 ClassName 을 꺼내놓은 것
		// obj 에서 ClassName 캐스팅 한 것
		// obj 에서 ClassName 으로 객체 형변환 한것

		ClassName cn1 = (ClassName)obj;
		System.out.println("cn1 참조변수 >>> : " + cn1);
		System.out.println("cn1.getClass() 참조변수 >>> : " + cn1.getClass());
		System.out.println("cn1.getClass().getName() 참조변수 >>> : " + cn1.getClass().getName());

		
		try
		{
			Class cc = Class.forName("a.b.c.ClassName");
			System.out.println("cc >>> : " + cc);
			ClassName cc11 = (ClassName)cc.newInstance();
			cc11.aM();
		}
		catch (Exception c)
		{
			System.out.println("c >>> : " + c);
		}

	}



}