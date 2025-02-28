import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main{
	
	static Map<Integer, Job> allJobs = new HashMap<>();
	static Map<Integer, Employee> allEmployee = new HashMap<>();
	static Map<Integer, ArrayList<Employee>> allApplication = new HashMap<>();
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			System.out.print("\n\n");
			System.out.println("1. Enter the Job Details \n2. Search the job \n3. List the job \n4. Enter the Employee Details \n5. Update the Employee Profile \n6. Delete the Employee Profile \n7. Show the details of a Particular Employee \n8. Apply for a Job \n9. Show the details of the employees who applied for the job \n10. Exit");
			System.out.print("\n\n");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			System.out.println("\n");
			
			switch(choice){
				case 1:
					System.out.print("Enter the job name: ");
					String jobName = sc.nextLine();
					System.out.print("Enter the job description: ");
					String jobDescription = sc.nextLine();
					System.out.print("Enter the job requirements: ");
					String jobRequirements = sc.nextLine();
					System.out.print("Enter the job location: ");
					String jobLocation = sc.nextLine();
					System.out.print("Enter the job salary: ");
					double jobSalary = sc.nextDouble();
					
					Job j = new Job(jobName, jobDescription, jobRequirements, jobLocation, jobSalary);
					allJobs.put(j.getId(), j);
					
					System.out.println("\nJob entered successfully...!!!");
					break;
					
				case 2:
					System.out.print("Search a Job: ");
					String key = sc.nextLine().toLowerCase();
					for(Job i:allJobs.values()){
						if(i.print().toLowerCase().contains(key)){
							System.out.println("------------------------------------------------------------------");
							System.out.println("\n"+ i.print());
							System.out.println("------------------------------------------------------------------");
							System.out.println("\n\n");
						}
					}
					break;
					
				case 3:
					if(allJobs.isEmpty()){
						System.out.println("No jobs available...");
					}
					else{
						System.out.println("List of Jobs:");
						for(Job jj:allJobs.values()){
							System.out.println("------------------------------------------------------------------");
							System.out.println("Job ID: "+ jj.getId());
							System.out.println("Job Name: "+ jj.getName());
							System.out.println("Job Description: "+ jj.getDescription());
							System.out.println("Job Requirements: "+ jj.getRequirements());
							System.out.println("Job Location: "+ jj.getLocation());
							System.out.println("Job Salary: "+ jj.getSalary());
							System.out.println("------------------------------------------------------------------");
							System.out.println("\n\n");
						}
					}
					break;
				case 4:
					System.out.print("Enter the Employee Name: ");
					String empName = sc.nextLine();
					System.out.print("Enter the Employee Age: ");
					String empAge = sc.nextLine();
					System.out.print("Enter the Employee Qualification: ");
					String empQualification = sc.nextLine();
					System.out.print("Enter the Employee Description: ");
					String empDescription = sc.nextLine();
					
					Employee e = new Employee(empName,empAge, empQualification, empDescription);
					allEmployee.put(e.getId(), e);
					
					System.out.println("\nEmployee Details entered successfully...!!!");
					System.out.println("\nYour Employee ID is "+e.getId());
					//for(Employee e1:allEmployee.values())
					//System.out.println(e1);
					
					break;
				case 5:
					System.out.print("Enter the Employee id: ");
					int a=sc.nextInt();
					sc.nextLine();
					
					if(allEmployee.containsKey(a)){
						System.out.print("Enter the Employee Name: ");
						String empName1 = sc.nextLine();
						System.out.print("Enter the Employee Age: ");
						String empAge1 = sc.nextLine();
						System.out.print("Enter the Employee Qualification: ");
						String empQualification1 = sc.nextLine();
						System.out.print("Enter the Employee Description: ");
						String empDescription1 = sc.nextLine();
						
						Employee updateEmployee = allEmployee.get(a);
						
						updateEmployee.setName(empName1);
						updateEmployee.setAge(empAge1);
						updateEmployee.setQualification(empQualification1);
						updateEmployee.setDescription(empDescription1);
						
						System.out.println("\nEmployee Details Updated Successfully..!!!");
					}
					else{
						System.out.println("No Employee found with this ID");
					}
					break;
				case 6:
					System.out.print("Enter the Employee id to remove: ");
					int b=sc.nextInt();
					sc.nextLine();
					
					if(allEmployee.containsKey(b)){
						allEmployee.remove(b);
						System.out.println("Employee details with ID "+ b +" has been deleted");
					}
					else{
						System.out.println("No Employee found with this ID");
					}
					break;
				case 7:
					System.out.print("Enter the Employee id: ");
					int c=sc.nextInt();
					
					if(allEmployee.containsKey(c)){
						System.out.println(allEmployee.get(c));
					}
					else{
						System.out.println("No Employee found with this id");
					}
					break;
				case 8:
					System.out.print("Enter the Job id: ");
					int jid=sc.nextInt();
					
					if(allJobs.containsKey(jid)){
						System.out.print("Enter the Employee id: ");
						int eid=sc.nextInt();
						
						if(!allApplication.containsKey(jid)){
							allApplication.put(jid, new ArrayList<>());
						}
						if(allEmployee.containsKey(eid)){
							allApplication.get(jid).add(allEmployee.get(eid));
							System.out.println("Successfully applied for the job with id "+ jid);
						}
						else{
							System.out.println("No Employee found with this id");
						}
					}
					else{
						System.out.println("No job found with this job id");
					}
					break;
				case 9:
					System.out.print("Enter the Job Id to show the employee details who applied for that job: ");
					int jid1 = sc.nextInt();
					
					if(allApplication.containsKey(jid1)){
						List<Employee> l=allApplication.get(jid1);
						
						for(Employee k:l){
							System.out.println(k);
						}
					}
					else{
						System.out.println("No Employees applied for this job");
					}
					break;
				case 10:
					System.out.println("Thanks for using this application!");
					System.exit(0);
				
				default:
					break;
			}
			
		}while(choice<=10);
	}
}