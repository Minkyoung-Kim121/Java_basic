package a.b.c;

// PrivateTest.java 파일에 PrivateTest.class / PrivateValue.class 두 개를 만듦
//                       (클래스 블럭 내부에 만드는 inner 클래스와는 다른 것이다.)
// PrivateTest.java를 컴파일링하면)
//                        PrivateTest.class / PrivateValue.class 두 개 생성.
public class PrivateTest{

	public static void main(String args[]){
	

		PrivateValue pv = new PrivateValue();
		//System.out.println("pv.iVal >>> : " + pv.iVal);
		pv.setIVal(10);
		System.out.println("pv.getIVal() >>> : " + pv.getIVal());
		pv.setSval("테스트");
		System.out.println("pv.getSval() >>> : " + pv.getSval());
		PrivateValue pv_1 = new PrivateValue(27, "김만두");
		System.out.println("pv_1.getIVal() >>> : " + pv_1.getIVal());
		System.out.println("pv_1.getSval() >>> : " + pv_1.getSval());

		//교재 p.162
	} // end of main()
	} // end of PrivateTest class


class PrivateValue
{
//A)멤버변수 (private)의 특징)
	// private 접근제한자(Access Modifier)
	// 선언된 클래스 블럭 내부에서만 사용 가능하다.
	// 자바에서 이것을 정보은닉화(encapsulation) 라고 한다.★
	//encapsulation : 자바에서 자랑하는 Bean(콩/컴포넌트)기술.

	private int iVal;
	private String sval;
	
	public PrivateValue(){
		
	}

	public PrivateValue(int iVal, String sval){
		this.iVal = iVal;
		this.sval = sval;
	}

/*B)iVal()함수를 setter함수로 만드는 방법)★
		setter 함수라고 부른다.
		set(접두어) + 해당 변수의 첫번째 이니셜을 대문자로해서 함수이름을 만든다.
		ex) set + IVal() -> setIVal(int iVal) : 매개변수에 해당 데이터형을 선언한다.
		this.iVal = iVal
		                : 초기화된 매개변수의 데이터를 private이 선언된 멤버변수에 복사한다.
						 (이때, this 키워드를 사용한다.)
	특징)	초기화 함수
		리턴형 : void
		접근제한자 : public
	*/

	public void setIVal(int iVal){
		this.iVal = iVal;
	}
	public void setSval(String sval){
		this.iVal = iVal;	
	}
	/*
C)iVal()함수를 getter함수로 만드는 방법)★
		getter 함수라고 부른다.
		get()함수는 리턴 함수
		get(접두어) + IVal()해당 변수의 첫번째 이니셜을 대문자로해서 함수 이름을 만든다.
		리턴형 : 해당 데이터형을 선언
		매개변수는 없다.
		return 키워드 + 해당 멤버변수에 this 키워드를 붙여 사용.
	*/

	public int getIVal(){
		return this.iVal;
	}
	public String getSval(){
		return this.sval;
	}
} // end of PrivateValue class