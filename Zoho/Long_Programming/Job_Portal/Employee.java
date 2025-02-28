public class Employee{
	static int count=0;
	private int id;
	private String name;
	private String age;
	private String qualification;
	private String description;
	
	Employee(String name, String age, String qualification, String description){
		id=++count;
		this.name=name;
		this.age=age;
		this.qualification=qualification;
		this.description=description;
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
		
	public String getAge(){
		return age;
	}
	
	public void setAge(String age){
		this.age=age;
	}
		
	public String getQualification(){
		return qualification;
	}
	
	public void setQualification(String qualification){
		this.qualification=qualification;
	}
		
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public String toString(){
		return "Employee Id: " + id + "\n" +
			   "Employee Name: " + name + "\n" +		
			   "Employee Age: " + age + "\n" +		
			   "Employee Qualification: " + qualification + "\n" +		
			   "Employee Description: " + description + "\n";	
	}
	
}