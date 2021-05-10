package a.b.c.emp.vo;

//���� Ŭ���� EmpVO{}
public class EmpVO{
// �������, �� ������, �Ű����� �ִ� ������, set() �Լ�, get() �Լ�
	
	// ������� ����
	private String empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	// ������ 1  : �� ������ EmpVO(){}    �� �����ڰ� �ݵ�� 1�� �־�� �Ѵ�.
	public EmpVO(){}

	// ������ 2  : �Ű������� 8��    String Ÿ��
	public EmpVO(String empno, String ename, String job, String mgr, String hiredate
											,String sal, String comm, String deptno){
		this.empno = empno; // this    ?
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	// void set() �Լ�   ?
	// setEmpno(�Ű�����) �Լ�     ���� �ҷ��� Ȯ���Ұű� ������(?)
	public void setEmpno(String empno){
		this.empno = empno;
	}
	// setEname() �Լ�
	public void setEname(String ename){
		this.ename = ename;
	}
	// setJob() �Լ�
	public void setJob(String job){
		this.job = job;
	}
	// setMgr() �Լ�
	public void setMgr(String mgr){
		this.mgr = mgr;
	}
	// setHiredate() �Լ�
	public void setHiredate(String hiredate){
		this.hiredate = hiredate;
	}
	// setSal() �Լ�
	public void setSal(String sal){
		this.sal = sal;
	}
	// setComm() �Լ�
	public void setComm(String comm){
		this.comm = comm;
	}
	// setDeptno() �Լ�
	public void setDeptno(String deptno){
		this.deptno = deptno;
	}

	// get() �Լ�   ?
	// String get()
	// getEmpno() �Լ�
	public String getEmpno(){
		return this.empno;
	}
	// getEname() �Լ�
	public String getEname(){
		return this.ename;
	}
	// getJob() �Լ�
	public String getJob(){
		return this.job;
	}
	// getMgr() �Լ�
	public String getMgr(){
		return this.mgr;
	}
	// getHiredate() �Լ�
	public String getHiredate(){
		return this.hiredate;
	}
	// getSal() �Լ�
	public String getSal(){
		return this.sal;
	}
	// getComm() �Լ�
	public String getComm(){
		return this.comm;
	}
	// getDeptno() �Լ�
	public String getDeptno(){
		return this.deptno;
	}
}