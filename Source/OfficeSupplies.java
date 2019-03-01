
public class OfficeSupplies extends Item {
	public String releaseDate;
	public String coverTitle;
	/**
	 * @param price		price of item
	 * @param releaseDate	release date of item
	 * @param coverTitle	cover title of item
	 */
	public OfficeSupplies(int price,String releaseDate, String coverTitle){
		super(price);
		this.releaseDate=releaseDate;
		this.coverTitle=coverTitle;
	}
}
