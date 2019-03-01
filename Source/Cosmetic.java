

public class Cosmetic extends Item{
	
	private String manufacturer;
	private String brand;
	private String expirationDate;
	private int weight;
	private String organic;
	
	/** 
	 * @return manufacturer of item
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getOrganic() {
		return organic;
	}

	public void setOrganic(String organic) {
		this.organic = organic;
	}

	/**
	 * @param price				price of item	
	 * @param manufacturer		manufacturer of item	
	 * @param brand				brand of item
	 * @param expirationDate	expiration date
	 * @param weight			weight of item	
	 * @param organic			organic or not
	 */
	public Cosmetic(int price,String manufacturer,String brand,String expirationDate,int weight,int organic){
		super(price);
		this.manufacturer=manufacturer;
		this.brand=brand;
		this.expirationDate=expirationDate;
		this.weight=weight;
		if(organic==1) this.organic="Yes";
		else; this.organic="Yes";
		
	}
}
