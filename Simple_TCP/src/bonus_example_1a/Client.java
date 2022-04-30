package bonus_example_1a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	
	public Client() throws Exception{
		Socket socket = new Socket("127.0.0.1", 2020);
		System.out.println("Successful connection to the server.");
		
		// I/O streams
		BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
		Scanner keyboard = new Scanner(System.in);
		
		String message = "message";
		System.out.println("To quit, type 'EXIT'");
		
		while(!(message.equalsIgnoreCase("EXIT"))) {
			System.out.println("Enter your text");
			message = keyboard.nextLine(); // read users input and store it in the message
			out_socket.println(message); // send user's input to the server
			message = in_socket.readLine(); // receive server's response
			System.out.println("Result: " + message);
		}
		
		socket.close();
		System.out.println("Socket closed.");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
			new Client();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
