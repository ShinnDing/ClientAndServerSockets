package com.shinnding;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Client class creates and sends client socket requests for Favorite Guitars 1
 * through 4.
 * 
 * To adere to school policy, complete code is only available to employers upon request. 
 *
 * @author Stephanie Shinn
 *
 */
public class Client {

	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;

	/**
	 * Main method to run Client class.
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		//code removed to adhere to school policy
	}
	
	/**
	 * Creates the client socket to send requests and receive responses through.
	 * 
	 * @param hostName
	 * @param portNumber
	 * @param request
	 */
	public void sendRequest(String hostName, int portNumber, String request) {

		try {
		//code removed to adhere to school policy

		} catch (IOException e) {
			// ignore and let thread die
		} catch (ClassNotFoundException e) {
			// ignore and let thread die
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				// ignore and let thread die
			}
		}

	}
	
	/**
	 * Creates client requests for Favorite Guitars 1 through 4 to pass to Server
	 * socket.
	 * 
	 * @param client
	 * 
	 * @throws InterruptedException
	 */
	private static void simulateMulipleClients(Client client) throws InterruptedException {

				//code removed to adhere to school policy
		
		}

		System.out.println("Testing done.");

		// Send the final request to stop
		client.sendRequest("localhost", 12001, "stop");
	}
	
	/**
	 * The request will await its turn before entering socket.
	 * 
	 * Adapted from Paul Hyde's "Waiting Best Practices" as taught in ICS 440.
	 * 
	 * @param msTimeout
	 * @param request
	 * 
	 * @return boolean
	 * 
	 * @throws InterruptedException
	 */
	public static boolean waitUntilZero(long msTimeout, String request) throws InterruptedException {
			//code removed to adhere to school policy
		}
	}

}
