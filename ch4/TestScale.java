package a.b.c;

import java.math.BigDecimal;

// Pilot Code ( or Pilot Project)
public class TestScale{

	public static void main(String args[]){

		// double x = 1.12345678922222;
		// double y = 1.2343456789111;
		String x = "1.12345678922222";
		String y = "1.2343456789111";
		BigDecimal b1 = new BigDecimal(x);
		// BigDecimal b1 = new BigDecimal(String.valueOf(x));		
		System.out.println("b1 >>> : " + b1);
		BigDecimal b2 = new BigDecimal(y);
		// BigDecimal b2 = new BigDecimal(String.valueOf(y));
		System.out.println("b2 >>> : " + b2);
		
		// 더하기 
		BigDecimal badd = b1.add(b2);
		System.out.println("badd >>> : " + badd);
		badd = badd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("badd >>> : " + badd);
		
		// 빼기
		BigDecimal bsub = b1.subtract(b2);
		System.out.println("bsub >>> : " + bsub);
		
		bsub = bsub.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bsub >>> : " + bsub);
		
		// 곱하기 
		BigDecimal bmul = b1.multiply(b2);
		System.out.println("bmul >>> : " + bmul);
		
		bmul = bmul.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bmul >>> : " + bmul);
		
		// 나누기 
		// BigDecimal bdiv = b1.divide(b2);
		BigDecimal bdiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);
		System.out.println("bdiv >>> : " + bdiv);
		
		bdiv = bdiv.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bdiv >>> : " + bdiv);
	}
}