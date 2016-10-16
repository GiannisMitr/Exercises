public class Employee{

	private String name;
	private String surName;
	private int yearOfBirth;

	public String getName()
{return name;}

	public void setName(String name)
{this.name=name;}

	public String getSurName()
{return this.surName;}

	public void setSurName(String surName)
{this.surName=surName;}


	public int getYearOfBirth()
{return this.yearOfBirth;}

	public void setYearOfBirth(int yearOfBirth)
{this.yearOfBirth=yearOfBirth;
	}

	public int age()
		{return (2016-this.yearOfBirth);}

	public String toString()
			{return "i am an employee object named:"+this.getName()+", with surname:"+this.getSurName()+", of age:"+this.age();
			}



}