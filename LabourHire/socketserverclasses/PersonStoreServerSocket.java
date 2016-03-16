package socketserverclasses;

import java.io.InputStream;
import java.io.ObjectInputStream;
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
		
		InputStream inputStream;
		ObjectInputStream objectInputStream;
		
		try
		{
			serverSocket = new ServerSocket(4444);
			System.out.println("Waiting for client...");
			clientSocket = serverSocket.accept();
			System.out.println("Client address: "+clientSocket.getInetAddress());
			
			inputStream = clientSocket.getInputStream();
			objectInputStream = new ObjectInputStream(inputStream);
			String getCriteria = (String)objectInputStream.readObject();
			
			System.out.println("Received: "+getCriteria);
			
			outputStream = clientSocket.getOutputStream();
			objectOutputStream = new ObjectOutputStream(outputStream);
			
			objectInputStream.close();
			objectOutputStream.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		PersonStoreServerSocket personServerSocket = new PersonStoreServerSocket();
		personServerSocket.start();
	}
}
