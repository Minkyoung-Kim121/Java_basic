package a.b.c;

// �������̽��� ����ü�� ���� �߻��Լ��� �Ǿ� ������
// ����ü�� ������ �ִ� Ŭ������ �� ������ �Ѵ�. 
// ����� ����� 
// ����Ϸ��� �ϴ� �������̽��� ����ؼ� 
// �������̽��� �ִ� �߻��Լ��� �������̵� �ؼ� �����. 
// �������̵� �� �߻��Լ��� �� @Override ������̼��� ����Ѵ�.

import java.math.BigDecimal;

public interface KosMath{

	// �������̽����ִ� �Լ��� 
	// �߻��Լ� : ���� ���� �Լ� : ����ü�� ���� �Լ� 
	public BigDecimal add(double dX, double dY);
	public BigDecimal subtract(double dX, double dY);
	public BigDecimal multiply(double dX, double dY);
	public BigDecimal divide(double dX, double dY);
}