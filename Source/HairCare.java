
public class HairCare extends Cosmetic{
	
	
	private String medicated;
	private static int stockHairCare=0;
	
	public String getMedicated() {
		return medicated;
	}


	public void setMedicated(String medicated) {
		this.medicated = medicated;
	}


	public static int getStockHairCare() {
		return stockHairCare;
	}


	public static void setStockHairCare(int stockHairCare) {
		HairCare.stockHairCare = stockHairCare;
	}


	/**
	 * @param price				price of item
	 * @param manufacturer		manufacturer of item
	 * @param brand				brand of item
	 * @param expirationDate	expiration date
	 * @param weight			weight of item
	 * @param organic			organic or not
	 * @param medicated			medicated or not
	 */
	public HairCare(int price,String manufacturer,String brand,String expirationDate,int weight,int organic,int medicated){
		super(price,manufacturer,brand,expirationDate,weight,organic);
		
		
		if(medicated==1)this.medicated="Yes";
		else; this.medicated="No";
		stockHairCare+=1;
		itemID2++;
		this.itemID=itemID2;
		
	}
	

public String toString(){
	System.out.println("------------------");
		String cons = "Type : Hair Care" +"\nItem ID: "+itemID+ "\nPrice: "+price + " $\nManufacturer: "+getManufacturer() + "\nBrand: "+getBrand() + "\nExpiration Date: "+getExpirationDate()+"\nWeight: "+getWeight()+" g.\nOrganic: "+getOrganic()+"\nMedicated: "+medicated;
		return cons;
	}
}
