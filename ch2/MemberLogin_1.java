package com.bigdata30.ch2.member.scr;

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.Scanner;

public class MemberLogin_1{

	public boolean memberLogin_1(MemberVO mvo){
		
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
		
		// 명령행 인수로 id, pw 받기
		if (2 == args.length)
		{
			String mid = args[0];
			String mpw = args[1];

			// 깡통 클래스에 세팅하기
			// VO 에 세팅하기
			MemberVO mvo = null;
			mvo = new MemberVO();
			mvo.setMid(mid);
			mvo.setMpw(mpw);

			// 자기 자신 클래스(사용자 정의 클래스)를 인스턴스 하기
			// 참조변수 ml 로 내가 사용하고자 하는 자원을 호출하면 된다.
			MemberLogin_1 ml = new MemberLogin_1();
			boolean bool = ml.memberLogin_1(mvo);
			if (bool)
			{
				System.out.println("아이디 " + mvo.getMid() + "님이 로그인에 성공했습니다.");
			}else{
				System.out.println("로그인에 실패했습니다.");
			}
		}else{
			System.out.println("콘솔에서 id ,pw, 를 입력하세요 >>> : ");
		}
	} // end of main()
} // end of MemberLogin_1 class