
public class Laptop extends Computer {
	
	
	private static int stockLaptop=0;
	private String hdmiSupport;
	
	
	
	public static int getStockLaptop() {
		return stockLaptop;
	}


	public static void setStockLaptop(int stockLaptop) {
		Laptop.stockLaptop = stockLaptop;
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
	 
	 * @param hdmiSupport		HDMI Support or not
	 */
	public Laptop(int price,String manufacturer,String brand,int maxVoltage,int maxPower,String os,String cpuType,int ram,int hdd,int hdmiSupport){
		
		super(price,manufacturer,brand,maxVoltage,maxPower,os,cpuType,ram,hdd);
		
		if(hdmiSupport==1) this.hdmiSupport="Yes";
		else; this.hdmiSupport="No";
		setStockLaptop(getStockLaptop() + 1);
		itemID2++;
		this.itemID=itemID2;
	}


public String toString(){
		System.out.println("------------------");
		String cons = "Type : Laptop" +"\nItem ID: "+itemID+ "\nPrice: "+price + " $\nManufacturer: "+manufacturer + "\nBrand: "+brand + "\nMaxVolt: " +maxVoltage+" V.\nMaxWatt: "+maxPower +"W. \nOperating System: "+getOs()+"\nCPU Type: "+getCpuType()+"\nRAM: "+getRam()+" GB.\nHDD: "+getHdd() +" GB.\nHDMI Support: "+hdmiSupport;
		return cons;
	}


}