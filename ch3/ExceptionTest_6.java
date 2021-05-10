package a.b.c;


import java.sql.*;

public class ExceptionTest_6{

	
	public static void main(String args[]){

	try
	{
		throw new Exception();
	}
	catch (Exception e)
	{
		System.out.println("e >>> : " + e);
	}

	} // end of main()


} // end of ExceptionTest_6 class