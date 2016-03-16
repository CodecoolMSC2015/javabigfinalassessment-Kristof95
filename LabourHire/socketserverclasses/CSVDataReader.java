package socketserverclasses;

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

	
	public Set<Person> getPersons()
	{
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
