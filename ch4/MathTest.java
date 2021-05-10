package a.b.c;


public class MathTest{
	
	public static void main(String args[]){



//		상수 E   자연 로그의 밑인 e 값
		System.out.println("E : " + Math.E); // E : 2.718281828459045

//		상수 PI   원주율
		System.out.println("PI >>> : " + Math.PI); // PI >>> : 3.141592653589793
		//Q) 소수 셋째자리 이후로 버린 원주율 값을 쓰고 싶을떄??
//		int PI1 = ???.Math((int) Math.PI);
//		System.out.println("PI1 >>> : " + Math.PI1);

//		max()   (a,b)   -> a와 b 중 max 값
		int max = Math.max(200, 2); // 200
		System.out.println("max >>> : " +max);

//		min()   (a,b)   -> a와 b 중 min 값
		int min = Math.min(1, 100); // 1
		System.out.println("min >>> : " + min);

//		abs()   (a)   -> a의 절대값 (부호비트 제거) 부호비트 : + - ...
		int abs = Math.abs(-100);
		System.out.println("abs >>> : " + abs); // 100

		
//		pow()   (a, b)   -> (a)의 (b)제곱   제곱 연산
		double pow = Math.pow(8, 4); 
		System.out.println("pow >>> : " + pow); // 4096.0

//		random()   ()   -> 0.0 - 1.0 사이의 난수(랜덤수)  0.0에서 0.9 까지만 출력된다.
		double random = Math.random();
		System.out.println("random >>> : " + random); //  0.3510705859887501

		// Q)정수인 난수를 출력하려면...?
		int random1 = (int) Math.random();
		System.out.println("random1 >>> : " + random1); // 0 

//		round()   (a.bcd)   -> a.bcd의 소수점 첫 번째 자리에서 반올림
		double round = Math.round(45.24687);
		System.out.println("round >>> : " + round); // 45.0

//		ceil()   전달받은 실수(a.bcdf) 보다 가장 작은 정수(0 =< a) 중 가장 큰 작은 정수 반환
		double ceil = Math.ceil(10.456);
		System.out.println("ceil >>> : " + ceil); // 11

//		floor()   (a.bcdf)   -> 전달 받은 실수(a.bcdf)보다 가장 작은 정수(0 =< a) 중 가장 큰 정수 반환
		double floor = Math.floor(10.456);    //  10.456 보다 작은 정수들 중 가장 큰 10을 반환.
		System.out.println("floor >>> : " + floor); // 10.0



		
	}
}