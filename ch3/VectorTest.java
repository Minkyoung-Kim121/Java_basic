package a.b.c;

import java.util.Vector;
import com.bigdata30.ch2.member.vo.MemberVO;

public class VectorTest{
	
	public static void main(String args[]){
		
		Vector v = new Vector();
		System.out.println("v �������� >>> : " + v);

		v.add("�̵���");
		String s = (String)v.get(0); // vector Ŭ������ get() �Լ��� �������� object
		System.out.println("s >>> : " + s);
//		System.out.println("v �������� >>> : " + v);

		v.add("Ȳ����");
		String s1 = (String)v.get(1);
		System.out.println("s1 >>> : " + s1);
//		System.out.println("v �������� >>> : " + v);


		int iArr[] = new int[]{1, 2, 3, 4, 5};
		v.add(iArr);
		int iArrVal[] = (int[])v.get(2);

		System.out.println("iArrVal >>> : " + iArrVal);
	
		for (int i=0; i < iArrVal.length; i++)
		{
			System.out.println("iArrVal["+i+"] >>> : " + iArrVal[i]);
		}

//		System.out.println("v �������� >>> : " + v);

		MemberVO mvo = new MemberVO("�հ���", "SKS", "SKS00", "010-1234-1564", "����� ���۱� �󵵵�");
		v.add(mvo);
		MemberVO mvo1 = (MemberVO)v.get(3);
		System.out.println("mvol >>> : " + mvo1);
		System.out.println("mvol.getMname() >>> : " + mvo1.getMname());
		System.out.println("mvol.getMid() >>> : " + mvo1.getMid());
		System.out.println("mvol.getMpw() >>> : " + mvo1.getMpw());
		System.out.println("mvol.getMhp() >>> : " + mvo1.getMhp());
		System.out.println("mvol.getMaddr() >>> : " + mvo1.getMaddr());
//		System.out.println("v �������� >>> : " + v);

		VectorTest vt = new VectorTest();
		v.add(vt);
		VectorTest vt_1 = (VectorTest)v.get(4);
		System.out.println("vt_1 >>> : " + vt_1);
//		System.out.println("v �������� >>> : " + v);

		v.add(new Integer(100));
		Integer ii = (Integer)v.get(5);
		System.out.println("ii >>> : " + ii);
//		System.out.println("v �������� >>> : " + v);

		v.add(new java.util.Date());
		java.util.Date d = (java.util.Date)v.get(6);
		System.out.println("d >>> : " + d);
//		System.out.println("v �������� >>> : " + v);

/*
		for (int i=0; i < v.size(); i++)
		{
			System.out.println("v.get("+i+") >>> : " + v.get);
		}
*/
	}

}