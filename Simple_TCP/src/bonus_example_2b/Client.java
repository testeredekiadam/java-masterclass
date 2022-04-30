package bonus_example_2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public Client() throws Exception{
		// Connection
		Socket socket = new Socket("127.0.0.1", 2020);
		System.out.println("Succesful connection to the server");
		// I/O stream
		BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
		
		//get message from user and define secretnumber
		Scanner keyboard = new Scanner(System.in);
		String user_number;
		String sn = in_socket.readLine();
		System.out.println(sn);
		
		while((in_socket.readLine()).startsWith("Go")) {
			System.out.println("Guess the number [1-20]");
			user_number = keyboard.nextLine();
			out_socket.println(user_number);
		}
		
		System.out.println("You got it!");
		
		keyboard.close();
		socket.close();
		System.out.println("Disconnected!");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			new Client();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 

}
