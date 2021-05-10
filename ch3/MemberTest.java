package a.b.c;

import com.bigdata30.ch2.member.vo.MemberVO;
import java.util.ArrayList;

public class MemberTest{

	public static void main(String args[]){
	
		String mname = "A00";
		String mid = "A00";
		String mpw = "A00";
		String mhp = "A00";
		String maddr = "A00";

		ArrayList aList = null;
		aList = new ArrayList();
		
		for (int i=0; i < 5; i++ )
		{
			MemberVO mvo = new MemberVO( mname + i
				                           ,mid + i
										   ,mpw + i
										   ,mhp + i
										   ,maddr + i);

			
			aList.add(mvo);
			System.out.println("aList >>> : " + aList);
		}

		for (int i=0; i < aList.size(); i++ )
		{
			MemberVO mvo = (MemberVO)aList.get(i);
			System.out.print(mvo.getMname() + " ");
			System.out.print(mvo.getMid() + " ");
			System.out.print(mvo.getMpw() + " ");
			System.out.print(mvo.getMhp() + " ");
			System.out.println(mvo.getMaddr());
		}
	}
}