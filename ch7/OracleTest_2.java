package a.b.c;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class OracleTest_2{

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKMK00"
																						 ,"scott"
																						 ,"tiger");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT EMPNO AS EE FROM EMP");
		// [ALIAS] 사용하면 반드시 위 문장으로 데이터 받아야한다.
		// ResultSet rs = stmt.executeQuery("SELECT EMPNO AS EE, ENAME AS RR FROM EMP");
		// jdk1.8 과 oracle 11g 2 Release 를 연결하는 문장은 위의 4문장. 잘 외워두자
		// cf.PreparedStatment 인터페이스의 .preparestatement() 함수
		while (rs.next())
		{
			System.out.println(rs.getString("EE") + " : ");
			//System.out.println(rs.getString("RR") + " : ");
		}

	}

}