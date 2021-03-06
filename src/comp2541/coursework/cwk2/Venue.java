/**
 * The Venue class
 *
 * @author James Smith
 */

package comp2541.coursework.cwk2;

public class Venue{
	
	/**
	 * Instance Variables
	 */
	public String name;
	public String address;
	public String phoneNumber;
	public String website;
	public int capacity;

	/**
	 * The Constructor that is needed for the instance variables
	 */
	public Venue(String name, String address, String phoneNumber, String website,
			int capacity) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.capacity = capacity;
		
		/**
		 * The validation for each of the instance variables. 
		 * The validation makes sure that an incorrect input cannot be entered for each variable
		 */
		if(name.length() <= 0){
			throw new IllegalArgumentException("Enter a value for name");					
		}
		else if(address.length() <= 0){
			throw new IllegalArgumentException("Enter a value for address");
		}
		else if(phoneNumber.length() != 11 || phoneNumber.length() < 0){
			throw new IllegalArgumentException("Enter a value for phone number");
		}
		else if(website.length() <= 0){
			throw new IllegalArgumentException("Enter a value for website");
		}
		else if(capacity <= 0){
			throw new IllegalArgumentException("Enter a value for capacity");
		}
	}
	
	/**
	 * Getters for the variables
	 */
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public int getCapacity() {
		return capacity;
	}


}
