package a.b.c;

// � Ŭ������ import �ϴ��� ���̴� ���� -> ������ ����
import java.util.Scanner;

public class ScannerTest{

	public static void main(String args[]){

		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// -> �ڹ� �ܼ� ���α׷� �ܺο��� �����͸� �Է� �޾Ƽ� ����� ��,
		//    main() �Լ��� �Ű������� ��Ʈ�� �迭(String args[])�� ����Ͽ��µ�
		//    �� ������ ����� �μ� ��� �̶�� �Ѵ�.
		// ���� ����) ���ø����̼��� �����ϸ鼭 ����� �μ� ��� ����� �����ϴٰ� �Ͽ�
		//          jdk 1.5 ���� �߰��� Ŭ�����̴�. �̴� �ֿܼ��� �ܺ� �����͸� �޾ƿ��� ������ �ϸ�
		//          ���ڿ�, ���� �� �޾ƿ� �����ʹ� �ش� �Լ��� �����ϰ� ����ؾ� �Ѵ�.
		// System.in : �ܺ� �����͸� �޾ƿ´�.

		// ����� �μ� �� Scanner class �� ����
		// ->������ ����ȯ�� ��(����� �μ�x)�� ������ Scanner Ŭ������ �����ϴ�.
		Scanner sc = new Scanner(System.in);

		System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
		// ����(�� �޾ƿ�����) : ��ĳ�� Ŭ���� ��������.nextInt();
		int i = sc.nextInt();
		System.out.println("i >>> : " + i);

		System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
		// �Ǽ�(�� �޾ƿ�����) : ��ĳ�� Ŭ���� ��������.doubleInt();
		double d = sc.nextDouble();
		System.out.println("d >>> : " + d);

		System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
		// ���ڿ�(�� �޾ƿ�����) : ��ĳ�� Ŭ���� ��������.next();
		String s1 = sc.next();
		System.out.println("s1 >>> : " + s1);

		System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
		// ���ڿ�(�� �޾ƿ�����) : ��ĳ�� Ŭ���� ��������.nextLine();
		String s = sc.nextLine();
		System.out.println("s >>> : " + s);
	
	} // end of main()
} // end of ScannerTest class