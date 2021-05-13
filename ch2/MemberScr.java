package com.bigdata30.ch2.member.scr;

/*
MemberScr.java
MemberVO.java
�� ���� �ڹ� ������ �ڵ��Ͽ� ����� ����ϰ�,
MemberScr �ڵ��� main() �Լ����� Scanner Ŭ������ �̿��Ͽ�
������ 5���� �ް� MemberVO�� ���� �� �ֿܼ� ����ϼ���.
*/

// �����͸� ����� �� ���ڿ�, ����, ����(����, �Ǽ�) �߾��ٸ�, 
// -> String s, char c, int i, double d
// ������ ����� ���Ƿ� ���� (MemberVO Ŭ����)Ŭ������ �����ͷ� ����ϴ� ���� �����ϴ� ��.
//                                                (��ü�� �����ͷ� ����ϴ� ��)
// MemberVO Ŭ���� -> ������ Ŭ����
//               ȸ���̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ� �� 5���� �����Ͱ�
//               �� �ִ� ��ü(Ŭ����)�̴�.
// MemberVO mvo 
// MemberVO -> ����� ���Ƿ� �� Ŭ���� �̸� (��ü/������ ������ Ÿ��)
// mvo -> �������� (�ּҰ��� ������ ��������)
//        ���� ���������� MemberVO Ŭ������ �ִ� �ڿ��� ���Ѵ�.
//        ������� 5��, ������ 2��, setter() �Լ� 5��, getter() �Լ� 5��

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.Scanner;

public class MemberScr{

	// ȣ��� �Լ����� �ƱԸ�Ʈ�� ���� mvo ���������� memberInsert �Լ� �ȿ���,
	//                                     ������ Ÿ���� �����Ͽ� �޾���.
	// �Ű����� ������ Ÿ���� mvo ������ memberInsert �Լ� ������ ��� �����ϴ�.
	public boolean memberInsert(MemberVO mvo){
		System.out.println("memberInsert(MemberVO mvo) >>> : " + mvo);
		System.out.println("mvo.getMname() >>> : " + mvo.getMname());
		System.out.println("mvo.getMid() >>> : " + mvo.getMid());
		System.out.println("mvo.getMpw() >>> : " + mvo.getMpw());
		System.out.println("mvo.getMhp() >>> : " + mvo.getMhp());
		System.out.println("mvo.getMaddr() >>> : " + mvo.getMaddr());
		
		boolean bool = false;
		
		// �����ͺ��̽� ���� ���� 
		bool = true;

		return bool;
	}

	public static void main(String args[]){

		// ���������� �ʱ�ȭ
		// String Ŭ������ ���������� �ʱ�ȭ �� ���� ""(�� ���ڿ�, length() 0)���� �Ѵ�.
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String maddr = "";

		// Scanner Ŭ������ �̿��ؼ� ȸ������ ������ 
		// ���ε� �ϱ� >>> : 
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
		System.out.println("�̸� �Է��ϱ�");
		mname = sc.next();
		System.out.println("���̵� �Է��ϱ�");
		mid = sc.next();
		System.out.println("�н����� �Է��ϱ�");
		mpw = sc.next();
		System.out.println("��ȭ��ȣ �Է��ϱ�");
		mhp = sc.next();
		System.out.println("�ּ� �Է��ϱ�");
		sc.nextLine(); // ���� ���� �����ϱ� (\n)
		maddr = sc.nextLine();

		// MemberVO ����� ���� Ŭ������ �����ͷ� ����ϱ� ���� �����ߴ�.
		// mvo -> MemberVO Ŭ������ ����ϱ� ���� mvo ���������� �����ߴ�.
		// new -> �ν��Ͻ��ߴ�.
		// MemberVO -> �Ű������� ���� ������ Member Field�� �ʱ�ȭ�ߴ�.
		// MemberVO mvo = new MemberVO();
		// VO Ŭ������ ���� �� �ݵ�� null �� �ʱ�ȭ �Ͽ� ����Ѵ�.
		MemberVO mvo = null; // null�� �ʱ�ȭ�Ѵ�.
		mvo = new MemberVO();
		System.out.println("�������� �ּҰ� >>> : " + mvo);
		// mvo ���������� setter() �Լ��� �̿��Ͽ� ������ �ʱ�ȭ�ϱ�.
		mvo.setMname(mname);
		mvo.setMid(mid);
		mvo.setMpw(mpw);
		mvo.setMhp(mhp);
		mvo.setMaddr(maddr);

		// ����� ���� MemberScr Ŭ���� ����
		// �������� ms 
		MemberScr ms = new MemberScr();
		// ms ���������� memberInsert() �Լ� ȣ��
		// �ƱԸ�Ʈ�� mvo -> MemberVO ����� ������ ��������
		boolean bInsert = ms.memberInsert(mvo);
		if (bInsert)
		{
			System.out.println("ȸ�������� ���� �Ǿ����ϴ�.");
		}else{
			System.out.println("ȸ�������� ���� �߽��ϴ�.");
		}
	}
}