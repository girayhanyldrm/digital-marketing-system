
public class Tablet extends Computer {
	
	static int stockTablet=0;
	int dimensions;
	
	
	public Tablet(int price,String manufacturer,String brand,int maxVoltage,int maxPower,String os,String cpuType,int ram,int hdd,int dimensions){
		super(price,manufacturer,brand,maxVoltage,maxPower,os,cpuType,ram,hdd);
		this.dimensions=dimensions;
		stockTablet+=1;
		itemID2++;
		this.itemID=itemID2;
}


	public String toString(){
		System.out.println("------------------");
		String cons = "Type : Tablet" +"\nItem ID: "+itemID+ "\nPrice: "+price + "\nManufacturer: "+manufacturer + "\nBrand: "+brand + "\nMaxVolt: " +maxVoltage+"\nMaxWatt: "+maxPower +"\nOperating System: "+getOs()+"\nCPU Type: "+getCpuType()+"\nRAM: "+getRam()+"\nHDD: "+getHdd() +"\nScreenType:"+dimensions;
		return cons;
	}


}