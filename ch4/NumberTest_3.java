package a.b.c;
import java.util.Scanner;

//import java.util.Scanner;
public class NumberTest_3{

	public static int[] lotto(){
		
		int i[] = new int[6];
		System.out.println("i[] >>> : " + i);
		// for �� �Ἥ �迭 ����غ���
		// �� �� ���� Math.random() �Լ� ���� , ���� �����ؼ� i ���� �����ϰ�
		// for �� �� ������ j ���� ����, 
		// ��� �̾Ƽ� �׻� Ȯ���غ���
		// �� �� if �� ������ �ߺ��� ����
		// �ߺ��� ���� �� i-- �ϳ��� ���̳ʽ� �� ��
		// ���̳ʽ� ������ break �Ἥ ������

		// main() �ȿ��� ������ �ǰ�, ���� ó�� �ڿ� ���� ȣ���ؼ� ������ ������
		

		return i; // ����� ���
	}



	public static void main(String args[]){
		
		// ȣ��: Ŭ������.�Լ�();
		int[] ll = NumberTest_3.lotto();
		System.out.println("ll >>> : " + ll);
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

	}

}
	//	i = {1,2,3,4,5,6};
