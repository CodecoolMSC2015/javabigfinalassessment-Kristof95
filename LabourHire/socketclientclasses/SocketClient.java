package socketclientclasses;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;

public class SocketClient
{
	public SocketClient(String host, int port, Object obj)
	{
		Socket clientSocket;
		OutputStream outputStream;
		ObjectOutputStream objectOutputStream;
		try
		{
			clientSocket = new Socket(host,port);
			outputStream = clientSocket.getOutputStream();
			objectOutputStream = new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(obj);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
