package a.b.c.swing.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.ArrayList;
import java.util.List;

class TcpChatServerManager{

	private List<Socket> socketList;

	// 생성자 : TCSM 객체를 생성하면 소켓리스트 하나 만듦
	public TcpChatServerManager(){
		socketList = new ArrayList<Socket>();
	}

	// 소켓 추가 method
	public void addSocket(Socket socket){
		this.socketList.add(socket);
		new Thread(new ReceiverThread(socket)).start();
	}

	// 멀티 클라이언트와 연결을 동시에 유지하기 위한 Thread 구성
	// 각각의 소켓 정보를 가지고 있어야 한다.
	class ReceiverThread implements Runnable{
		private Socket socket;  // 소켓

		public ReceiverThread(Socket socket){
			this.socket = socket;
		}

		@Override
		public void run(){
			// TODO Auto-generated method stub

			try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true)
				{
					String msg = br.readLine();   // 클라이언트가 보낸 메시지 읽기
					System.out.println(msg);

					// 메시지를 보낸 클라이언트를 제외하고 받은 메시지를
					// 모든 클라이언트에게 보내기
					 Socket tmpSocket = null;
					try
					{
						for (int i = 0; i < socketList.size(); i++) 
						{ // 소켓리스트를 순회하면서
                            tmpSocket = socketList.get(i);
                            // socketList.get(0) -> 소켓 객체
                            
                            if (socket.equals(tmpSocket)) continue;
                            // 메시지를 보낸 클라이언트라면 반복을 한번 건너뛰기
                            
                            // 서버가 받은 메시지를 클라이언트에 송신하기
                            BufferedWriter bw = new BufferedWriter(
                                    new OutputStreamWriter(tmpSocket.getOutputStream()));
                            
                            bw.write(msg + "\n");
                            bw.flush();
                        }
					}
					catch (Exception e)
					{
						System.out.println(tmpSocket.getRemoteSocketAddress() + "연결 종료");
						socketList.remove(tmpSocket);
						// 연결을 끊은 클라리언트를 위한 소켓 제거

						System.out.println("=============현재 참여자=============");
						for (Socket s : socketList)
						{
							System.out.println(s.getRemoteSocketAddress());
						}
						System.out.println("===================================");
					}
				}
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}finally{
				if (socket != null)
				{
					System.out.println(socket.getRemoteSocketAddress() + "연결 종료");
					socketList.remove(socket);
					// 연결을 끊은 클라이언트를 위한 소켓 제거

					System.out.println("=============현재 참여자=============");
					for (Socket s : socketList)
					{
						System.out.println(s.getRemoteSocketAddress());
					}
					System.out.println("=================================");
				}
			}
		}
	}
}

public class TcpChatServer {
		public static void main(String[] args){
		//TODO Auto-generated method stub
		// 서버소켓
		
        TcpChatServerManager tcsm = new TcpChatServerManager();
 
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while (true) {
                Socket socket = serverSocket.accept(); // 클라이언트 연결요청 대기(연결요청 오기전엔 멈춤)
                // -> 연결요청오면? 소켓을 반환
                // 멀티 클라이언트 -> 소켓이 여러개 -> 리스트로 관리
                // -> 서버 매니져 클래스로 관리
                
                System.out.println(socket.getRemoteSocketAddress() + " : 연결");
                tcsm.addSocket(socket); // 얻은 소켓 서버매니져의 소켓목록에 추가
            }
 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("e >>> : " + e);
        }
	}
}