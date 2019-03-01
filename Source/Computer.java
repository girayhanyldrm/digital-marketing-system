
public class Computer extends Electronic{
	private String os;
	private String cpuType;
	private int ram;
	private int hdd;
	private int stockComputer=0;
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getStockComputer() {
		return stockComputer;
	}

	public void setStockComputer(int stockComputer) {
		this.stockComputer = stockComputer;
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
	 */
	public Computer(int price,String manufacturer,String brand,int maxVoltage,int maxPower,String os,String cpuType,int ram,int hdd){
		super(price,manufacturer,brand,maxVoltage,maxPower);
		this.os=os;
		this.cpuType=cpuType;
		this.ram=ram;
		this.hdd=hdd;
		stockComputer+=1;
	
	}
}