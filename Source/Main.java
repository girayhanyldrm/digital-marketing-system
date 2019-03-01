

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 

public class Main {
	static ArrayList<Person> person=new ArrayList<Person>();
	static ArrayList<Item> item=new ArrayList<Item>();
	static ArrayList<Campaign> campaign=new ArrayList<Campaign>();
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Person> customer=new ArrayList<Person>();
		ArrayList<Person> admin=new ArrayList<Person>();
		ArrayList<Person> tech=new ArrayList<Person>();
		ArrayList<String> adminName=new ArrayList<String>();
		ArrayList<String> adminMail=new ArrayList<String>();
		ArrayList<String> adminDate=new ArrayList<String>();
		ArrayList<String> customerName=new ArrayList<String>();
		ArrayList<String> customerMail=new ArrayList<String>();
		ArrayList<String> customerDate=new ArrayList<String>();
		ArrayList<String> customerBalance=new ArrayList<String>();
		ArrayList<String> customerPass=new ArrayList<String>();
		ArrayList<String> techName=new ArrayList<String>();
		ArrayList<String> itemName=new ArrayList<String>();
		
		Scanner scannerUser = new Scanner(new File(args[0]));	
			String data;
			while(scannerUser.hasNextLine()){
				data=scannerUser.nextLine();
				String[] params=data.split("	");
				switch(params[0]){
				
				case "ADMIN":
					Admin something=new Admin(params[1],params[2],params[3],Double.parseDouble(params[4]),params[5]);
					adminName.add(params[1]);
					adminMail.add(params[2]);
					adminDate.add(params[3]);
					admin.add(something);
					person.add(something);
					break;
				case "TECH":
					Person something2=new Technician(params[1],params[2],params[3],Double.parseDouble(params[4]),Integer.valueOf(params[5]));
					techName.add(params[1]);
					tech.add(something2);
					
					
					person.add(something2);
					break;
				case "CUSTOMER":
					Person something3=new Customer(params[1],params[2],params[3],Double.parseDouble(params[4]),params[5]);
					
					
					customerName.add(params[1]);
					customerMail.add(params[2]);
					customerDate.add(params[3]);
					customerBalance.add(params[4]);
					customerPass.add(params[5]);
					customer.add(something3);
					person.add(something3);
					break;
					}
				}
			
			scannerUser.close();
			
