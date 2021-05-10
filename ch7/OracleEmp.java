package a.b.c.emp.scr;

import java.sql.Connection;
import java.sql.DriverManager;
// Connection 참조변수 = DriverManager.getConnection(연결할 pc 주소, user id, user password);
import java.sql.SQLException;
import java.sql.PreparedStatement;
// Statement 인터페이스 대신 사용
import java.sql.ResultSet;
// 결과 데이터베이스 받아옴

import java.util.ArrayList;
// 배열만드려고
import a.b.c.emp.vo.EmpVO;
// EmpVO (빈 깡통) 클래스 사용하기 위해
import a.b.c.common.OrclPath;
	/*
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver";

	public static final String EMP_SELECT = "SELECT * FROM EMP";
	*/

	/*
	jdbc:oracle:thin:  오라클 jdbc thin 드라이버 찾는 문자열
	@localhost         @(구분자) localhost : 데이터베이스가 설치된 컴퓨터 이름( 지금은 내 pc 주소로)
	:1521              오라클 데이터베이스를 지칭하는 port 번호
	:orclKMK00         데이터베이스 식별자 : SID / 전역데이터베이스 이름이라고 부른다.
	*/
public class OracleEmp{

	// OracleEmp 생성자
	public OracleEmp(){
		// ClassNotFoundException 때문에 try-catch 구절로 예외처리한다.
		try
		{	
			// Class.forName(연결pc주소, user id, user password) 함수로 sql에 연결
			Class.forName(OrclPath.ORCL_FORNAME);
		}
		catch (ClassNotFoundException c)
		{	
			System.out.println("드라이버 찾기 문제가 발생하였습니다." + c);
		}
	}

	// empSelect() 함수
	public ArrayList empSelect(){
		// 사용할 변수 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;

		// try-catch 예외처리
		try
		{
			conn = DriverManager.getConnection(OrclPath.ORCL_URL 
												,OrclPath.ORCL_USER 
												,OrclPath.ORCL_PASS);
			// DriverManager.getConnection(연결pc주소, user id, user password) 함수로 sql에 연결
			pstmt = conn.prepareStatement(OrclPath.EMP_SELECT);
			// PreparedStatement 인터페이스는 .prepareStatement() 함수에 SELECT 구문 요청
			rsRs = pstmt.executeQuery(); // database 받아오기

			// 데이터가 null 이 아니면,
			if (rsRs !=null)
			{	
				aList = new ArrayList();
				// while() 로 돌리자
				while (rsRs.next())
				{
					EmpVO evo = new EmpVO();
					// EmpVO.java 에 있는 EmmpVO() 함수 호출;
					evo.setEmpno(rsRs.getString("EMPNO"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setJob(rsRs.getString("JOB"));
					evo.setMgr(rsRs.getString("MGR"));
					evo.setHiredate(rsRs.getString("HIREDATE"));
					evo.setSal(rsRs.getString("SAL"));
					evo.setComm(rsRs.getString("COMM"));
					evo.setDeptno(rsRs.getString("DEPTNO"));

					aList.add(evo); // aList.add()함수로 배열의 데이터를 쌓는중.
					System.out.println("aList >>> : " + aList);

					Thread.sleep(4000);
					//break;
				}
			}
			
		}
		catch (Exception s)
		{
			System.out.println("DataBase 연결 또는 쿼리문 등에서 문제가 발생하였습니다." + s);
		}
		return aList;
	}

	// main()
	public static void main(String args[]){
		OracleEmp oe = new OracleEmp(); // 참조변수 oe로 OracleEmp() 호출
		ArrayList aList = oe.empSelect();
		System.out.println("aList.size() >>> : " + aList.size()); // 14
		// ArrayList 는 size()

		if (aList.size() > 0)
		{
			for (int i=0; i < aList.size(); i++)
			{
				System.out.println("aList.get("+i+") >>> : " + aList.get(i));
				EmpVO evo = (EmpVO)aList.get(i); // EmpVO 로 형변환
				System.out.println("" + evo);
				System.out.println("" + evo.getEmpno());
				System.out.println("" + evo.getJob());
			}
		}
	}
}

/*  
C:\00.KOSMO72\00.JExam\ch7>javac -d . OrclPath.java EmpVO.java OracleEmp.java
Note: OracleEmp.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
*/
