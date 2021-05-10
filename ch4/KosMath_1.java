package a.b.c;

// 인터페이스는 구현체가 없는 추상함수로 되어 있으니
// 구현체를 가지고 있는 클래스를 꼭 만들어야 한다. 
// 만드는 모습은 
// 사용하려고 하는 인터페이스를 상속해서 
// 인터페이스에 있는 추상함수를 오버라이딩 해서 만들다. 
// 오버라이딩 한 추상함수에 꼭 @Override 어노테이션을 기술한다.

import java.math.BigDecimal;

public interface KosMath{

	// 인터페이스에있는 함수는 
	// 추상함수 : 블럭이 없는 함수 : 구현체가 없는 함수 
	public BigDecimal add(String dX, String dY);
	public BigDecimal subtract(String dX, String dY);
	public BigDecimal multiply(String dX, String dY);
	public BigDecimal divide(String dX, String dY);
}