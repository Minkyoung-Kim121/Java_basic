package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleTestPrepared{

	// ��� ���� ����
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver";

	public static final String EMP_SELECT = "SELECT EMPNO, ENAME, JOB FROM EMP";

	// OracleTestPrepared ������
	public OracleTestPrepared(){
		try
		{
			Class.forName(OracleTestPrepared.ORCL_FORNAME);
			// "oracle.jdbc.driver.OracleDriver"
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("����̹� ã�� ������ �߻��߽��ϴ�." + c);
		}
	}
	
	// empSelect() �Լ�
	public void empSelect(){
		// �������� �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		try
		{
			conn = DriverManager.getConnection(OracleTestPrepared.ORCL_URL
													,OracleTestPrepared.ORCL_USER
													,OracleTestPrepared.ORCL_PASS);
			pstmt = conn.prepareStatement(OracleTestPrepared.EMP_SELECT);
			// Statement�� PreparedStatement �� ����
			// 1. �ӵ� : Statement �������̽��� ���� ����(?) ���� ó���ϱ� ������ �ʹݿ��� ������ó�� ���̳�
			//         �����Ͱ� 200, 300 �� �� �������� PreparedStatement �������̽��� ������ ��������.
			//         => ����, �츮�� Statement ����, PreparedStatement �������̽��� ����� ���̴�!
			// 2. �Լ� :
			//        Statement��         .createStatement();   .executeQuery("SELECT ��û");
			//     PreparedeStatement��   .prepareStatement("SELECT ��û"); .executeQuery();

			rsRs = pstmt.executeQuery();

			if (rsRs !=null)
			{
				while (rsRs.next())
				{
					// EMPNO ���
					System.out.print(rsRs.getString("EMPNO") + " : ");
					// ENAME ���
					System.out.print(rsRs.getString("ENAME") + " : ");
					// JOB ���
					System.out.println(rsRs.getString("JOB") + " : ");
				}
			}
		}
		catch (SQLException s)
		{
			System.out.println("DB ���� �Ǵ� ������ ��� ������ �߻��߽��ϴ�." + s);
		}
	}

	// main()    ����� �ڿ�(Ŭ����, �Լ�) ȣ��
	public static void main(String args[]){
		new OracleTestPrepared().empSelect();
	}
}