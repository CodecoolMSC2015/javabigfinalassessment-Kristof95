package personclasses;

public class Employee extends Person
{
	private int salary;
	private String jobTitle;
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public String getJobTitel()
	{
		return jobTitle;
	}
	
	public void setJobTitel(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString()
	{
		return "\nEmployee salary: " + salary + "\tJobtitle: " + jobTitle;
	}
	
//	public static void main(String[] args)
//	{
//		Employee e = new Employee();
//		Skill skill = new Skill("Higéniai szakaszisztens","Takesz");
//		Skill skill_1 = new Skill("Terrorista","C4");
//		e.addSkill(skill);
//		e.addSkill(skill_1);
//		
//		for (Skill skills : e.getSkillset())
//		{
//			System.out.println("\nName: "+skills.getName() + "\tDescription: "+skills.getDescription());
//		}
//	}
}
