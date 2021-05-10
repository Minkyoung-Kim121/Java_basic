package com.bigdata30.ch2.member.vo;

// �ڹٿ��� ����ϴ� Beans ������Ʈ ���
// Bean : �� : com : �����͸� ��� ��
// ���� �ڵ����� ��� �����ʹ� VO ��Ƽ� ���α׷� �Ѵ�.
// VO : Value Object : Ŭ������ �ڿ� ���̾�� �빮�ڷ� ǥ���Ѵ�.
//��������� private : ����ȭ : encapsulation
// ����ȭ �� �����͸� 
// setter() �Լ��� �ʱ�ȭ �ϰ�
// getter() �Լ��� �����ؼ� ����Ѵ�.
// �⺻ ������(�Ű����� ���� ������ �̿��ϰ�)
// �Ǵ� ��� ����� ����
// ������(�Ű� ������ �ִ� ������)�� �̿��ؼ� ����ʵ带 �ʱ�ȭ �ص� �ȴ�.

// ���� �۷���, Value object Ŭ����, DTO Ŭ���� ��� �θ�.
public class MemberVO{

	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String maddr;


// ������ �����ε��� �̿��Ѵ�.
// ��������� �ν��ͽ� �ϸ鼭 �ʱ�ȭ �ϱ� ���ؼ� ��� �ϴ� ��

// �����ε� : �Լ� �̸��� ����
//		  : �Ű������� �ٸ� �� : ����, Ÿ��
// �ڱ� Ŭ���� �ȿ���

	// �⺻ ������
	public MemberVO(){
		
	}

	// �Ű����� 2���ִ� ������
	public MemberVO( String mid,String mpw){
		this.mid = mid;
		this.mpw = mpw;
		
	}

	// �Ű����� 5���ִ� ������ 
	// �̷��� �ʱ�ȭ �ص� �ǰ�
	public MemberVO( String mname,String mid,String mpw,String mhp,String maddr){
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.maddr = maddr;
	}

	// setter() �Լ� : �ʱ�ȭ �ϴ� �Լ�
	// �̷��� �ʱ�ȭ �ص� �ȴ�.
	public void setMname(String mname){
		this.mname = mname; 
	}
	public void setMid(String mid){
		this.mid = mid;
	}
	public void setMpw(String mpw){
		this.mpw = mpw; 
	}
	public void setMhp(String mhp){
		this.mhp = mhp; 
	}
	public void setMaddr(String maddr){
		this.maddr = maddr;
	}

	// getter() �Լ� : ���� �ϴ� �Լ�
	public String getMname(){
		return this.mname; 
	}
	public String getMid(){
		return this.mid; 
	}
	public String getMpw(){
		return this.mpw; 
	}
	public String getMhp(){
		return this.mhp; 
	}
	public String getMaddr(){
		return this.maddr; 
	}
}

