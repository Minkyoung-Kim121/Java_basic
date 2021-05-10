package a.b.c;

//사용자 정의 예외 클래스
import java.sql.*;
class IDFormatException extends Exception
{
	// 생성자
	public IDFormatException(String s){
		super(s);
	}
}

class IDFormatTest{
	private String userID;
	
	public String getUserID(){
		
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null) // String 을 null 로 초기화
		{
			IDFormatException ide = new IDFormatException("아이디는 null일 수 없습니다");
			throw ide;

		}else if (userID.length() < 8 || userID.length() > 20)
		{
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}

		this.userID = userID;
	}


	// main()
	public static void main(String[] args){
		
		IDFormatTest test = new IDFormatTest();

		String userID = null;
		try
		{
			test.setUserID(userID);
		}
		catch (IDFormatException e)
		{
			System.out.println("e.getMessage() >>> : " + e.getMessage());
		}


		userID = "1234567";
		try
		{
			test.setUserID(userID);
		}
		catch (IDFormatException e)
		{
			System.out.println("e.getMessage() >>> : " + e.getMessage());
		}


	} // end of main()


} // end of IDFormatTest class