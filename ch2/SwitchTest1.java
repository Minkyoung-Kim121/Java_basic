package a.b.c;

public class SwitchTest1{

// 변수
// 문자 상수 변환
	public static final String MEDAL_GOLD = "금메달";
	public static final String MEDAL_SILVER= "은메달";
	public static final String MEDAL_BRONZE = "동메달";
	public static final String MEDAL_A = "노메달";

// 생성자

// 함수()
	public String switchM(String medal){

		String medalColor = " ";

		// jdk 1.7 이전에는 switch 문에 들어오는 값을 정수로 사용했는데,
		// jdk 1.7 부터는 정수 값뿐만 아니라 스트링 문자열도 사용이 가능하다.
		switch (medal)
		{
			case "Gold": medalColor = SwitchTest1.MEDAL_GOLD; // -> 'G';
					break;
			case "Silver": medalColor = SwitchTest1.MEDAL_SILVER;
					break;
			case "Bronze": medalColor = SwitchTest1.MEDAL_BRONZE;
					break;
			default:
				medalColor = SwitchTest1.MEDAL_A;
			}

		return medalColor;
}	
	



// main()
	public static void main(String args[]){
	// 명령행 인수로 받아서 처리하기
		int argsLen = args.length;
		System.out.println("argsLen >>> : " + argsLen);

		if (argsLen == 1)
		{
			String medal = args[0];

			if (medal !=null && medal.length() > 0)
			{
				SwitchTest1 st1 = new SwitchTest1();
				String medalColor = st1.switchM(medal);
				System.out.println(">>> : " + medalColor);

			}
		}else{
			System.out.println("데이터 입력해주세요");
		}
		
	} // end of main()

} // end of SwitchTest1 class