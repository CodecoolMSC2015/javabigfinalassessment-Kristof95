package socketserverclasses;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;

public class PersonStoreServerSocket
{
	DataReader store;
	
	ServerSocket serverSocket;
	Socket clientSocket;
	
	public void start()
	{				
		try
		{
			serverSocket = new ServerSocket(4444);
			System.out.println("Waiting for client...");
			clientSocket = serverSocket.accept();
			System.out.println("Client address: "+clientSocket.getInetAddress());
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sendObject(Object obj)
	{
		OutputStream outputStream;
		ObjectOutputStream objectOutputStream;
		try
		{
			outputStream = clientSocket.getOutputStream();
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(obj);
			System.out.println("Object was sent...");
//			objectOutputStream.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Object receivedObject()
	{
		InputStream inputStream;
		ObjectInputStream objectInputStream;
		try
		{
			inputStream = clientSocket.getInputStream();
			objectInputStream = new ObjectInputStream(inputStream);
			String getCriteria = (String)objectInputStream.readObject();
			
			System.out.println("Received: "+getCriteria);
//			objectInputStream.close();
			return getCriteria;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		PersonStoreServerSocket personServerSocket = new PersonStoreServerSocket();
		personServerSocket.start();
	}
}
