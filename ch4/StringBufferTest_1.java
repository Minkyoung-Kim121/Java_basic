package a.b.c;



abstract class SqlQueryMap{/* 부모 */ 

	public static String getSelectQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT \n");
		sb.append("        A.NAME AS NAME  \n");
		sb.append("        A.ID   AS ID    \n");
		sb.append("        A.PW   AS PW    \n");
		sb.append("        A.HP   AS HP    \n");
		sb.append("        A.ADDR AS ADDR  \n");
		sb.append("FROM    MEMBER A        \n");

		return sb.toString(); // -> StringBuffer 는 String 으로 바꿔서 리턴.

	}

	// 추상클래스에 있는 추상함수
	public abstract void aM();

} // end of SqlQueryMap class abstract

public class StringBufferTest_1 /* 자식 */ extends SqlQueryMap/* 부모 */{
	// extends -> 추상함수 aM() 함수를 인스턴스 하기 위해 상속함.

	@Override // 오버라이딩  ->  상속시켜서 써(규칙)
	public void aM(){
		System.out.println("SqlQueryMap 추상클래스에서 "
		                   + "\n aM() 추상함수를 "
						   + "\n StringBufferTest_1 클래스로 "
						   + "\n 오버라이드해서 구현체를 만들었음 "
						   + "\n 구현체를 만든다는 의미는 {} 을 만든다는 것임 ");
	}


	public static void main(String args[]){
		
		String selectQuery = SqlQueryMap.getSelectQuery();
		System.out.println("\n" + selectQuery);

		// SqlQueryMap sqm = new SqlQueryMap();    추상함수는 new를 사용해서 인스턴스 하면 x
		//									       상속해서 사용해야 한다.
		StringBufferTest_1 sb1 = new StringBufferTest_1();
		// SqlQueryMap 는 상속해준 부모 클래스, 
		// extends 상속 방법 : 자식 클래스를 변수 사용해서 new 인스턴스 한다.
		sb1.aM(); // aM() 함수 호출. 위로 올라가서 보세요.

	} // end of main()


} // end of StringBufferTest_1 class

//=>결론?
// 클래스가 두 개 1) 추상 클래스 : SqlQueryMap (상속 관계 : 부모)
//			   2) 일반 클래스 : StringBufferTest_1 (상속 관계 : 자식)
// 추상클래스 SqlQueryMap에 있는 추상 함수 aM() 을 호출하기 위해서,
// 인스턴스를 해야 하는데, 추상함수는 new 를 바로 쓸 수 가 없기 때문에 상속을 해서 인스턴스 해야한다.
// 따라서 extends 키워드를 이용해서 부모->자식 상속 후 자식 new 인스턴스 후, aM() 함수를 호출했다.

// Q) implements 를 쓰지 않은 이유 : 부모 여럿의 자원을 쓰려는 것이 아니라, aM() 함수를 위해 상속을 한 것이기 때문에 extends 사용.
// A)  만약 여러개 부모를 자원으로 쓰기위해서는 implements 해야하는데, abstract 클래스(추상클래스)는  단일 상속만 되기 때문에 그 때에는,
//     인터페이스를 사용해야 한다.