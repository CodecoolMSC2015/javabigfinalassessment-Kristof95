package socketserverclasses;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;

public class PersonStoreServerSocket
{
	DataReader store;
	
	public void start()
	{
		ServerSocket serverSocket;
		Socket clientSocket;
		OutputStream outputStream;
		ObjectOutputStream objectOutputStream;
		
		try
		{
			serverSocket = new ServerSocket(4444);
			System.out.println("Waiting for client...");
			clientSocket = serverSocket.accept();
			System.out.println("Client address: "+clientSocket.getInetAddress());
			
			outputStream = clientSocket.getOutputStream();
			objectOutputStream = new ObjectOutputStream(outputStream);
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
