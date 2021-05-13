package com.bigdata30.ch2.member.scr;

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.Scanner;

public class MemberLogin{

	public boolean memberLogin(MemberVO mvo){
		
		String _mid = "KMK";
		String _mpw = "KMK00";
		boolean bool = false;

		// String 클래스에 있는 equals() 함수는 문자열을 비교하는 함수.
		// String 클래스에 있는 toUpperCase() 함수는 문자열을 대문자로 바꾸는 함수.
		if (_mid.equals(mvo.getMid().toUpperCase()) 
			       && _mpw.equals(mvo.getMpw().toUpperCase()))
		{
			bool = true;
		}

		return bool;

	}
	public static void main(String args[]){
		
		// Scanner 클래스를 이용해서 id, pw 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
		System.out.println("아이디 입력");
		String mid = sc.next();
		System.out.println("mid >>> : " + mid);
		System.out.println("패스워드 입력");
		String mpw = sc.next();
		System.out.println("mpw >>> : " + mpw);

		// 깡통 클래스에 세팅하기
		// VO 에 세팅하기
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setMid(mid);
		mvo.setMpw(mpw);

		// 자기 자신 클래스(사용자 정의 클래스)를 인스턴스 하기
		// 참조변수 ml 로 내가 사용하고자 하는 자원을 호출하면 된다.
		MemberLogin ml = new MemberLogin();
		boolean bool = ml.memberLogin(mvo);
		if (bool)
		{
			System.out.println("아이디 " + mvo.getMid() + "님이 로그인에 성공했습니다.");
		}else{
			System.out.println("로그인에 실패했습니다.");
		}

	} // end of main()
} // end of MemberLogin class