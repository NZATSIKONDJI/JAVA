package fr.keyce;

public class Person
{
	private String name;
	private Integer age;
	
	public Person(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}


	public String getName()
	{
		return name;
	}

	public Integer getAge() 
	{
		return age;
	}

	public void incrementAge() 
	{
		this.age ++;
	}
	
	@Override
    public String toString() 
    {
        return name + " a " + age + " ans ";
    }
	
	
	
}
