package a.b.c;

import java.math.BigDecimal;

public interface KmkMath{

//	public double BigDecimal add();

	public BigDecimal add(String x, String y);

	public BigDecimal subtract(String x, String y);

	public BigDecimal multiply(String x, String y);

	public BigDecimal divide(String x, String y);

// 리턴?? BigDecimal 의 데이터는 뭐여??? 리턴값 뭐로 받지?
//	double 형 변수를 선언해서 각각 받아야??? 아니면 빅데시말의 데이터형이 있나?
// interface 함수는 리턴이 없다.

}