			Scanner scannerItem = new Scanner(new File(args[1]));
			String data2;
			while(scannerItem.hasNextLine()){
				data2=scannerItem.nextLine();
				String[] params2=data2.split("\t");
				switch(params2[0]){
				
				case "BOOK":
					item.add(new Book(Integer.valueOf(params2[1]),params2[2],params2[3],params2[4],params2[5],Integer.valueOf(params2[6])));
					itemName.add(params2[0]);
					
					break;
				case "CDDVD":
					Item something2=new CdDvd(Integer.valueOf(params2[1]),params2[2],params2[3],params2[4],(params2[5]));itemName.add(params2[0]);
					item.add(something2);
					break;
				case "DESKTOP":
					Item something3=new Desktop(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6],params2[7],Integer.valueOf(params2[8]),Integer.valueOf(params2[9]),params2[10]);itemName.add(params2[0]);
					item.add(something3);
					break;
				case "LAPTOP":
					Item something4=new Laptop(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6],params2[7],Integer.valueOf(params2[8]),Integer.valueOf(params2[9]),Integer.valueOf(params2[10]));itemName.add(params2[0]);
					item.add(something4);
					break;
				case "TABLET":
					Item something5=new Tablet(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6],params2[7],Integer.valueOf(params2[8]),Integer.valueOf(params2[9]),Integer.valueOf(params2[10]));itemName.add(params2[0]);
					item.add(something5);
					break;
				case "TV":
					Item something6=new Tv(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),Integer.valueOf(params2[6]));itemName.add(params2[0]);
					item.add(something6);
					break;
				case "SMARTPHONE":
					Item something7=new SmartPhone(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6]);itemName.add(params2[0]);
					item.add(something7);
					break;
				case "HAIRCARE":
					Item something8=new HairCare(Integer.valueOf(params2[1]),params2[2],params2[3],params2[5],Integer.valueOf(params2[6]),Integer.valueOf(params2[4]),Integer.valueOf(params2[7]));itemName.add(params2[0]);
					item.add(something8);
					break;
				case "PERFUME":
					Item something9=new Parfume(Integer.valueOf(params2[1]),params2[2],params2[3],params2[5],Integer.valueOf(params2[6]),Integer.valueOf(params2[4]),params2[7]);itemName.add(params2[0]);
					item.add(something9);
					break;
				case "SKINCARE":
					Item something10=new SkinCare(Integer.valueOf(params2[1]),params2[2],params2[3],params2[5],Integer.valueOf(params2[6]),Integer.valueOf(params2[4]),Integer.valueOf(params2[7]));
					item.add(something10); break;
					
				}
			}
			Employee emp=new Employee();

			
			Set<String> itemNameSet=new HashSet<>();
			itemNameSet.addAll(itemName);
			itemName.clear();
			itemName.addAll(itemNameSet);
		
			
			scannerItem.close();
			Scanner scannerCommand = new Scanner(new File(args[2]));
			String data3;
			while(scannerCommand.hasNextLine()){
				data3=scannerCommand.nextLine();
				String[] params3=data3.split("\t");
				
				switch(params3[0]){
				
					case "ADDCUSTOMER":
						Admin cust=adminname(params3[1]);
						if(cust==null){
							System.out.println("No admin person named "+params3[1]+" exists!");System.out.println("");
						}
						else{
							cust.addCustomer(params3[2], params3[3], params3[4],Double.parseDouble(params3[5]), params3[6],person);
						}
						break;
				
					case "ADDADMIN":
					Admin admin2=adminname(params3[1]);
					if(admin2==null){
						System.out.println("No admin person named "+params3[1]+" exists!");System.out.println("");
					}
					else{
						admin2.addAdmin(params3[2], params3[3], params3[4],Integer.valueOf(params3[5]), params3[6],person);
					}
					break;
				
				
				
					case "SHOWCUSTOMER":
					Admin admin3=adminname(params3[1]);
					if(admin3==null){
						System.out.println("No admin person named "+params3[1]+" exists!");System.out.println("");
					}
					else {
						
						admin3.showCustomer(person,Integer.valueOf(params3[2]));
					}																						 
					
					
					break;
					case "SHOWCUSTOMERS":
					Admin admin8=adminname(params3[1]);
					if(admin8==null){
						System.out.println("No admin person named "+params3[1]+" exists!");System.out.println("");
					}
					else{
						
						admin8.showCustomers(person);
							
					}
					
					break;
					
				case "SHOWADMININFO":
				Admin admin23=adminname(params3[1]);
				if(admin23==null){
					System.out.println("No admin person named "+params3[1]+" exists!");System.out.println("");
				}
				else {
					
					admin23.adminGetInfo(person,params3[1]);
				}
				break;
			
				case "ADDTECH":
				Admin tech2=adminname(params3[1]);
				if(tech2==null){
					System.out.println("No technician person named "+params3[1]+" exists!");System.out.println("");
				}
				else{
					tech2.addTech(params3[2], params3[3], params3[4],Double.parseDouble(params3[5]), Integer.valueOf(params3[6]),person);
				}
				break;
			
					case "CHPASS":
					Customer customer2 = customerBulIDden(Integer.parseInt(params3[1]));
					if(customer2== null){
						System.out.println("No customer with ID number"+ params3[1]+ "exists!");
					}
					else{
						customer2.changePassword(params3[2], params3[3]);
					}
			
					case "LISTITEM":
				
					Admin admin4=adminname(params3[1]);
					Technician tech4=techname(params3[1]);
					if(admin4==null ){
						if(tech4==null){
						System.out.println("No admin or technician person named "+params3[1]+" exists!");System.out.println("");
						}
						else{
							emp.showItem(item);
						}
						}
					else{
						emp.showItem(item);
					}
					break;
					
					
					case "SHOWITEMSLOWONSTOCK":
					Admin admin5=adminname(params3[1]);
					Technician tech5=techname(params3[1]);
				
					if(admin5==null ){
						if(tech5==null){
						System.out.println("No admin or technician person named "+params3[1]+" exists!");System.out.println("");
						}
						else{
							emp.showStock(itemName,Integer.valueOf(params3[2]));
						}
						}
					else{
						emp.showStock(itemName,Integer.valueOf(params3[2]));

					}
					break;
					case "CREATECAMPAIGN":
					Admin admin6=adminname(params3[1]);
					if(admin6==null ){
						System.out.println("No admin person named "+params3[1]+" exists!");System.out.println("");
					}
					else if(Integer.valueOf(params3[5])>=50){
						System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.");
					}
					
					else{
						
						campaign.add(admin6.launchCamp(params3[3], params3[2], params3[4], Integer.valueOf(params3[5])));
					}
					break;
					
					case "SHOWCAMPAIGNS":
					
					Customer cust12 = customerBulIDden(Integer.valueOf((params3[1])));
					if(cust12== null){
						System.out.println("No customer with ID number"+ params3[1]+ "exists!");
					}
					else {
						cust12.showCampaign(campaign);
					}

					break;
					
					case "ADDITEM":
					Technician tech7=techname(params3[1]);
					if(tech7==null){
						System.out.println("No technician person named "+params3[1] +" exists!");
					}
					else{
						String [] eleman=params3[2].split(":");
						if(itemNameSet.contains(eleman[0])){
							
							tech7.addItem(eleman,item);
						}
						else{
							System.out.println("No item type "+eleman[0]+" found");
						}
					}
				
				case "DISPITEMSOF":
					Technician tech8=techname(params3[1]);
					if(tech8==null){
						System.out.println("No technician person named "+params3[1] +" exists!");
					}
					else{
						String [] eleman=params3[2].split(":");
						ArrayList<String> elem=new ArrayList<String>();
						int i;
						for(i=0;i<eleman.length;i++){
							elem.add(eleman[i]);
						}
						tech8.displayItem(elem,item);
					}
					break;
				case "ADDTOCART":
					Customer cust5=customerBulIDden(Integer.parseInt(params3[1]));
					if(cust5== null){
						System.out.println("No customer with ID number"+ params3[1]+ "exists!");
					}
					else if(Integer.valueOf(params3[2])>item.size()){
						System.out.println("Invalid item ID");
					}
				break;
				
				
				
				
				
				}
					
			
				}
			scannerCommand.close();
	}
	
	
			
			
	public static Customer customerBulIDden(int ID){
		for(int i = 0;i<person.size();i++){								
			if(person.get(i) instanceof Customer){
				Customer customer = (Customer)person.get(i);
				if(customer.getCostumerID()==ID){
					return customer;
				}
		} 
		
	}
		return null;
	}

	public static Technician techname(String name){
		for(int i = 0;i<person.size();i++){
			if(person.get(i) instanceof Technician){
				Technician tech = (Technician)person.get(i);
				if(tech.getName().equals(name)){
					return tech;
				}
				} 
		}
		return null;
}


	public static Admin adminname(String name){
	for(int i = 0;i<person.size();i++){
		if(person.get(i) instanceof Admin){
			Admin admin = (Admin)person.get(i);
			if(admin.getName().equals(name)){
				return admin;
			}
			} 
	}
	return null;
}
	public static Customer custname(String name){
		for(int i = 0;i<person.size();i++){
			if(person.get(i) instanceof Admin){
				Customer cust = (Customer)person.get(i);
				if(cust.getName().equals(name)){
					return cust;
				}
				} 
		}
		return null;
	}
	

}


	
	
	
	


