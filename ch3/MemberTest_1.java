package a.b.c;

import com.bigdata30.ch2.member.vo.MemberVO;
/*
�ڹ� Ŭ���� �н� ������

javac -classpath -d . "C:\00.KOSMO72\00.JExam\ch2\MemberVO.java" MemberTest.java
javac -cp -d . "����������\*.java"
-> ������ �̰� ���߿� �ϰ� ������ ���� ���Ϸ� �Űܳ��� import javac �ϱ�.
*/
import java.util.ArrayList;

public class MemberTest_1{

	public static void main(String args[]){
	
		String mname = "A00";
		String mid = "A00";
		String mpw = "A00";
		String mhp = "A00";
		String maddr = "A00";

		ArrayList<MemberVO> aList = null; // -> <������Ÿ��> MemberVO�� ������ Ÿ������ ���
		// ArrayList aList�� null�� �ʱ�ȭ�� ����
		// -> 1. �ڹٿ����� �޸� ���� ������ �����ڿ��� ���� jvm���� �ִ�.
		//    2. �Լ� ������ ������ ������(����, ����, ��ü)�� 
		//       ������ default value�� �ʱ�ȭ�Ѵ�.
		//       ���ڿ� : null
		//       ���� : '\u0000'
		//       ���� : 0, 0.0
		//       boolean : false
		//       ��ü : null
		//    3. �Լ� ������ ������ ������ Ÿ���� ������
		//       �����͸� �� ����ϰ� ���� jvm �� �޸𸮿��� �����Ͽ� �ش�.
		//    4. ��ü�� null �ʱ�ȭ �ϴ� ������ 
		//       �����͸� �� ����ϰ� ���� �����ڰ� �޸� ������ �� �� ���� �����̴�.
		//       ���� �ٽ� null�� �ʱ�ȭ �Ѵ�.
		
		//       if (aList !=null){
		//            aList = null;
		//          }

		aList = new ArrayList<MemberVO>();
		
		for (int i=0; i < 5; i++ ) // int i=0 ���� �ʱ�ȭ�ϰ�, �ѹ� ����
								   // i=1,2,3,4 ����. 
		{
		//     ��������      mvo1
			MemberVO mvo1 = new MemberVO( mname + i
				                           ,mid + i
										   ,mpw + i
										   ,mhp + i
										   ,maddr + i);

			
			aList.add(mvo1); //: �ּҰ��� �ҷ��´�.

			System.out.println("aList >>> : " + aList);
			// -> aList >>> : + �ּҰ� ���
		}
// Q) casting, Object class, for�� set(), get()
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

// ���� �ڵ����� ��� �����ʹ� VO ��Ƽ� ���α׷� �Ѵ�.
// VO : Value Object : Ŭ������ �ڿ� ���̾�� �빮�ڷ� ǥ���Ѵ�.

public class MemberVO{

	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String maddr;

	// �⺻ ������
	public MemberVO(){
		
	}

	// �Ű����� 2���ִ� ������
	public MemberVO( String mid,String mpw){
		this.mid = mid;
		this.mpw = mpw;
		
	}

	// �Ű����� 5���ִ� ������ 
	public MemberVO( String mname,String mid,String mpw,String mhp,String maddr){
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.maddr = maddr;
	}

	// setter() �Լ� : �ʱ�ȭ �ϴ� �Լ�
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

	// getter() �Լ� : ���� �ϴ� �Լ�
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