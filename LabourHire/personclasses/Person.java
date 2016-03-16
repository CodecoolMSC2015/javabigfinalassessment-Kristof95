package personclasses;

import java.util.ArrayList;
import java.util.List;

public class Person
{
	private String name;
	private String email;
	List<Skill> skillSet;
	
	public Person()
	{
		
	}

	public Person(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public List<Skill> getSkillset()
	{
		return skillSet;
	}

	public void setSkillset(List<Skill> skillset)
	{
		this.skillSet = skillset;
	}
	
	public void addSkill(Skill skill)
	{
		skillSet = new ArrayList<>();
		skillSet.add(skill);
	}
}
