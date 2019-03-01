
/**
 * @author giray
 *
 */
public class Electronic extends Item{
	String manufacturer;
	String brand;
	int maxVoltage;
	int maxPower;
	
	/**
	 * @param price    item price
	 * @param manufacturer		electronic item manufacturer
	 * @param brand				electronic item brand
	 * @param maxVoltage		electronic item voltage
	 * @param maxPower			electronic item watt
	 */
	public Electronic(int price,String manufacturer,String brand,int maxVoltage,int maxPower){
		super(price);
		this.manufacturer=manufacturer;
		this.brand=brand;
		this.maxVoltage=maxVoltage;
		this.maxPower=maxPower;
		
	}

}
