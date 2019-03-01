

public class Desktop extends Computer{
	
	private String boxColor;
	private static int stockDesktop=0;
	
	public String getBoxColor() {
		return boxColor;
	}



	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}



	public static int getStockDesktop() {
		return stockDesktop;
	}



	public static void setStockDesktop(int stockDesktop) {
		Desktop.stockDesktop = stockDesktop;
	}



	
	/**
	 * @param price				price of item
	 * @param manufacturer		manufacturer of item
	 * @param brand				brand of item
	 * @param maxVoltage		voltage of item
	 * @param maxPower 			watt of item
	 * @param os 				operating system
	 * @param cpuType  			type of CPU
	 * @param ram				ram capacitiy
	 * @param hdd				harddisk capacity
	 * @param boxColor			color of box
	 */
	public Desktop(int price,String manufacturer,String brand,int maxVoltage,int maxPower,String os,String cpuType,int ram,int hdd,String boxColor){
		super(price,manufacturer,brand,maxVoltage,maxPower,os,cpuType,ram,hdd);
		this.boxColor=boxColor;
		stockDesktop+=1;
		itemID2++;
		this.itemID=itemID2;
	}
	
	
	
	public String toString(){
		System.out.println("------------------");
		String cons = "Type : Desktop" +"\nItem ID: "+itemID+ "\nPrice: "+price+" $"+ "\nManufacturer: "+manufacturer + "\nBrand: "+brand + "\nMaxVolt: " +maxVoltage+" V.\nMaxWatt: "+maxPower +" W. \nOperating System: "+getOs()+"\nCPU Type: "+getCpuType()+"\nRAM: "+getRam()+" GB.\nHDD: "+getHdd() +" GB.\nBox Color: "+boxColor;
		return cons;
	}
}