package a.b.c;

//����� ���� ���� Ŭ����
import java.sql.*;
class IDFormatException extends Exception
{
	// ������
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
		
		if (userID == null) // String �� null �� �ʱ�ȭ
		{
			IDFormatException ide = new IDFormatException("���̵�� null�� �� �����ϴ�");
			throw ide;

		}else if (userID.length() < 8 || userID.length() > 20)
		{
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
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