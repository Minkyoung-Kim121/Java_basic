package a.b.c.emp.scr;

import java.sql.Connection;
import java.sql.DriverManager;
// Connection �������� = DriverManager.getConnection(������ pc �ּ�, user id, user password);
import java.sql.SQLException;
import java.sql.PreparedStatement;
// Statement �������̽� ��� ���
import java.sql.ResultSet;
// ��� �����ͺ��̽� �޾ƿ�

import java.util.ArrayList;
// �迭�������
import a.b.c.emp.vo.EmpVO;
// EmpVO (�� ����) Ŭ���� ����ϱ� ����
import a.b.c.common.OrclPath;
	/*
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKMK00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	public static final String ORCL_FORNAME = "oracle.jdbc.driver.OracleDriver";

	public static final String EMP_SELECT = "SELECT * FROM EMP";
	*/

	/*
	jdbc:oracle:thin:  ����Ŭ jdbc thin ����̹� ã�� ���ڿ�
	@localhost         @(������) localhost : �����ͺ��̽��� ��ġ�� ��ǻ�� �̸�( ������ �� pc �ּҷ�)
	:1521              ����Ŭ �����ͺ��̽��� ��Ī�ϴ� port ��ȣ
	:orclKMK00         �����ͺ��̽� �ĺ��� : SID / ���������ͺ��̽� �̸��̶�� �θ���.
	*/
public class OracleEmp{

	// OracleEmp ������
	public OracleEmp(){
		// ClassNotFoundException ������ try-catch ������ ����ó���Ѵ�.
		try
		{	
			// Class.forName(����pc�ּ�, user id, user password) �Լ��� sql�� ����
			Class.forName(OrclPath.ORCL_FORNAME);
		}
		catch (ClassNotFoundException c)
		{	
			System.out.println("����̹� ã�� ������ �߻��Ͽ����ϴ�." + c);
		}
	}

	// empSelect() �Լ�
	public ArrayList empSelect(){
		// ����� ���� ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;

		// try-catch ����ó��
		try
		{
			conn = DriverManager.getConnection(OrclPath.ORCL_URL 
												,OrclPath.ORCL_USER 
												,OrclPath.ORCL_PASS);
			// DriverManager.getConnection(����pc�ּ�, user id, user password) �Լ��� sql�� ����
			pstmt = conn.prepareStatement(OrclPath.EMP_SELECT);
			// PreparedStatement �������̽��� .prepareStatement() �Լ��� SELECT ���� ��û
			rsRs = pstmt.executeQuery(); // database �޾ƿ���

			// �����Ͱ� null �� �ƴϸ�,
			if (rsRs !=null)
			{	
				aList = new ArrayList();
				// while() �� ������
				while (rsRs.next())
				{
					EmpVO evo = new EmpVO();
					// EmpVO.java �� �ִ� EmmpVO() �Լ� ȣ��;
					evo.setEmpno(rsRs.getString("EMPNO"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setJob(rsRs.getString("JOB"));
					evo.setMgr(rsRs.getString("MGR"));
					evo.setHiredate(rsRs.getString("HIREDATE"));
					evo.setSal(rsRs.getString("SAL"));
					evo.setComm(rsRs.getString("COMM"));
					evo.setDeptno(rsRs.getString("DEPTNO"));

					aList.add(evo); // aList.add()�Լ��� �迭�� �����͸� �״���.
					System.out.println("aList >>> : " + aList);

					Thread.sleep(4000);
					//break;
				}
			}
			
		}
		catch (Exception s)
		{
			System.out.println("DataBase ���� �Ǵ� ������ ��� ������ �߻��Ͽ����ϴ�." + s);
		}
		return aList;
	}

	// main()
	public static void main(String args[]){
		OracleEmp oe = new OracleEmp(); // �������� oe�� OracleEmp() ȣ��
		ArrayList aList = oe.empSelect();
		System.out.println("aList.size() >>> : " + aList.size()); // 14
		// ArrayList �� size()

		if (aList.size() > 0)
		{
			for (int i=0; i < aList.size(); i++)
			{
				System.out.println("aList.get("+i+") >>> : " + aList.get(i));
				EmpVO evo = (EmpVO)aList.get(i); // EmpVO �� ����ȯ
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
