

/**
 * @author giray
 *
 */
public class CdDvd extends OfficeSupplies{
	
	
	private String composer;
	private String songs;
	private static int stockCdDvd=0;
	
	
	/**
	 * @return composer
	 */
	public String getComposer() {
		return composer;
	}


	/**
	 * @param composer
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}


	/**
	 * @return music name
	 */
	public String getSongs() {
		return songs;
	}


	/**
	 * @param songs
	 */
	public void setSongs(String songs) {
		this.songs = songs;
	}


	public static int getStockCdDvd() {
		return stockCdDvd;
	}


	public static void setStockCdDvd(int stockCdDvd) {
		CdDvd.stockCdDvd = stockCdDvd;
	}


	public CdDvd(int price,String releaseDate,String coverTitle,String composer,String songs){
		super(price,releaseDate,coverTitle);
		this.composer=composer;
		this.songs=songs;
		stockCdDvd+=1;
		itemID2++;
		this.itemID=itemID2;			
	}
	

public String toString(){
	System.out.println("------------------");
		String cons = "Type : CDDVD" +"\nItem ID: "+itemID  + "\nPrice: "+price +" $"+"\nRelease Date: "+releaseDate+"\nCover Title: "+coverTitle+"\nComposer: "+composer+"\nSongs: "+songs;
		return cons;
	}
	
	
}