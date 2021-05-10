package com.bigdata30.ch2.member.vo;

// 자바에서 사용하는 Beans 컴포넌트 기술
// Bean : 콩 : com : 데이터를 담는 통
// 현대 코딩에서 모든 데이터는 VO 담아서 프로그램 한다.
// VO : Value Object : 클래스명 뒤에 접미어로 대문자로 표기한다.
//멤버변수를 private : 은닉화 : encapsulation
// 은닉화 한 데이터를 
// setter() 함수로 초기화 하고
// getter() 함수로 리턴해서 사용한다.
// 기본 생성자(매개변수 없는 생성자 이용하고)
// 또는 사용 방법에 따라
// 생성자(매개 변수가 있는 생성자)를 이용해서 멤버필드를 초기화 해도 된다.

// 깡통 글래스, Value object 클래스, DTO 클래스 라고 부름.
public class MemberVO{

	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String maddr;


// 생성자 오버로딩을 이용한다.
// 멤버변수를 인스터스 하면서 초기화 하기 위해서 사용 하는 것

// 오버로딩 : 함수 이름은 같고
//		  : 매개변수가 다른 것 : 갯수, 타입
// 자기 클래스 안에서

	// 기본 생성자
	public MemberVO(){
		
	}

	// 매개변수 2개있는 생성자
	public MemberVO( String mid,String mpw){
		this.mid = mid;
		this.mpw = mpw;
		
	}

	// 매개변수 5개있는 생성자 
	// 이렇게 초기화 해도 되고
	public MemberVO( String mname,String mid,String mpw,String mhp,String maddr){
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.maddr = maddr;
	}

	// setter() 함수 : 초기화 하는 함수
	// 이렇게 초기화 해도 된다.
	public void setMname(String mname){
		this.mname = mname; 
	}
	public void setMid(String mid){
		this.mid = mid;
	}
	public void setMpw(String mpw){
		this.mpw = mpw; 
	}
	public void setMhp(String mhp){
		this.mhp = mhp; 
	}
	public void setMaddr(String maddr){
		this.maddr = maddr;
	}

	// getter() 함수 : 리턴 하는 함수
	public String getMname(){
		return this.mname; 
	}
	public String getMid(){
		return this.mid; 
	}
	public String getMpw(){
		return this.mpw; 
	}
	public String getMhp(){
		return this.mhp; 
	}
	public String getMaddr(){
		return this.maddr; 
	}
}

