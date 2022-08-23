package com.shinnding;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * Server class to respond to client requests.
 * 
 * To adere to school policy, code is only available to employers upon request. 
 *
 * @author Stephanie Shinn
 *
 */
public class Server {

	ServerSocket serverSocket = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	boolean shutdown = false;
	
	/**
	 * Main method to run Server class.
	 * 
	 * @args String[] args
	 * 
	 * @param Server server
	 */
	public static void main(String[] args) {
		Server server = new Server();
		try {
			server.start(12001);
		} catch (IOException e) {
			// ignore and let thread die
		}

	}
	
	/**
	 * Start a server at the given port.
	 * 
	 * @param port
	 * 
	 * @throws IOException
	 */
	public void start(int port) throws IOException {

		//code removed to adhere to school policy

	}

	/**
	 * Starts thread to process client requests.
	 * 
	 * @param port
	 * @param serverSocket
	 * 
	 * @throws IOException
	 */
	private void runServer(int port, ServerSocket serverSocket) throws IOException {

		//code removed to adhere to school policy

		try {
		//code removed to adhere to school policy
		} catch (SocketException ex) {
			// Do nothing and let thread die.
		} catch (Exception ex) {
			// Do nothing and let thread die.
		} finally {
			// Do nothing and let thread die.
		}
	}
	
	/**
	 * Creates new ObjectOutputStream and ObjectInputStream to communicate with client socket.
	 * 
	 * @param clientSocket
	 */
	private void processClient(Socket clientSocket) {

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			//code removed to adhere to school policy
		} catch (IOException | ClassNotFoundException e) {
			// ignore and let thread die
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (ois != null) {
					ois.close();
				}
				
				clientSocket.close();
				
				if (shutdown) {
					serverSocket.close();
				}

			} catch (IOException e) {
				// ignore and let thread die
			}
		}
	}

}
