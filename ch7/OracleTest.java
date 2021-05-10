package a.b.c;
/*
CALSSPATH
.;%JAVA_HOME%\classes\ojdbc6.jar
*/
import java.sql.Connection;
// Connection �������̽� : JDBC ����̹� ������ �����ϱ� ���� �⺻ ����.
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// Statement �������̽� : SQL ���� �����ϴ� �� ���Ǵ� ��ü �׸��� �װ��� �����ϴ� ����� ��ȯ�Ѵ�.
//                     ������ �����ϰ�, ������ �޾ƿ��� ������ �ϴ� �������̽�
import java.sql.ResultSet;
// ResultSet �������̽� : �����ͺ��̽� ��� ������ ��Ÿ���� ������ ǥ.
//                     �Ϲ������� �����ͺ��̽��� �����ϴ� ��ɹ��� ���������ν� �����ȴ�.

public class OracleTest{

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		// jdbc ����̹� Ŭ���� ã��
		// OracleTest �ڹ� ���α׷��� Oracle 11g 2Release ���α׷��� �����Ѵ�.
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// classes ���丮�� ojdbc6.jar �����ؼ� ���� Ǯ��, �� �ȿ� OracleDriver ����
		// OracleDiver.class �� JDBC�� �������̴�.
		// JDBC(Java DataBase Connectivity)
		//     : jdk1.8�� Oracle 11g 2 Release�� �Դٰ��� ���� �� �ִ� ���� JDBC ���.
		//       �̸� ������ �� ����ϴ� ���� ojdbc6.jar
		
		// <jdbc �����Ģ>
		// Connection �������̽��� DriverManager Ŭ���� getConnection() �Լ���
		// �̿��ؼ� Java ���α׷��� Oracle DB�� �����Ѵ�.
		//Connection con = null;
		//Connection con = DriverManager.getConnection();  <- static �پ���.
		// static Connection getConnection(String url, String user, String password)�� ����� ���̱� ������
		//Connection con = DriverManager.getConnection(String url, String user, String password);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKMK00"
													 , "scott"
												     , "tiger");
		// TYPE4�� ����ϴ� ���� : ���� �������̱� ���� (TYPE4 �� thin Driver)
		// "jdbc:orcle:thin:@192.168.219.145:1521:ORA"   ���� URL (ppt�� ����)
		// �� pc �� Oracle����ֱ� ������ �� �ּҸ� �ҷ���.
		// �ٸ� pc�� �����Ϸ��� �ٸ� pc �ּҸ� ����.
		// 1521 : port
		// ORA : SID �Է� -> orclKMK00
		// String user : scott
		// String password : tiger
		System.out.println("con �������� >>> : " + con);
		// con �������� >>> : oracle.jdbc.driver.T4CConnection@2d38eb89
		System.out.println("OracleTest �ڹ� ���α׷� �ϰ�" 
							+ "Oracle11g2Release �� "
							+ "����Ŭ JDBC ����̹� TYPE4 (thin ����̹�) : jdbc:orcle:thin:@"
							+ "�����ͺ��̽��� ���� ��ǻ�Ϳ� ��ġ�Ǿ��ְ� : localhost"
							+ "�����ͺ��̽��� ã�Ƽ� : 1521, orclKMK00 ���� ã�Ҵٴ� �ǹ�"
							+ "scott/tiger �������� ���� �Ǿ��� >>> : ");
		// ������ �ǰ� ����
		// �����ͺ��̽��� sql ���� �����ϰ� ����� �޾ƿ� ��ü�� �����Ѵ�.
		Statement stmt = con.createStatement();
		// .createStatement() �Լ� : Sending SQL statements to the database.
		// Statement ��ü�� ���µ� Connection ��ü(con.createStatement())�� ����ؾ��Ѵ�.
		// -> �������� con �� DriverManager.getConnection() �Լ��� scott/tiger �������� ������ѳ��Ҵ�.
		System.out.println("stmt �������� >>> : " + stmt);
		// stmt �������� >>> : oracle.jdbc.driver.OracleStatementWrapper@23223dd8
		System.out.println("�����ͺ��̽��� SQL ���� ������ �غ� �Ǿ���. >>> : ");
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); 
		// ������ (���⼭ �������� ������ �޾ƿ´�.)
		// stmt.executeQuery() �Լ��� ȣ���ؼ� sql �� ������ �����Ѵ�.
		// .executeQuery() �Լ� : SELECT�� ��û�� �� ����Ѵ�.
		//                       SELECT�� ��� file�� ResultSet �������̽��� �޴´�.
		// => .executeQuery()�Լ��� �̿��ؼ� SELECT �� ��û�ϰ�, sql�� ������ �����ؼ� 
		//     ResultSet �������̽��� �� ����� �޴´�.
		System.out.println("rs �������� >>> : " + rs);
		// rs �������� >>> : oracle.jdbc.driver.OracleResultSetImpl@2752f6e2
		System.out.println("executeQuery() �Լ��� �Ű������� �ִ�"
							+ "String ���ڿ� (SELECT * FROM EMP"
							+ ": �ڹ��ڵ忡���� ���ڿ��̴�.)"
							+ " �� Statement ��θ� ���ؼ� ���޵ǰ�"
							+ " ���� ���� ���ڿ��� �����ͺ��̽�����"
							+ " ���������� �����ؼ� �ش� ������ �����ϰ�"
							+ " ���� ����� ������"
							+ " �ٽ� Statement ��θ� ���ؼ� �����ϸ�"
							+ " Result �������̽��� �ش� ������ �޴´�.");

		while (rs.next())   //  ?  
		// next() �Լ� : Moves the cursor forward one row from its current position.
		{
			/*
			System.out.print(rs.getString("EMPNO") + " : ");
			System.out.print(rs.getString("ENAME") + " : ");
			System.out.print(rs.getString("JOB") + " : ");
			System.out.print(rs.getString("MGR") + " : ");
			System.out.print(rs.getString("HIREDATE") + " : ");
			System.out.print(rs.getString("SAL") + " : ");
			System.out.print(rs.getString("COMM") + " : ");
			System.out.println(rs.getString("DEPTNO"));
			*/
			System.out.print(rs.getString(1) + " : ");
			System.out.print(rs.getString(2) + " : ");
			System.out.print(rs.getString(3) + " : ");
			System.out.print(rs.getString(4) + " : ");
			System.out.print(rs.getString(5) + " : ");
			System.out.print(rs.getString(6) + " : ");
			System.out.print(rs.getString(7) + " : ");
			System.out.println(rs.getString(8));
		}
	}
}

// SELECT * FROM EMP;	
/*
7369	SMITH	CLERK		7902	80/12/17	800		20
7499	ALLEN	SALESMAN	7698	81/02/20	1600	300	30
7521	WARD	SALESMAN	7698	81/02/22	1250	500	30
7566	JONES	MANAGER		7839	81/04/02	2975		20
7654	MARTIN	SALESMAN	7698	81/09/28	1250	1400	30
7698	BLAKE	MANAGER		7839	81/05/01	2850		30
7782	CLARK	MANAGER		7839	81/06/09	2450		10
7788	SCOTT	ANALYST		7566	87/04/19	3000		20
7839	KING	PRESIDENT			81/11/17	5000		10
7844	TURNER	SALESMAN	7698	81/09/08	1500	0	30
7876	ADAMS	CLERK		7788	87/05/23	1100		20
7900	JAMES	CLERK		7698	81/12/03	950		30
7902	FORD	ANALYST		7566	81/12/03	3000		20
7934	MILLER	CLERK		7782	82/01/23	1300		10
*/