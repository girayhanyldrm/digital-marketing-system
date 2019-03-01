/**
 * 
 * @author giray
 *
 */

public class Person {
	
	private String name;
	private String email;
	private String dateOfBirth;
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * 
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * 
	 * @param name
	 * @param email
	 * @param dateOfBirth
	 */
	public Person(String name,String email,String dateOfBirth){
		this.name=name;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
	}
	public Person(){
		
	}
	
	
	public String toString(){	
		return null;
	}
}
		
