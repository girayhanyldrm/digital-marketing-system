

/**
 * @author giray
 *
 */
public class Campaign {

	
	private String endDate;
	private String startDate;
	private String itemType;
	private int rate;
	
	
	/**
	 * @return end of date
	 */
	public String getEndDate() {
		return endDate;
	}



	/**
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	/**
	 * @return start of date
	 */
	public String getStartDate() {
		return startDate;
	}



	/**
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return itemType
	 */
	public String getItemType() {
		return itemType;
	}



	/**
	 * @param item of type
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}



	/**
	 * @return rate
	 */
	public int getRate() {
		return rate;
	}



	/**
	 * @param rate
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}



	/**
	 * @param endDate
	 * @param startDrate
	 * @param itemType
	 * @param rate
	 */
	public Campaign(String endDate, String startDate, String itemType, int rate) {
		this.endDate = endDate;
		this.startDate = startDate;
		this.itemType = itemType;
		this.rate = rate;
	}

	

	public String toString(){
		
		String cons=rate+ "% sale of "+itemType+" until "+endDate;
		return cons;
		
	}











}
