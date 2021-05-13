package com.bigdata30.ch2.member.scr;

/*
MemberScr.java
MemberVO.java
두 개의 자바 파일을 코딩하여 결과를 출력하고,
MemberScr 코드의 main() 함수에서 Scanner 클래스를 이용하여
데이터 5개를 받고 MemberVO에 세팅 후 콘솔에 출력하세요.
*/

// 데이터를 사용할 때 문자열, 문자, 숫자(정수, 실수) 했었다면, 
// -> String s, char c, int i, double d
// 지금은 사용자 정의로 만든 (MemberVO 클래스)클래스를 데이터로 사용하는 것을 공부하는 중.
//                                                (객체를 데이터로 사용하는 것)
// MemberVO 클래스 -> 데이터 클래스
//               회원이름, 아이디, 패스워드, 전화번호, 주소 등 5개의 데이터가
//               들어가 있는 객체(클래스)이다.
// MemberVO mvo 
// MemberVO -> 사용자 정의로 된 클래스 이름 (객체/생성자 데이터 타입)
// mvo -> 참조변수 (주소값을 가지는 참조변수)
//        위의 참조변수는 MemberVO 클래스에 있는 자원을 말한다.
//        멤버변수 5개, 생성자 2개, setter() 함수 5개, getter() 함수 5개

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.Scanner;

public class MemberScr{

	// 호출된 함수에서 아규먼트로 보낸 mvo 참조변수를 memberInsert 함수 안에서,
	//                                     데이터 타입을 선언하여 받았음.
	// 매개변수 데이터 타입인 mvo 변수로 memberInsert 함수 내에서 사용 가능하다.
	public boolean memberInsert(MemberVO mvo){
		System.out.println("memberInsert(MemberVO mvo) >>> : " + mvo);
		System.out.println("mvo.getMname() >>> : " + mvo.getMname());
		System.out.println("mvo.getMid() >>> : " + mvo.getMid());
		System.out.println("mvo.getMpw() >>> : " + mvo.getMpw());
		System.out.println("mvo.getMhp() >>> : " + mvo.getMhp());
		System.out.println("mvo.getMaddr() >>> : " + mvo.getMaddr());
		
		boolean bool = false;
		
		// 데이터베이스 연동 로직 
		bool = true;

		return bool;
	}

	public static void main(String args[]){

		// 지역변수로 초기화
		// String 클래스를 지역변수로 초기화 할 때는 ""(빈 문자열, length() 0)으로 한다.
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String maddr = "";

		// Scanner 클래스를 이용해서 회원가입 데이터 
		// 바인딩 하기 >>> : 
		Scanner sc = new Scanner(System.in);
		System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
		System.out.println("이름 입력하기");
		mname = sc.next();
		System.out.println("아이디 입력하기");
		mid = sc.next();
		System.out.println("패스워드 입력하기");
		mpw = sc.next();
		System.out.println("전화번호 입력하기");
		mhp = sc.next();
		System.out.println("주소 입력하기");
		sc.nextLine(); // 개행 문자 제거하기 (\n)
		maddr = sc.nextLine();

		// MemberVO 사용자 정의 클래스를 데이터로 사용하기 위해 선언했다.
		// mvo -> MemberVO 클래스를 사용하기 위해 mvo 참조변수를 선언했다.
		// new -> 인스턴스했다.
		// MemberVO -> 매개변수가 없는 생성자 Member Field를 초기화했다.
		// MemberVO mvo = new MemberVO();
		// VO 클래스는 선언 시 반드시 null 로 초기화 하여 사용한다.
		MemberVO mvo = null; // null로 초기화한다.
		mvo = new MemberVO();
		System.out.println("참조변수 주소값 >>> : " + mvo);
		// mvo 참조변수로 setter() 함수를 이용하여 데이터 초기화하기.
		mvo.setMname(mname);
		mvo.setMid(mid);
		mvo.setMpw(mpw);
		mvo.setMhp(mhp);
		mvo.setMaddr(maddr);

		// 사용자 정의 MemberScr 클래스 선언
		// 참조변수 ms 
		MemberScr ms = new MemberScr();
		// ms 참조변수로 memberInsert() 함수 호출
		// 아규먼트는 mvo -> MemberVO 사용자 데이터 참조변수
		boolean bInsert = ms.memberInsert(mvo);
		if (bInsert)
		{
			System.out.println("회원가입이 성공 되었습니다.");
		}else{
			System.out.println("회원가입이 실패 했습니다.");
		}
	}
}