package a.b.c;

import java.math.BigDecimal;

public interface KmkMath{

//	public double BigDecimal add();

	public BigDecimal add(String x, String y);

	public BigDecimal subtract(String x, String y);

	public BigDecimal multiply(String x, String y);

	public BigDecimal divide(String x, String y);

// ����?? BigDecimal �� �����ʹ� ����??? ���ϰ� ���� ����?
//	double �� ������ �����ؼ� ���� �޾ƾ�??? �ƴϸ� �򵥽ø��� ���������� �ֳ�?
// interface �Լ��� ������ ����.

}