package a.b.c.emp.vo;

//깡통 클래스 EmpVO{}
public class EmpVO{
// 멤버변수, 빈 생성자, 매개변수 있는 생성자, set() 함수, get() 함수
	
	// 멤버변수 선언
	private String empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	// 생성자 1  : 빈 생성자 EmpVO(){}    빈 생성자가 반드시 1개 있어야 한다.
	public EmpVO(){}

	// 생성자 2  : 매개변수가 8개    String 타입
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

	// void set() 함수   ?
	// setEmpno(매개변수) 함수     인자 불러서 확인할거기 때문에(?)
	public void setEmpno(String empno){
		this.empno = empno;
	}
	// setEname() 함수
	public void setEname(String ename){
		this.ename = ename;
	}
	// setJob() 함수
	public void setJob(String job){
		this.job = job;
	}
	// setMgr() 함수
	public void setMgr(String mgr){
		this.mgr = mgr;
	}
	// setHiredate() 함수
	public void setHiredate(String hiredate){
		this.hiredate = hiredate;
	}
	// setSal() 함수
	public void setSal(String sal){
		this.sal = sal;
	}
	// setComm() 함수
	public void setComm(String comm){
		this.comm = comm;
	}
	// setDeptno() 함수
	public void setDeptno(String deptno){
		this.deptno = deptno;
	}

	// get() 함수   ?
	// String get()
	// getEmpno() 함수
	public String getEmpno(){
		return this.empno;
	}
	// getEname() 함수
	public String getEname(){
		return this.ename;
	}
	// getJob() 함수
	public String getJob(){
		return this.job;
	}
	// getMgr() 함수
	public String getMgr(){
		return this.mgr;
	}
	// getHiredate() 함수
	public String getHiredate(){
		return this.hiredate;
	}
	// getSal() 함수
	public String getSal(){
		return this.sal;
	}
	// getComm() 함수
	public String getComm(){
		return this.comm;
	}
	// getDeptno() 함수
	public String getDeptno(){
		return this.deptno;
	}
}