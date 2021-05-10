package a.b.c;

public class MessageEngImpl implements MessageInterface{

	@Override
	public void sayHello(String name){
		System.out.println("Hello" + name + "!");


	}

}