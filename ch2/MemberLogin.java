package com.bigdata30.ch2.member.scr;

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.Scanner;

public class MemberLogin{

	public boolean memberLogin(MemberVO mvo){
		
		String _mid = "KMK";
		String _mpw = "KMK00";
		boolean bool = false;

		// String Ŭ������ �ִ� equals() �Լ��� ���ڿ��� ���ϴ� �Լ�.
		// String Ŭ������ �ִ� toUpperCase() �Լ��� ���ڿ��� �빮�ڷ� �ٲٴ� �Լ�.
		if (_mid.equals(mvo.getMid().toUpperCase()) 
			       && _mpw.equals(mvo.getMpw().toUpperCase()))
		{
			bool = true;
		}

		return bool;

	}
	public static void main(String args[]){
		
		// Scanner Ŭ������ �̿��ؼ� id, pw �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
		System.out.println("���̵� �Է�");
		String mid = sc.next();
		System.out.println("mid >>> : " + mid);
		System.out.println("�н����� �Է�");
		String mpw = sc.next();
		System.out.println("mpw >>> : " + mpw);

		// ���� Ŭ������ �����ϱ�
		// VO �� �����ϱ�
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setMid(mid);
		mvo.setMpw(mpw);

		// �ڱ� �ڽ� Ŭ����(����� ���� Ŭ����)�� �ν��Ͻ� �ϱ�
		// �������� ml �� ���� ����ϰ��� �ϴ� �ڿ��� ȣ���ϸ� �ȴ�.
		MemberLogin ml = new MemberLogin();
		boolean bool = ml.memberLogin(mvo);
		if (bool)
		{
			System.out.println("���̵� " + mvo.getMid() + "���� �α��ο� �����߽��ϴ�.");
		}else{
			System.out.println("�α��ο� �����߽��ϴ�.");
		}

	} // end of main()
} // end of MemberLogin class