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
	public String csvFilePath = "C:\\Users\\Kristof\\Desktop\\JAVA%20BFA\\javabigfinalassessment-Kristof95\\Documentation\\persons.csv";
	List<Person> persons;
	
	
	public CSVDataReader(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}


	@Override
	public Set<Person> getPersons()
	{
		BufferedReader bufferedReader;
		String line = "";
		try
		{
			bufferedReader = new BufferedReader(new FileReader(csvFilePath));
			while ((line = bufferedReader.readLine()) != null)
			{
				String[] tokens = line.split(",");
				Set<String> set = new HashSet<String>(Arrays.asList(tokens));
				if(set.contains(""))
				{
					return null;
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
	
	
}
