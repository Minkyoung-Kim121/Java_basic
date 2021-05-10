package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleTestPrepared{

	// 상수 변수 선언
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver";

	public static final String EMP_SELECT = "SELECT EMPNO, ENAME, JOB FROM EMP";

	// OracleTestPrepared 생성자
	public OracleTestPrepared(){
		try
		{
			Class.forName(OracleTestPrepared.ORCL_FORNAME);
			// "oracle.jdbc.driver.OracleDriver"
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("드라이버 찾기 문제가 발생했습니다." + c);
		}
	}
	
	// empSelect() 함수
	public void empSelect(){
		// 지역변수 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		try
		{
			conn = DriverManager.getConnection(OracleTestPrepared.ORCL_URL
													,OracleTestPrepared.ORCL_USER
													,OracleTestPrepared.ORCL_PASS);
			pstmt = conn.prepareStatement(OracleTestPrepared.EMP_SELECT);
			// Statement와 PreparedStatement 의 차이
			// 1. 속도 : Statement 인터페이스는 단일 문장(?) 으로 처리하기 때문에 초반에는 빠른것처럼 보이나
			//         데이터가 200, 300 개 등 많아지면 PreparedStatement 인터페이스가 월등히 빨라진다.
			//         => 따라서, 우리는 Statement 말고, PreparedStatement 인터페이스만 사용할 것이다!
			// 2. 함수 :
			//        Statement는         .createStatement();   .executeQuery("SELECT 요청");
			//     PreparedeStatement는   .prepareStatement("SELECT 요청"); .executeQuery();

			rsRs = pstmt.executeQuery();

			if (rsRs !=null)
			{
				while (rsRs.next())
				{
					// EMPNO 출력
					System.out.print(rsRs.getString("EMPNO") + " : ");
					// ENAME 출력
					System.out.print(rsRs.getString("ENAME") + " : ");
					// JOB 출력
					System.out.println(rsRs.getString("JOB") + " : ");
				}
			}
		}
		catch (SQLException s)
		{
			System.out.println("DB 연결 또는 쿼리문 등에서 문제가 발생했습니다." + s);
		}
	}

	// main()    사용할 자원(클래스, 함수) 호출
	public static void main(String args[]){
		new OracleTestPrepared().empSelect();
	}
}