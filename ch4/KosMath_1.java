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
	public BigDecimal add(String dX, String dY);
	public BigDecimal subtract(String dX, String dY);
	public BigDecimal multiply(String dX, String dY);
	public BigDecimal divide(String dX, String dY);
}