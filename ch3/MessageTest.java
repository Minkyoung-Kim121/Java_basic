package a.b.c;

public class MessageTest
{
	//����
	//������
	//�Լ�
	//main()
	public static void main(String args[]){
		
		//�θ�Ŭ���� ���� �θ�Ŭ���� ���� = new �ڽ�Ŭ����() �ν��Ͻ�
		MessageInterface mKor = new MessageKorImpl();
		mKor.sayHello("�ѱ�");

		MessageInterface mEng = new MessageKorImpl();
		mEng.sayHello("English");

		MessageInterface mKor1 = new MessageKorImpl();
		mKor1.sayHello("�ѱ�");
	}
}