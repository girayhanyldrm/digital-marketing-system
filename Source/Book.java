

public class Book extends OfficeSupplies{
	
	private String publisher;
	private String authors;
	private int numofPages;
	private static int stockBook;
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public int getNumofPages() {
		return numofPages;
	}

	public void setNumofPages(int numofPages) {
		this.numofPages = numofPages;
	}


	/**
	 * @return stockBook
	 */
	static int getStockBook() {
		return stockBook;
	}

	/**
	 * @param book stock
	 */
	public void setStockBook(int stockBook) {
		Book.stockBook = stockBook;
	}

	/**
	 * @param price 		item price
	 * @param releaseDate		release date
	 * @param coverTitle		name of book
	 * @param publisher		 who is publishing
	 * @param authors		who is writing
	 * @param numofPages  	number of pages
	 */
	public Book(int price,String releaseDate,String coverTitle,String publisher,String authors,int numofPages){
		super(price,releaseDate,coverTitle);
		this.publisher=publisher;
		this.authors=authors;
		this.numofPages=numofPages;
		itemID2++;
		this.itemID=itemID2;
		stockBook+=1;
	
	}
	
public String toString(){
	 System.out.println("------------------");
	 String cons = "Type : Book" +"\nItem ID: "+itemID+ "\nPrice: "+price+" $" +"\nRelease Date: "+releaseDate+"\nCover Title: "+coverTitle+"\nPublisher: "+publisher+"\nAuthors: "+authors+"\nNum of Pages: "+numofPages;
	 
	 return cons;
		
	}


}