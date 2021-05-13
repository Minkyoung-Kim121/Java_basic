package a.b.c;

public class SwitchTest1{

// ����
// ���� ��� ��ȯ
	public static final String MEDAL_GOLD = "�ݸ޴�";
	public static final String MEDAL_SILVER= "���޴�";
	public static final String MEDAL_BRONZE = "���޴�";
	public static final String MEDAL_A = "��޴�";

// ������

// �Լ�()
	public String switchM(String medal){

		String medalColor = " ";

		// jdk 1.7 �������� switch ���� ������ ���� ������ ����ߴµ�,
		// jdk 1.7 ���ʹ� ���� ���Ӹ� �ƴ϶� ��Ʈ�� ���ڿ��� ����� �����ϴ�.
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
	// ����� �μ��� �޾Ƽ� ó���ϱ�
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
			System.out.println("������ �Է����ּ���");
		}
		
	} // end of main()

} // end of SwitchTest1 class