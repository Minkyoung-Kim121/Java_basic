package a.b.c;



abstract class SqlQueryMap{/* �θ� */ 

	public static String getSelectQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT \n");
		sb.append("        A.NAME AS NAME  \n");
		sb.append("        A.ID   AS ID    \n");
		sb.append("        A.PW   AS PW    \n");
		sb.append("        A.HP   AS HP    \n");
		sb.append("        A.ADDR AS ADDR  \n");
		sb.append("FROM    MEMBER A        \n");

		return sb.toString(); // -> StringBuffer �� String ���� �ٲ㼭 ����.

	}

	// �߻�Ŭ������ �ִ� �߻��Լ�
	public abstract void aM();

} // end of SqlQueryMap class abstract

public class StringBufferTest_1 /* �ڽ� */ extends SqlQueryMap/* �θ� */{
	// extends -> �߻��Լ� aM() �Լ��� �ν��Ͻ� �ϱ� ���� �����.

	@Override // �������̵�  ->  ��ӽ��Ѽ� ��(��Ģ)
	public void aM(){
		System.out.println("SqlQueryMap �߻�Ŭ�������� "
		                   + "\n aM() �߻��Լ��� "
						   + "\n StringBufferTest_1 Ŭ������ "
						   + "\n �������̵��ؼ� ����ü�� ������� "
						   + "\n ����ü�� ����ٴ� �ǹ̴� {} �� ����ٴ� ���� ");
	}


	public static void main(String args[]){
		
		String selectQuery = SqlQueryMap.getSelectQuery();
		System.out.println("\n" + selectQuery);

		// SqlQueryMap sqm = new SqlQueryMap();    �߻��Լ��� new�� ����ؼ� �ν��Ͻ� �ϸ� x
		//									       ����ؼ� ����ؾ� �Ѵ�.
		StringBufferTest_1 sb1 = new StringBufferTest_1();
		// SqlQueryMap �� ������� �θ� Ŭ����, 
		// extends ��� ��� : �ڽ� Ŭ������ ���� ����ؼ� new �ν��Ͻ� �Ѵ�.
		sb1.aM(); // aM() �Լ� ȣ��. ���� �ö󰡼� ������.

	} // end of main()


} // end of StringBufferTest_1 class

//=>���?
// Ŭ������ �� �� 1) �߻� Ŭ���� : SqlQueryMap (��� ���� : �θ�)
//			   2) �Ϲ� Ŭ���� : StringBufferTest_1 (��� ���� : �ڽ�)
// �߻�Ŭ���� SqlQueryMap�� �ִ� �߻� �Լ� aM() �� ȣ���ϱ� ���ؼ�,
// �ν��Ͻ��� �ؾ� �ϴµ�, �߻��Լ��� new �� �ٷ� �� �� �� ���� ������ ����� �ؼ� �ν��Ͻ� �ؾ��Ѵ�.
// ���� extends Ű���带 �̿��ؼ� �θ�->�ڽ� ��� �� �ڽ� new �ν��Ͻ� ��, aM() �Լ��� ȣ���ߴ�.

// Q) implements �� ���� ���� ���� : �θ� ������ �ڿ��� ������ ���� �ƴ϶�, aM() �Լ��� ���� ����� �� ���̱� ������ extends ���.
// A)  ���� ������ �θ� �ڿ����� �������ؼ��� implements �ؾ��ϴµ�, abstract Ŭ����(�߻�Ŭ����)��  ���� ��Ӹ� �Ǳ� ������ �� ������,
//     �������̽��� ����ؾ� �Ѵ�.