
import java.util.ArrayList;

public class Employee extends Person{

	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name,String email,String dateOfBirth,double salary){
		super(name,email,dateOfBirth);
		this.salary=salary;
		
	}
	public Employee(){

	}
	
	/**
	 * 
	 * @param item Call Item Array
	 * @param a  Bound of stock
	 */
	public void showStock(ArrayList<String> item,int a){
		
		if(item.contains("BOOK") && Book.getStockBook()<=a){
			System.out.println("Book: "+Book.getStockBook());
			}
		if(item.contains("CDDVD") && CdDvd.getStockCdDvd()<=a){
			System.out.println("CDDVD: "+CdDvd.getStockCdDvd());
			}
		if(item.contains("DESKTOP") && Desktop.getStockDesktop()<=a){
			System.out.println("Desktop: "+Desktop.getStockDesktop());
			}
		if(item.contains("LAPTOP") && Laptop.getStockLaptop()<=a){
			System.out.println("Laptop: "+Laptop.getStockLaptop());
			}
		if(item.contains("TABLET") && Tablet.stockTablet<=a){
			System.out.println("Tablet: "+Tablet.stockTablet);
			}
		if(item.contains("TV") && Tv.stockTv<=a){
			System.out.println("TV: "+Tv.stockTv);
			}
		if(item.contains("SMARTPHONE") && SmartPhone.stockSmartPhone<=a){
			System.out.println("Smart Phone: "+SmartPhone.stockSmartPhone);
			}
		if(item.contains("HAIRCARE") && HairCare.getStockHairCare()<=a){
			System.out.println("Hair Care: "+HairCare.getStockHairCare());
			}
		if(item.contains("PERFUME") && Parfume.stockParfume<=a){
			System.out.println("Perfume: "+Parfume.stockParfume);
			}
		if(item.contains("SKINCARE") && SkinCare.stockSkinCare<=a){
			System.out.println("Skin Care: "+SkinCare.stockSkinCare);
			}
	
	
	}
	/**
	 * 
	 * @param item Call Item array
	 */
	public void showItem(ArrayList<Item> item){
		
		for(Item abc: item){
			
			System.out.println(abc.toString());
			
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public void displayVIP(){
		
		
	}
}
