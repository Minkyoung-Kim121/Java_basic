package a.b.c;

import java.util.Scanner;

/*<IT 용어>  개념이랑 같이 암기해야 한다.
Source Destination(Target)
Stream 
in / out 
inbound / outbound

protocol : 통신 규약 이다. 

port : 어플리케이션을 가르킨다.
       컴퓨터에서 프로그램(어플리케이션)은 port 로 찾아간다. 
	   Oracle DBMS : 1521 port 
	   MS-SQL Server : 1433 port
ip : 컴퓨터를 가르킨다. 
     (한대의 컴터(서버)에 4개의 ip 를 가질 수 있다.)
	 한대의 컴터에 network 카드를 4개 꼽을 수 있음 (슬롯 이 4개)
tcp : 

ipconfig 
ipconfig /all
netstat
ping
MAC address 

IPv4 : 32bit
IPv6 : 128bit
*/
public class IOTest{
	public static void main(String args[]){
		System.out.println("IO 테스트 숫자 : ");
		Scanner sc = new Scanner(System.in); // scanner 함수 쓸거라고 선언 sc 참조변수로
		int data = sc.nextInt(); // int data 를 입력하세요
		System.out.println("binary >> " + Integer.toBinaryString(data));
		// 위 int data 를 콘솔에 입력하면, int data 에 입력한 숫자를 String 으로 변환해서 출력해준다.

		System.out.println("IO 테스트 문자 : ");
		Scanner sc1 = new Scanner(System.in); // scanner 를 또 쓰기 위해 sc1 참조변수로 사용하겠다고 함.
		String dataS = sc1.nextLine(); // 이번에는 String dataS 를 입력해주세요
		System.out.println("문자 >> " + dataS); // dataS 값 출력
		
		for(int i = 0; i< dataS.length(); i++){ 
			// int i가 0부터 돌기 시작하고, dataS.length()(dataS 의 길이) 보다 작을 때 i 하나씩 증가시켜주세요.
			char c = dataS.charAt(i);  //  dataS 에 입력한 값을 문자로 쪼개기
									   //  .charAt(i)  -> i가 쫘르륵 문자로 쪼개서 출력 된다. 1씩 증가하면서
			System.out.println("binary >> :\n" + c  // \n 한 줄 띄고
								+ (byte)c   // c 를 byte 로 형변환
								+ Integer.toBinaryString((byte)c));  // byte 로 형변환한 c를 String 으로 또 변환
		}
	}
}

// 스캐너 함수 사용법
// import java.util.Scanner 한다.
// 쓰려는 영역 안에(주로 메인)-인터프리터방식 
// Scanner 참조변수 sc = new Scanner();     new 키워드를 사용해서 Scanner 클래스를 함수로 만들어서 사용
// Scanner sc = new Scanner(System.in);   System.in    입력하라는 의미
// 스캐너 클래스를 함수로 만들어서 사용할 준비가 되었다면, 콘솔 창에 입력하는 란? 이 있어야!!
// 그래서 
// .nextInt(); 함수를 사용한다.
// 데이터타입 int 참조변수 data = 위에서 선언한 참조변수 sc에 nextInt(); 함수 사용.
// 따라서 
// int data = sc.nextInt();      이 라인이 실행되면 콘솔에서는 데이터를 입력한다.
// 입력하는 칸? 란? 을 추가하려면 int data(변경) = sc.nextInt(); 를 추가하고 싶은 만큼 작성해야 한다.