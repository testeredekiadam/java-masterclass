package bonus_example_2bb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public Client() throws Exception {
		Socket socket = new Socket("127.0.0.1", 2020);
		System.out.println("Succesful connection to the server.");
		
		BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
		Scanner keyboard = new Scanner(System.in);
		
		String message;// message from server
		String usernumber;// users guess
		String username;// username
		System.out.println("secret: " + in_socket.readLine());
		
		// get username
		message = in_socket.readLine();
		System.out.println("Server: " + message);
		username = keyboard.nextLine();
		out_socket.println(username);
		
		// winning message
		String winning_message = "User " + username;
		
		// guessing the number
		while(true) { // break when the number was guessed
			message = in_socket.readLine();
			
			if(message.startsWith("Guess")) { // server sends guess message
				System.out.println("Server says: Guess the number [1-20]."); // guess
				usernumber = keyboard.nextLine(); // get the guess from user
				out_socket.println(usernumber);// send the user's guess to the server
			}
			else if(message.startsWith(winning_message)) {// user guessed right
				System.out.println("You got it!");
				socket.close();
				System.out.println("Socket closed.");
				break;
			}
			else { // someone guessed
				System.out.println(message);
				socket.close();
				System.out.println("Socket closed.");
				break;
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		try {
			
			new Client();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
