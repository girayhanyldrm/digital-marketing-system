

import java.util.ArrayList;

public class Technician extends Employee{

	
	private boolean senior;
	
	public boolean isSenior() {
		return senior;
	}
	public void setSenior(boolean senior) {
		this.senior = senior;
	}
	public Technician(String name,String email,String dateOfBirth,double salary,int senior){
		super(name,email,dateOfBirth,salary);
		
		if(senior==1) this.senior=true;
		else; this.senior=false;
	}
	
	/**
	 * @param item Call Item array
	 */
	public void showItem(ArrayList<Item> item){
		
		for(Item abc:item){
			System.out.println(abc.toString());
			
			
		}
		
	}
	/**
	 * @param item Call Item array
	 * @param a Bound of Stock
	 */
	
	public void showStock(ArrayList<String> item,int a){
		
		if(item.contains("BOOK") && Book.getStockBook()<=a){
			System.out.println("Book: "+Book.getStockBook());
			}
		if(item.contains("CDDVD") && CdDvd.getStockCdDvd()<=a){
			System.out.println("CDDVD: "+CdDvd.getStockCdDvd());
			}
		if(item.contains("DESKTOP") && Desktop.getStockDesktop()<=a){
			System.out.println("Desktop: "+Desktop.getStockDesktop());
			}
		if(item.contains("LAPTOP") && Laptop.getStockLaptop()<=a){
			System.out.println("Laptop: "+Laptop.getStockLaptop());
			}
		if(item.contains("TABLET") && Tablet.stockTablet<=a){
			System.out.println("Tablet: "+Tablet.stockTablet);
			}
		if(item.contains("TV") && Tv.stockTv<=a){
			System.out.println("TV: "+Tv.stockTv);
			}
		if(item.contains("SMARTPHONE") && SmartPhone.stockSmartPhone<=a){
			System.out.println("Smart Phone: "+SmartPhone.stockSmartPhone);
			}
		if(item.contains("HAIRCARE") && HairCare.getStockHairCare()<=a){
			System.out.println("Hair Care: "+HairCare.getStockHairCare());
			}
		if(item.contains("PERFUME") && Parfume.stockParfume<=a){
			System.out.println("Perfume: "+Parfume.stockParfume);
			}
		if(item.contains("SKINCARE") && SkinCare.stockSkinCare<=a){
			System.out.println("Skin Care: "+SkinCare.stockSkinCare);
			}
	
	
	}
	
	
	public void addItem(String[] params2,ArrayList<Item> item){
		
		if(params2[0].equals("BOOK")){
			item.add(new Book(Integer.valueOf(params2[1]),params2[2],params2[3],params2[4],params2[5],Integer.valueOf(params2[6])));
		}
		if(params2[0].equals("CDDVD")){
			item.add(new CdDvd(Integer.valueOf(params2[1]),params2[2],params2[3],params2[4],(params2[5])));
		}
		if(params2[0].equals("DESKTOP")){
			item.add(new Desktop(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6],params2[7],Integer.valueOf(params2[8]),Integer.valueOf(params2[9]),params2[10]));
		}
		if(params2[0].equals("LAPTOP")){
			item.add(new Laptop(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6],params2[7],Integer.valueOf(params2[8]),Integer.valueOf(params2[9]),Integer.valueOf(params2[10])));
		}
		if(params2[0].equals("TABLET")){
			item.add(new Tablet(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6],params2[7],Integer.valueOf(params2[8]),Integer.valueOf(params2[9]),Integer.valueOf(params2[10])));
		}
		if(params2[0].equals("TV")){
			item.add(new Tv(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),Integer.valueOf(params2[6])));
		}
		if(params2[0].equals("SMARTPHONE")){
			item.add(new SmartPhone(Integer.valueOf(params2[1]),params2[2],params2[3],Integer.valueOf(params2[4]),Integer.valueOf(params2[5]),params2[6]));
		}
		if(params2[0].equals("HAIRCARE")){
			item.add(new HairCare(Integer.valueOf(params2[1]),params2[2],params2[3],params2[5],Integer.valueOf(params2[6]),Integer.valueOf(params2[4]),Integer.valueOf(params2[7])));
		}
		if(params2[0].equals("PERFUME")){
			item.add(new Parfume(Integer.valueOf(params2[1]),params2[2],params2[3],params2[5],Integer.valueOf(params2[6]),Integer.valueOf(params2[4]),params2[7]));
		}
		if(params2[0].equals("SKINCARE")){
			item.add(new SkinCare(Integer.valueOf(params2[1]),params2[2],params2[3],params2[5],Integer.valueOf(params2[6]),Integer.valueOf(params2[4]),Integer.valueOf(params2[7])));
		}
		
		
	}
	
	
	
	
	public void displayItem(ArrayList<String> params2,ArrayList<Item> item){
			
			for(Item abc:item){
				if(params2.contains("BOOK")){
				if(abc instanceof Book){
					System.out.println(abc);
				}
				}
				if(params2.contains("CDDVD")){
					if(abc instanceof CdDvd){
						System.out.println(abc);
					}
				}
				if(params2.contains("DESKTOP")){
					if(abc instanceof Desktop){
						System.out.println(abc);
					}
				}
				if(params2.contains("LAPTOP")){
					if(abc instanceof Laptop){
						System.out.println(abc);
					}
				}
				if(params2.contains("TABLET")){
					if(abc instanceof Tablet){
						System.out.println(abc);
					}
				}
				if(params2.contains("TV")){
					if(abc instanceof Tv){
						System.out.println(abc);
					}
				}
				if(params2.contains("SMARTPHONE")){
					if(abc instanceof SmartPhone){
						System.out.println(abc);
					}
				}
				if(params2.contains("HAIRCARE")){
					if(abc instanceof HairCare){
						System.out.println(abc);
					}
				}
				if(params2.contains("PERFUME")){
					if(abc instanceof Parfume){
						System.out.println(abc);
					}
				}
				if(params2.contains("SKINCARE")){
					if(abc instanceof SkinCare){
						System.out.println(abc);
					}
				}
				
			}
			
		}
	
		
	
	
	public void displayOrder(){
		
		
		
	}
}
