
public class SmartPhone extends Electronic {
	
	
	String screenType;
	static int stockSmartPhone=0;
	
	/**
	 * @param price 	price of item
	 * @param manufacturer	manufacturer of item
	 * @param brand			brand of item
	 * @param maxVoltage	voltage of item
	 * @param maxPower		watt of item
	 * @param screenType	screen type of item
	 */
	public SmartPhone(int price,String manufacturer,String brand,int maxVoltage,int maxPower,String screenType){
		super(price,manufacturer,brand,maxVoltage,maxPower);
		this.screenType=screenType;
		stockSmartPhone+=1;
		itemID2++;
		this.itemID=itemID2;
		}
	
	
	
	public String toString(){
		System.out.println("------------------");
		String cons = "Type : Smart Phone" +"\nItem ID:"+ itemID+" $\nPrice: "+price + "\nManufacturer: "+manufacturer + "\nBrand: "+brand + "\nMaxVolt: " +maxVoltage+" V.\nMaxWatt: "+maxPower+" W.\nScreenType:"+screenType;
		return cons;
	}
}