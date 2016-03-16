package socketserverclasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import personclasses.Person;

public class CSVDataReader extends DataReader
{
	public String csvFilePath = "";
	List<Person> persons;
	
	
	public CSVDataReader(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}


	@SuppressWarnings("resource")
	@Override
	public Set<Person> getPersons()
	{
		PersonStoreServerSocket personStoreServerSocket = new PersonStoreServerSocket();
		BufferedReader bufferedReader;
		String line = "";
		String receivedObject = (String)personStoreServerSocket.receivedObject();
		Set<String> set;
		Set<Person> persons = new HashSet<Person>();
		try
		{
			bufferedReader = new BufferedReader(new FileReader(csvFilePath));
			while ((line = bufferedReader.readLine()) != null)
			{
				String[] tokens = line.split(",");
				set = new HashSet<String>(Arrays.asList(tokens));
				if(set.contains(receivedObject))
				{
					System.out.println(set);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public void setSearchCriteria(String searchCriteria)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSearchType(SearchType searchType)
	{
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		CSVDataReader csdr = new CSVDataReader("C:\\Users\\Kristof\\Desktop\\JAVA BFA\\javabigfinalassessment-Kristof95\\Documentation\\persons.csv");
		csdr.getPersons();
		
		
	}
}
