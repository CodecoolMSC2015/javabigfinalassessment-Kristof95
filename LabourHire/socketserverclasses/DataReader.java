package socketserverclasses;
import personclasses.Person;

import java.util.Set;

public abstract class DataReader
{
	String searchCriteria;
	SearchType searchType;
	
	public abstract Set<Person> getPersons();
	
	public abstract void setSearchCriteria(String searchCriteria);
	
	public abstract void setSearchType(SearchType searchType);
}