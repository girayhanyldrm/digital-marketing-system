

import java.util.ArrayList;

public class Admin extends Employee{

	private String password;
	/**
	 * 
	 * @param name
	 * @param email
	 * @param dateOfBirth
	 * @param salary
	 * @param password
	 */
	public Admin(String name,String email,String dateOfBirth,double salary,String password){
		super(name,email,dateOfBirth,salary);
		this.password=password;
	}
	
	
	public void addCustomer(String name, String email,String dateOfBirth,double balance,String password, ArrayList<Person> person){
		Person p=new Customer(name,email,dateOfBirth,balance,password);
		person.add(p);
		
	}
	
	public void addAdmin(String name, String email,String dateOfBirth,int salary,String password,ArrayList<Person> person){
		Person p=new Admin(name,email,dateOfBirth,salary,password);
		person.add(p);
	}
	
	public void addTech(String name, String email,String dateOfBirth,double salary,int senior, ArrayList<Person> person){
		
		Person p=new Technician(name,email,dateOfBirth,salary,senior);
		person.add(p);
	}
	public void showCustomer(ArrayList<Person> person,int ID){
				for(int i = 0;i<person.size();i++){
					if(person.get(i) instanceof Customer){
						Customer customer = (Customer)person.get(i);
						if(customer.getCostumerID() ==ID){
							
								System.out.println(customer);
							
							
						}
					}
								
			}
		
	}
	public void showCustomers(ArrayList<Person> person){
		for(Person abc: person){
			if(abc instanceof Customer){
			System.out.println(abc.toString());
			}
			
		}
	}

	public void adminGetInfo(ArrayList<Person> person,String name){
	for(int i = 0;i<person.size();i++){
		if(person.get(i) instanceof Admin){
			Admin admin = (Admin)person.get(i);
			if(admin.getName().equals(name)){
			System.out.println("------------Admin Info-------------");
			System.out.println("Admin Name: "+admin.getName());
			System.out.println("Admin E-mail: "+admin.getEmail());
			System.out.println("Admin date of birth: "+admin.getDateOfBirth());
			}
		}
	}
	}

	/**
	 * 
	 * @param endDate    Campaign finished date
	 * @param startDate		Campaign start date
	 * @param itemType		Which item class
	 * @param rate			Percent of sale
	 * @return  Necessary object
	 */
	public Campaign launchCamp(String endDate, String startDate, String itemType, int rate){
		
		Campaign camp=new Campaign(endDate,startDate,itemType,rate);
		
		return camp; 
	}
	
	
}