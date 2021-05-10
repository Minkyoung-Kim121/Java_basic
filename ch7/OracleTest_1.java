package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class OracleTest_1{

	// ����� ���� ����
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver"; // OracleDriver�� ��ġ

	public static final String EMP_SELECT = "SELECT EMPNO, ENAME, JOB FROM EMP"; // �÷�

	// OracleTest_1 ������ : OracleTest_1 Ŭ������ ����ϱ� ���� �����ڷ� �ν��Ͻ��ؼ� ȣ��������, �Լ� ���� ����.
	public OracleTest_1(){
		try
		{
			Class.forName(OracleTest_1.ORCL_FORNAME);
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("����̹� ã�� ������ ������ϴ�. >>> : " + c);
		}
	}
	
	// empSelect() �Լ�
	public void empSelect(){
		// ���������� ����ϱ� ���� �ʱ�ȭ �ؾ� �Ѵ�.
		Connection conn = null; // ����
		Statement stmt = null; // ������ ����&������ �޾ƿ���
		ResultSet rsRs = null; // ���(�����ͺ��̽�) �޾ƿ���

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
			System.out.println("DB���� �Ǵ� ���� ��� ������ �߻��߽��ϴ�. >>> : " + s);
		}
	}
	

	public static void main(String args[]){
		
		new OracleTest_1().empSelect();
		// OracleTest_1().empSelect();
	}
}

