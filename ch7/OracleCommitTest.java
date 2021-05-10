package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleCommitTest{
	
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver";

	public static final String EMP_SELECT = "SELECT * FROM TESTTABLE_4";

	
	public OracleCommitTest(){
		try
		{
			Class.forName(OracleCommitTest.ORCL_FORNAME);
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("드라이버 찻기 문제가 생김 >>> : " + c);
		}
	}

	public void empSelect(){

		Connection conn = null;
		PreparedStatement  pstmt = null;
		ResultSet  rsRs = null;

		try
		{
			conn = DriverManager.getConnection( OracleCommitTest.ORCL_URL
											   ,OracleCommitTest.ORCL_USER
			                                   ,OracleCommitTest.ORCL_PASS);			
			pstmt = conn.prepareStatement(OracleCommitTest.EMP_SELECT);
			System.out.println("쿼리문 >>> : \n"+ OracleCommitTest.EMP_SELECT);
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null)
			{
				while (rsRs.next())
				{
					System.out.print(rsRs.getNString(1) + " : ");
					System.out.print(rsRs.getNString(2) + " : ");
					System.out.print(rsRs.getNString(3) + " : ");
					System.out.println(rsRs.getNString(4));					
				}
			}			
		}
		catch (Exception s)
		{
			System.out.println("DB연결 또는 쿼리 등에서 문제서 발생 >>> : " + s);
		}			
	}
	
	public static void main(String args[]) {

		OracleCommitTest oe = new OracleCommitTest();
		oe.empSelect();
	}
}

