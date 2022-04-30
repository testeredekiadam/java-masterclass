package bonus_example_2bb;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	
	public ServerMain() throws Exception{
		ServerSocket server_socket = new ServerSocket(2020);
		System.out.println("Port is open");
		
		while(true) {
			Socket socket = server_socket.accept();
			ServerThread server_thread = new ServerThread(socket, this);
			Thread thread = new Thread(server_thread);
			thread.start();
		}
	}
	
	
	private int secret = (int)(Math.random()*20 + 1);
	
	public int getSecret() {
		return secret;
	}
	
	private boolean guessed = false;
	
	public void setGuessed() {
		guessed = true;
	}
	
	public boolean getGuessed() {
		return guessed;
	}
	
	private String user;
	
	public void setWhoGuessed(String user) { 
		this.user = user;
	}
	
	public String getWhoGuessed() {
		return user;
	}
	
	
	
	private int clientID = 1;
	
	public int getClientID() {
		return clientID++;
	}
	
	public static void main(String[] args) {
		try {
			new ServerMain();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
