
public class Parfume extends Cosmetic{
	
	
	String lastingDuration;
	
	static int stockParfume=0;
	/**
	 * @param price				price of item	
	 * @param manufacturer		manufacturer of item	
	 * @param brand				brand of item
	 * @param expirationDate	expiration date
	 * @param weight			weight of item	
	 * @param organic			organic or not
	 * @param lastingDuration   lasting duration of item
	 */
	public Parfume(int price,String manufacturer,String brand,String expirationDate,int weight,int organic,String lastingDuration){
		super(price,manufacturer,brand,expirationDate,weight,organic);
		this.lastingDuration=lastingDuration;
		stockParfume+=1;
		itemID2++;
		this.itemID=itemID2;
}

	public String toString(){
		System.out.println("------------------");
		String cons = "Type : Perfume"  +"\nItem ID: "+itemID+ "\nPrice: "+price + " $\nManufacturer: "+getManufacturer() + "\nBrand: "+getBrand() + "\nExpiration Date: "+getExpirationDate()+"\nWeight: "+getWeight()+" g.\nOrganic: "+getOrganic()+"\nLasting Duration: "+lastingDuration;
		return cons;
	}



}
