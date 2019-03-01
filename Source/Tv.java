

public class Tv extends Electronic {
	
	
	int screenSize;
	static int stockTv=0;
	
	/**
	 * @param price		price of item	
	 * @param manufacturer		manufacturer of item	
	 * @param brand			brand of item	
	 * @param maxVoltage	voltage of item
	 * @param maxPower		watt of item	
	 * @param screenSize	screen size of item
	 */
	public Tv(int price,String manufacturer,String brand,int maxVoltage,int maxPower,int screenSize){
		super(price,manufacturer,brand,maxVoltage,maxPower);
		this.screenSize=screenSize;
		stockTv+=1;
		itemID2++;
		this.itemID=itemID2;
	}




public String toString(){
		System.out.println("------------------");
		String cons = "Type : TV" + "\nItem ID: "+itemID+"\nPrice: "+price + " $\nManufacturer: "+manufacturer + "\nBrand: "+brand + "\nMaxVolt: " +maxVoltage+" V.\nMaxWatt: "+maxPower+" W.\nScreen Size:"+screenSize+" \"";
		return cons;
	}




}
