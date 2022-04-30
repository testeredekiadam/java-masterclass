package bonus_example_2b;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	
	public MainServer() throws Exception{
		
		ServerSocket server_socket = new ServerSocket(2020);
		System.out.println("Port 2020 is open.");
		
		while(true) {
			Socket socket = server_socket.accept();
			ServerThread server_thread = new ServerThread(socket, this);
			Thread thread = new Thread(server_thread);
			thread.start();
			
		}
	}
	
	
	private int clientID = 1;
	public int getClientId() {
		return clientID++;
	}
	
	
	public static void main(String[] args) {
		try {
			new MainServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
