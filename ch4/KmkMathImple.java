package a.b.c;

// interface �Լ��� �������ִ� �����θ� ����� �ִ� ����
//  �Լ�(); -> �ڿ� {} �� �ٲ㼭 �����θ� �������!
// ������ ���� �� �ȴ�. �� �� �� Ŭ������ ������ KmkMathScr.java ���� �ڿ��� ���ű� ����
// �ڿ�, �� �Լ� ȣ���� ���ο���!!!-> �����ϴ� �ڹ������� ���ο��� 
import java.math.BigDecimal;

public class KmkMathImple implements KmkMath{ // ��ӿ����� �ڽ� ���� = new �θ� ��� ���� ��
	// �ڿ��� �� ���� �� ��Ģ x   KmkMathScr.java

	@Override // �Լ� ���� ���� �� �ٿ��� �Ѵ�.
	public BigDecimal add(String x, String y){

//	System.out.println("add()" + add());    -> �Լ��� �� �ҷ��� ����ϸ� ��� ���� ���� �Ǽ��� �ݺ��ϰ�...
	System.out.println("KosMathImpl add �Լ� ���� >>> : ");
	
	System.out.println("KosMathImpl add �Լ� �� >>> : ");
		
		return null;
	}

	@Override
	public BigDecimal subtract(String x, String y){
	System.out.println("KosMathImpl subtract �Լ� ���� >>> : ");
	
	System.out.println("KosMathImpl subtract �Լ� �� >>> : ");
		return null;
	}

	@Override
	public BigDecimal multiply(String x, String y){
	System.out.println("KosMathImpl multiply �Լ� ���� >>> : ");
	
	System.out.println("KosMathImpl multiply �Լ� �� >>> : ");
	}

	@Override
	public BigDecimal divide(String x, String y){
	System.out.println("KosMathImpl divide �Լ� ���� >>> : ");
	
	System.out.println("KosMathImpl divide �Լ� �� >>> : ");	
		return null;
	}






}