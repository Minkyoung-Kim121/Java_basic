package a.b.c;
/*
CALSSPATH
.;%JAVA_HOME%\classes\ojdbc6.jar
*/
import java.sql.Connection;
// Connection 인터페이스 : JDBC 드라이버 집합을 관리하기 위한 기본 서비스.
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// Statement 인터페이스 : SQL 문을 실행하는 데 사용되는 개체 그리고 그것이 생산하는 결과를 반환한다.
//                     쿼리문 전달하고, 데이터 받아오는 역할을 하는 인터페이스
import java.sql.ResultSet;
// ResultSet 인터페이스 : 데이터베이스 결과 집합을 나타내는 데이터 표.
//                     일반적으로 데이터베이스를 쿼리하는 명령문을 실행함으로써 생성된다.

public class OracleTest{

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		// jdbc 드라이버 클래스 찾기
		// OracleTest 자바 프로그램과 Oracle 11g 2Release 프로그램을 연결한다.
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// classes 디렉토리에 ojdbc6.jar 복붙해서 압출 풀면, 그 안에 OracleDriver 존재
		// OracleDiver.class 는 JDBC의 시작점이다.
		// JDBC(Java DataBase Connectivity)
		//     : jdk1.8과 Oracle 11g 2 Release를 왔다갔다 해줄 수 있는 것이 JDBC 기술.
		//       이를 연결할 때 사용하는 것이 ojdbc6.jar
		
		// <jdbc 연결규칙>
		// Connection 인터페이스에 DriverManager 클래스 getConnection() 함수를
		// 이용해서 Java 프로그램과 Oracle DB를 연결한다.
		//Connection con = null;
		//Connection con = DriverManager.getConnection();  <- static 붙었음.
		// static Connection getConnection(String url, String user, String password)을 사용할 것이기 때문에
		//Connection con = DriverManager.getConnection(String url, String user, String password);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKMK00"
													 , "scott"
												     , "tiger");
		// TYPE4만 사용하는 이유 : 가장 안정적이기 때문 (TYPE4 는 thin Driver)
		// "jdbc:orcle:thin:@192.168.219.145:1521:ORA"   연결 URL (ppt를 보자)
		// 내 pc 에 Oracle깔려있기 때문에 내 주소를 불러옴.
		// 다른 pc에 연결하려면 다른 pc 주소를 넣자.
		// 1521 : port
		// ORA : SID 입력 -> orclKMK00
		// String user : scott
		// String password : tiger
		System.out.println("con 참조변수 >>> : " + con);
		// con 참조변수 >>> : oracle.jdbc.driver.T4CConnection@2d38eb89
		System.out.println("OracleTest 자바 프로그램 하고" 
							+ "Oracle11g2Release 를 "
							+ "오라클 JDBC 드라이버 TYPE4 (thin 드라이버) : jdbc:orcle:thin:@"
							+ "데이터베이스가 본인 컴퓨터에 설치되어있고 : localhost"
							+ "데이터베이스를 찾아서 : 1521, orclKMK00 까지 찾았다는 의미"
							+ "scott/tiger 계정까지 연결 되었음 >>> : ");
		// 연결이 되고 나면
		// 데이터베이스에 sql 문을 전달하고 결과를 받아올 객체를 선언한다.
		Statement stmt = con.createStatement();
		// .createStatement() 함수 : Sending SQL statements to the database.
		// Statement 객체는 오픈된 Connection 객체(con.createStatement())를 사용해야한다.
		// -> 참조변수 con 은 DriverManager.getConnection() 함수로 scott/tiger 계정으로 연결시켜놓았다.
		System.out.println("stmt 참조변수 >>> : " + stmt);
		// stmt 참조변수 >>> : oracle.jdbc.driver.OracleStatementWrapper@23223dd8
		System.out.println("데이터베이스에 SQL 문을 전달할 준비가 되었다. >>> : ");
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); 
		// 시작점 (여기서 쿼리문을 던지고 받아온다.)
		// stmt.executeQuery() 함수를 호출해서 sql 문 전달을 시작한다.
		// .executeQuery() 함수 : SELECT를 요청할 때 사용한다.
		//                       SELECT된 결과 file을 ResultSet 인터페이스로 받는다.
		// => .executeQuery()함수를 이용해서 SELECT 를 요청하고, sql문 전달을 시작해서 
		//     ResultSet 인터페이스로 그 결과를 받는다.
		System.out.println("rs 참조변수 >>> : " + rs);
		// rs 참조변수 >>> : oracle.jdbc.driver.OracleResultSetImpl@2752f6e2
		System.out.println("executeQuery() 함수의 매개변수로 있는"
							+ "String 문자열 (SELECT * FROM EMP"
							+ ": 자바코드에서는 문자열이다.)"
							+ " 을 Statement 통로를 통해서 전달되고"
							+ " 전달 받은 문자열은 데이터베이스에서"
							+ " 쿼리문으로 변경해서 해당 구문을 실행하고"
							+ " 실행 결과인 파일을"
							+ " 다시 Statement 통로를 통해서 전달하면"
							+ " Result 인터페이스가 해당 파일을 받는다.");

		while (rs.next())   //  ?  
		// next() 함수 : Moves the cursor forward one row from its current position.
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