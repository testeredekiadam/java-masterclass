package bonus_example_2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {

	private Socket socket;
	private MainServer main_server;
	
	public ServerThread(Socket socket, MainServer main_server) {
		this.main_server = main_server;
		this.socket = socket;
	}
	


	
	
	@Override
	public void run() {
		try {
			 //Client number get and write on the screen
			int client_number = main_server.getClientId();
			System.out.println("Client " + client_number + " has connected.");
			
			// I/O Buffers
			
			BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
			
			
			// get message and operate
			String message;
			int secret_number = (int)(Math.random()*20 + 1 );
			out_socket.println(secret_number);
			
			do {
				out_socket.println("Go");
				message = in_socket.readLine();
			} while(!(Integer.parseInt(message) == secret_number) );
			
			out_socket.println("Done");
			
			System.out.println("You got it.");
			System.out.println("Secret number was found. Disconnecting.");
			//close the sockets
			socket.close();
			System.out.println("Disconnected.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
