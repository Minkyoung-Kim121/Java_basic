package a.b.c;

import com.bigdata30.ch2.member.vo.MemberVO;
/*
자바 클래스 패스 컴파일

javac -classpath -d . "C:\00.KOSMO72\00.JExam\ch2\MemberVO.java" MemberTest.java
javac -cp -d . "파일절대경로\*.java"
-> 하지만 이건 나중에 하고 지금은 같은 파일로 옮겨놓고 import javac 하기.
*/
import java.util.ArrayList;

public class MemberTest_1{

	public static void main(String args[]){
	
		String mname = "A00";
		String mid = "A00";
		String mpw = "A00";
		String mhp = "A00";
		String maddr = "A00";

		ArrayList<MemberVO> aList = null; // -> <데이터타입> MemberVO만 데이터 타입으로 써라
		// ArrayList aList를 null로 초기화한 이유
		// -> 1. 자바에서는 메모리 해제 권한이 개발자에게 없고 jvm에게 있다.
		//    2. 함수 블럭에서 선언한 데이터(문자, 숫자, 객체)는 
		//       각각의 default value로 초기화한다.
		//       문자열 : null
		//       문자 : '\u0000'
		//       숫자 : 0, 0.0
		//       boolean : false
		//       객체 : null
		//    3. 함수 블럭에서 선언한 데이터 타입의 변수는
		//       데이터를 다 사용하고 나서 jvm 이 메모리에서 해제하여 준다.
		//    4. 객체에 null 초기화 하는 이유는 
		//       데이터를 다 사용하고 나서 개발자가 메모리 해제를 할 수 없기 때문이다.
		//       따라서 다시 null로 초기화 한다.
		
		//       if (aList !=null){
		//            aList = null;
		//          }

		aList = new ArrayList<MemberVO>();
		
		for (int i=0; i < 5; i++ ) // int i=0 으로 초기화하고, 한번 돌고
								   // i=1,2,3,4 돈다. 
		{
		//     참조변수      mvo1
			MemberVO mvo1 = new MemberVO( mname + i
				                           ,mid + i
										   ,mpw + i
										   ,mhp + i
										   ,maddr + i);

			
			aList.add(mvo1); //: 주소값을 불러온다.

			System.out.println("aList >>> : " + aList);
			// -> aList >>> : + 주소값 출력
		}
// Q) casting, Object class, for문 set(), get()
		for (int i=0; i < aList.size(); i++ )
		{
			MemberVO mvo1 = aList.get(i);
			System.out.print(mvo1.getMname() + " ");
			System.out.print(mvo1.getMid() + " ");
			System.out.print(mvo1.getMpw() + " ");
			System.out.print(mvo1.getMhp() + " ");
			System.out.println(mvo1.getMaddr());
		}
	}
}





/* MemberVO.java
package com.bigdata30.ch2.member.vo;

// 현대 코딩에서 모든 데이터는 VO 담아서 프로그램 한다.
// VO : Value Object : 클래스명 뒤에 접미어로 대문자로 표기한다.

public class MemberVO{

	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String maddr;

	// 기본 생성자
	public MemberVO(){
		
	}

	// 매개변수 2개있는 생성자
	public MemberVO( String mid,String mpw){
		this.mid = mid;
		this.mpw = mpw;
		
	}

	// 매개변수 5개있는 생성자 
	public MemberVO( String mname,String mid,String mpw,String mhp,String maddr){
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.maddr = maddr;
	}

	// setter() 함수 : 초기화 하는 함수
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

*/