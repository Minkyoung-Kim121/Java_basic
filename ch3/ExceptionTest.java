package a.b.c;


public class ExceptionTest{

	public void aM() throws Exception{
		System.out.println("aM() �Լ�");

		new Thread().sleep(1000);
	}

	public static void main(String args[]) throws Exception{

		try 
		{
			// ��� �����.
		int x = 1;
		int y = 0;
		int z = x / y; // -> ������� ��� �������� ����x (int y = 0  �̱� ����)

		System.out.println("z >>> : " + z); // -> �׻� ���ϰ� �޾Ƽ� ���°��� �����ؾ� �Ѵ�.
		System.out.println("x / y >>> : " + (x / y)); // -> ������ (���� x)
//		System.out.println(1 / -1); -> ���� ��� ���� ���̴�. 

		}

		catch (ArithmeticException a){

//��1)		catch (Exception a){

			// ArithmeticException -> ��� ���� �� �߻��� �� �ִ� ����, �� 0���� ���� ������� ���� ��� �߻�
			//                        runTimeException�� ���� �׸��̸� �ٽ� ����, ���� (������x)�� ������ ����
			//                        ��, ������ �� ������ �ʱ� ������ ���� Ȯ���ؾ�.
			System.out.println("a >>> : " + a.getMessage());
		}

//��1)		catch ( ArithmeticException e )     -> ó�������ϱ� �� ���� ����� ���
/*��1)
C:\00.KOSMO72\00.JExam\ch3>javac -d . ExceptionTest.java
ExceptionTest.java:36: error: exception ArithmeticException has already been caught
                catch (ArithmeticException a
                ^
1 error
*/

// try catch �������� p.488
// catch ���� �������� �� �� �ִµ�, Exception�� ���� Ŭ�������� ����Ѵ�. 

		catch ( Exception e )
			/* try ������ �߻��� ���ܸ� ó���� Ŭ������ ���� Ÿ���� �����ϴ� �� */
			 // -> Exception class : ���� Ŭ������ �ֻ��� Ŭ����
		{
			// ��� ó���� �Ѵ�.
			// ���ܸ� ó���ϴ� �κ�
//			System.out.println("e >>> : " + e); // -> ��� ����
//			System.out.println("e <<<>>> : " + e); // -> ��� ����
			System.out.println("e.getMessage() >>> " + e.getMessage()); // -> �̰͸� ���� ��.
//			e.printStackTrace(); // -> ��� ���� (���� �߻��� ����ӵ��� ���Ͻ�Ų��.)
		}
		
		System.out.println("try catch �� ���� ");
		ExceptionTest et = new ExceptionTest();
		et.aM();

	}




}