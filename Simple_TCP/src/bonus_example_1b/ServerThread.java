package bonus_example_1b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
	
	private Socket socket;
	private ServerMain server_main;
	
	public ServerThread(Socket socket, ServerMain server_main) {
		this.server_main = server_main;
		this.socket = socket;
	}
	
	

	@Override
	public void run() {
		
		try {
			
			int client_number = server_main.getClientNumber();
			
			System.out.println("Client " + client_number + " has connected.");
			
			// I/O Buffers
			BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
			
			
			String message = "message";
			
			while(!(message.equalsIgnoreCase("EXIT"))) {
				message = in_socket.readLine();
				StringBuilder sb = new StringBuilder(message);
				out_socket.println(sb.reverse().toString());
				}
			
			socket.close();
			System.out.println("Client " + client_number + " disconnected.");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	

}
