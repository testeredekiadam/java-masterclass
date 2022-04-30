package bonus_example_2bb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {

	private Socket socket;
	private ServerMain server_main;
	
	public ServerThread(Socket socket, ServerMain server_main) {
		this.socket = socket;
		this.server_main = server_main;
	}
	
	
	
	@Override
	public void run() {
		try {
			
			int client_number = server_main.getClientID();
			System.out.println("Client " + client_number + " is connected.");
			
			BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
			
			int secret = server_main.getSecret();
			String message;
			out_socket.println(secret);
			
			out_socket.println("Type in your name: ");
			String user = in_socket.readLine();
			
			while(true) {
				out_socket.println("Guess");
				message = in_socket.readLine();
				
				
				if((Integer.parseInt(message) == secret) && (!server_main.getGuessed())) {
					server_main.setGuessed();
					server_main.setWhoGuessed(user);
					out_socket.println( server_main.getWhoGuessed() +" has guessed the number!");
					System.out.println("User \"" + server_main.getWhoGuessed() + "\" has guessed the number!");
					socket.close();
					System.out.println("Client " + client_number + " has disconnected");
					break;
				}
				else if((Integer.parseInt(message) == secret) && (server_main.getGuessed())) {
					out_socket.println(server_main.getWhoGuessed() +" has guessed the number.");
					socket.close();
					System.out.println("Client " + client_number + " has disconnected.");
					break;
					}
				else if(server_main.getGuessed()) {
					out_socket.println(server_main.getWhoGuessed() + " has guessed the number.");
					socket.close();
					System.out.println("Client " + client_number + " has disconnected.");
					break;
				}
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
