package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class OracleTest_1{

	// 상수로 변수 선언
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver"; // OracleDriver의 위치

	public static final String EMP_SELECT = "SELECT EMPNO, ENAME, JOB FROM EMP"; // 컬럼

	// OracleTest_1 생성자 : OracleTest_1 클래스를 사용하기 위해 생성자로 인스턴스해서 호출했을때, 함수 내부 실행.
	public OracleTest_1(){
		try
		{
			Class.forName(OracleTest_1.ORCL_FORNAME);
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("드라이버 찾기 문제가 생겼습니다. >>> : " + c);
		}
	}
	
	// empSelect() 함수
	public void empSelect(){
		// 지역변수는 사용하기 전에 초기화 해야 한다.
		Connection conn = null; // 연결
		Statement stmt = null; // 쿼리문 연결&데이터 받아오기
		ResultSet rsRs = null; // 결과(데이터베이스) 받아오기

		try
		{
			conn = DriverManager.getConnection(OracleTest_1.ORCL_URL 
												,OracleTest_1.ORCL_USER
												,OracleTest_1.ORCL_PASS);
			//Connection con = DriverManager.getConnection(String url, String user, String password);
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(OracleTest_1.EMP_SELECT);

			if (rsRs !=null)
			{
				while (rsRs.next())
				{
					System.out.print(rsRs.getString("EMPNO") + " : ");
					System.out.print(rsRs.getString("ENAME") + " : ");
					System.out.println(rsRs.getString("JOB") + " : ");
				}
			}
		}
		catch (SQLException s)
		{
			System.out.println("DB연결 또는 쿼리 등에서 문제가 발생했습니다. >>> : " + s);
		}
	}
	

	public static void main(String args[]){
		
		new OracleTest_1().empSelect();
		// OracleTest_1().empSelect();
	}
}

