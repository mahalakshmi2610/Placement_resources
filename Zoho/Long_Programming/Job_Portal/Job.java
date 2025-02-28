public class Job{
	static int count = 0;
	private int id;
	private String name;
	private String description;
	private String requirements;
	private String location;
	private double salary;
	
	Job(String name, String description, String requirements, String location, double salary){
		id = ++count;
		this.name = name;
		this.description = description;
		this.requirements = requirements;
		this.location = location;
		this.salary = salary;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public String getRequirements(){
		return requirements;
	}
	
	public void setRequirements(String requirements){
		this.requirements=requirements;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setLocation(String location){
		this.location=location;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	public String print(){
		return "Job Id: " + id + "\n" +
			   "Job Name: " + name + "\n" +		
			   "Job Description: " + description + "\n" +		
			   "Job Requirements: " + requirements + "\n" +		
			   "Job Location: " + location + "\n" +		
			   "Job Salary: " + salary + "\n";	
	}	
}