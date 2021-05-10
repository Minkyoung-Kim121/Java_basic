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
		// [ALIAS] ����ϸ� �ݵ�� �� �������� ������ �޾ƾ��Ѵ�.
		// ResultSet rs = stmt.executeQuery("SELECT EMPNO AS EE, ENAME AS RR FROM EMP");
		// jdk1.8 �� oracle 11g 2 Release �� �����ϴ� ������ ���� 4����. �� �ܿ�����
		// cf.PreparedStatment �������̽��� .preparestatement() �Լ�
		while (rs.next())
		{
			System.out.println(rs.getString("EE") + " : ");
			//System.out.println(rs.getString("RR") + " : ");
		}

	}

}