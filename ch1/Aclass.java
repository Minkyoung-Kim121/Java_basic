package a.b.c;

/*
A)extendsŰ���� Ư¡
extends Ű���� : Ŭ������ ����ϴ� Ű���� (�ڹ� Ŭ������ ���� ����̴�.)
����� �ϸ�) �ڽ� Ŭ����/�θ� Ŭ������ ����.
subClass, superClass
childClass, parentClass

���Ǽ����� ��Ӱ����
: �θ�-�ڽ� ���迡���� ������ ��� �θ� ����� ���Ƽ� �ڽĿ��� ������ش�.
�ڹټ����� ��Ӱ����
: �ڽ��� �θ��� ���� �� ������ �־ ������� ����ص� �ȴ�.
*/
// java.lang.Object Ŭ������ �θ�
// a.b.c.Aclass Ŭ������ �ڽ�
// a.b.c.Aclass ������ ����Ʈ�� ��ӵ� java.lang.Object Ŭ������ �ڿ���
// a.b.c.Aclass ���� ����� �� �ִ�.
// java.lang.Object Ŭ�������� superClass���� 11���� �Լ��� Object() �����ڰ� �ִ�.
public class Aclass //extends java.lang.Object <-�ֵ� ����! �̰� ������ ����Ʈ��.
//											   <- �ڹٷ�������Ʈ�� extends(���)�Ѵ�.
{

	public String acValue(){
		return "Aclass >>> : " + this;
		//this ��� ���� ���� ���߿� ����

	}
	public static void main(String args[]){

		Aclass ac = new Aclass();
		//��toString ���� ��� ���߿� �� ��������
		System.out.println("ac.toString() >>> : " + ac.toString());
		System.out.println("ac >>> : java.lang.Object Ŭ������ toString()�Լ��� ������ ����" + ac);
		String acV = ac.acValue();

		System.out.println("acV >>> : " + acV);
//ac <- ������ ���� Ű���带 ��ٰ� ������ ���� ���� �ƴϴ�. ������ �� ���ٸ�, 
//     ��򰡿� �����ϴ� ��. ����� ����� �ö󰡸鼭 ã�Ƴ��� �Ѵ�.(�� �ڵ���!)
	
	} // end of main()
} // end of Aclass class