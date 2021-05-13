package a.b.c;

// PrivateTest.java ���Ͽ� PrivateTest.class / PrivateValue.class �� ���� ����
//                       (Ŭ���� �� ���ο� ����� inner Ŭ�����ʹ� �ٸ� ���̴�.)
// PrivateTest.java�� �����ϸ��ϸ�)
//                        PrivateTest.class / PrivateValue.class �� �� ����.
public class PrivateTest{

	public static void main(String args[]){
	

		PrivateValue pv = new PrivateValue();
		//System.out.println("pv.iVal >>> : " + pv.iVal);
		pv.setIVal(10);
		System.out.println("pv.getIVal() >>> : " + pv.getIVal());
		pv.setSval("�׽�Ʈ");
		System.out.println("pv.getSval() >>> : " + pv.getSval());
		PrivateValue pv_1 = new PrivateValue(27, "�踸��");
		System.out.println("pv_1.getIVal() >>> : " + pv_1.getIVal());
		System.out.println("pv_1.getSval() >>> : " + pv_1.getSval());

		//���� p.162
	} // end of main()
	} // end of PrivateTest class


class PrivateValue
{
//A)������� (private)�� Ư¡)
	// private ����������(Access Modifier)
	// ����� Ŭ���� �� ���ο����� ��� �����ϴ�.
	// �ڹٿ��� �̰��� ��������ȭ(encapsulation) ��� �Ѵ�.��
	//encapsulation : �ڹٿ��� �ڶ��ϴ� Bean(��/������Ʈ)���.

	private int iVal;
	private String sval;
	
	public PrivateValue(){
		
	}

	public PrivateValue(int iVal, String sval){
		this.iVal = iVal;
		this.sval = sval;
	}

/*B)iVal()�Լ��� setter�Լ��� ����� ���)��
		setter �Լ���� �θ���.
		set(���ξ�) + �ش� ������ ù��° �̴ϼ��� �빮�ڷ��ؼ� �Լ��̸��� �����.
		ex) set + IVal() -> setIVal(int iVal) : �Ű������� �ش� ���������� �����Ѵ�.
		this.iVal = iVal
		                : �ʱ�ȭ�� �Ű������� �����͸� private�� ����� ��������� �����Ѵ�.
						 (�̶�, this Ű���带 ����Ѵ�.)
	Ư¡)	�ʱ�ȭ �Լ�
		������ : void
		���������� : public
	*/

	public void setIVal(int iVal){
		this.iVal = iVal;
	}
	public void setSval(String sval){
		this.iVal = iVal;	
	}
	/*
C)iVal()�Լ��� getter�Լ��� ����� ���)��
		getter �Լ���� �θ���.
		get()�Լ��� ���� �Լ�
		get(���ξ�) + IVal()�ش� ������ ù��° �̴ϼ��� �빮�ڷ��ؼ� �Լ� �̸��� �����.
		������ : �ش� ���������� ����
		�Ű������� ����.
		return Ű���� + �ش� ��������� this Ű���带 �ٿ� ���.
	*/

	public int getIVal(){
		return this.iVal;
	}
	public String getSval(){
		return this.sval;
	}
} // end of PrivateValue class