package com.bigdata30.ch2.member.scr;

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.Scanner;

public class MemberLogin_1{

	public boolean memberLogin_1(MemberVO mvo){
		
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
		
		// ����� �μ��� id, pw �ޱ�
		if (2 == args.length)
		{
			String mid = args[0];
			String mpw = args[1];

			// ���� Ŭ������ �����ϱ�
			// VO �� �����ϱ�
			MemberVO mvo = null;
			mvo = new MemberVO();
			mvo.setMid(mid);
			mvo.setMpw(mpw);

			// �ڱ� �ڽ� Ŭ����(����� ���� Ŭ����)�� �ν��Ͻ� �ϱ�
			// �������� ml �� ���� ����ϰ��� �ϴ� �ڿ��� ȣ���ϸ� �ȴ�.
			MemberLogin_1 ml = new MemberLogin_1();
			boolean bool = ml.memberLogin_1(mvo);
			if (bool)
			{
				System.out.println("���̵� " + mvo.getMid() + "���� �α��ο� �����߽��ϴ�.");
			}else{
				System.out.println("�α��ο� �����߽��ϴ�.");
			}
		}else{
			System.out.println("�ֿܼ��� id ,pw, �� �Է��ϼ��� >>> : ");
		}
	} // end of main()
} // end of MemberLogin_1 class