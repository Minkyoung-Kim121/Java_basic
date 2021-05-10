package a.b.c;

import java.math.BigDecimal;

public class KosMathImpl implements KosMath{

	@Override
	public BigDecimal add(String dX, String dY){
		System.out.println("KosMathImpl_1 add 함수 시작 >>> : ");

		BigDecimal b1 = new BigDecimal(dX);
		BigDecimal b2 = new BigDecimal(dY);
		BigDecimal bAdd = b1.add(b2); 
		bAdd = bAdd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("KosMathImpl_1 add 함수 끝 >>> : ");

		return bAdd;
	}
	@Override
	public BigDecimal subtract(String dX, String dY){
		System.out.println("KosMathImpl_1 subtract 함수 시작 >>> : ");

		BigDecimal b1 = new BigDecimal(dX);
		BigDecimal b2 = new BigDecimal(dY);
		BigDecimal bSub = b1.subtract(b2);  
		bSub = bSub.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("KosMathImpl_1 subtract 함수 끝 >>> : ");

		return bSub;	
	}

	@Override
	public BigDecimal multiply(String dX, String dY){
		System.out.println("KosMathImpl_1 multiply 함수 시작 >>> : ");

		BigDecimal b1 = new BigDecimal(dX);
		BigDecimal b2 = new BigDecimal(dY);
		BigDecimal bMul = b1.multiply(b2); 
		bMul = bMul.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("KosMathImpl_1 multiply 함수 끝 >>> : ");

		return bMul;
	}
	@Override
	public BigDecimal divide(String dX, String dY){
		System.out.println("KosMathImpl_1 divide 함수 시작 >>> : ");

		BigDecimal b1 = new BigDecimal(dX);
		BigDecimal b2 = new BigDecimal(dY);
		// BigDecimal bDiv = b1.divide(b2);  
		BigDecimal bDiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);  
		System.out.println("KosMathImpl_1 divide 함수 끝 >>> : ");

		return bDiv;
	}
}