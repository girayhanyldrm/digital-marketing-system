
public class SkinCare extends Cosmetic{
	
	String babySensitive;

	static int stockSkinCare=0;
	/**
	 * @param price				price of item	
	 * @param manufacturer		manufacturer of item	
	 * @param brand				brand of item
	 * @param expirationDate	expiration date
	 * @param weight			weight of item	
	 * @param organic			organic or not
	 * @param babySensitive		baby sensitive or not
	 */
	public SkinCare(int price,String manufacturer,String brand,String expirationDate,int weight,int organic,int babySensitive){
		super(price,manufacturer,brand,expirationDate,weight,organic);
		if(babySensitive==1)this.babySensitive="Yes";
		else; this.babySensitive="No";
		stockSkinCare+=1;
		
		itemID2++;
		this.itemID=itemID2;
}





public String toString(){
	System.out.println("------------------");
		String cons = "Type : Skin Care" +"\nItem ID: "+itemID+ "\nPrice: "+price + " $\nManufacturer: "+getManufacturer() + "\nBrand: "+getBrand() +"\nOrganic: "+getOrganic()+ "\nExpiration Date: "+getExpirationDate()+"\nWeight: "+getWeight()+" g.\nBaby Sensitive: "+babySensitive;
		return cons;
	}

}