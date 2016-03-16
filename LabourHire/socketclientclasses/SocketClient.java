package socketclientclasses;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;

public class SocketClient
{
	private String result;
	
	
	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}

	public SocketClient(String host, int port, Object obj)
	{
		Socket clientSocket;
		
		OutputStream outputStream;
		ObjectOutputStream objectOutputStream;
		
		InputStream inputStream;
		ObjectInputStream objectInputStream;
		try
		{
			clientSocket = new Socket(host,port);
			
			outputStream = clientSocket.getOutputStream();
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(obj);
			
			inputStream = clientSocket.getInputStream();
			objectInputStream = new ObjectInputStream(inputStream);
			result = (String)objectInputStream.readObject();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
