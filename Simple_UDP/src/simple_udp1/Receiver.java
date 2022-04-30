package simple_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Receiver {

	
	public Receiver() throws Exception{
		
		DatagramSocket socket = new DatagramSocket(2020);
		System.out.println("Receiver is running.");
		Scanner keyboard = new Scanner(System.in);
		
		byte[] buffer = new byte[1500]; // MTU = 1500
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		
		socket.receive(packet); // retrieving sender's message
		
		String message = new String(buffer).trim();
		System.out.println("Receiver: " + message);
		
		InetAddress senders_address = packet.getAddress();
		int senders_port = packet.getPort();
		
		System.out.println("Enter your message.");
		message = keyboard.nextLine();
		buffer = message.getBytes();
		packet = new DatagramPacket(buffer, buffer.length, senders_address, senders_port);
		socket.send(packet);
		
		System.out.println("Sent: " + message);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			new Receiver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
