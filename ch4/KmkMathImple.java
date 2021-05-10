package a.b.c;

// interface 함수를 구현해주는 구현부를 만들어 주는 역할
//  함수(); -> 뒤에 {} 로 바꿔서 구현부만 만들어줌!
// 메인은 쓰면 안 된다. 세 개 의 클래스가 묶여서 KmkMathScr.java 에서 자원을 쓸거기 때문
// 자원, 즉 함수 호출은 메인에서!!!-> 실행하는 자바파일의 메인에서 
import java.math.BigDecimal;

public class KmkMathImple implements KmkMath{ // 상속에서만 자식 변수 = new 부모 등등 쓰는 것
	// 자원을 쓸 때는 이 규칙 x   KmkMathScr.java

	@Override // 함수 위에 각각 다 붙여야 한다.
	public BigDecimal add(String x, String y){

//	System.out.println("add()" + add());    -> 함수를 또 불러서 출력하면 계속 돌고 같은 실수를 반복하고...
	System.out.println("KosMathImpl add 함수 시작 >>> : ");
	
	System.out.println("KosMathImpl add 함수 끝 >>> : ");
		
		return null;
	}

	@Override
	public BigDecimal subtract(String x, String y){
	System.out.println("KosMathImpl subtract 함수 시작 >>> : ");
	
	System.out.println("KosMathImpl subtract 함수 끝 >>> : ");
		return null;
	}

	@Override
	public BigDecimal multiply(String x, String y){
	System.out.println("KosMathImpl multiply 함수 시작 >>> : ");
	
	System.out.println("KosMathImpl multiply 함수 끝 >>> : ");
	}

	@Override
	public BigDecimal divide(String x, String y){
	System.out.println("KosMathImpl divide 함수 시작 >>> : ");
	
	System.out.println("KosMathImpl divide 함수 끝 >>> : ");	
		return null;
	}






}