/**
 * The Venue class
 *
 * @author James Smith
 */

package comp2541.coursework.cwk2;

public class Venue{
	
	//Instance variables
	public String name;
	public String address;
	public int phoneNumber;
	public String website;
	public int capacity;

	//Constructor for the variables
	public Venue(String name, String address, int phoneNumber, String website,
			int capacity) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.capacity = capacity;
		
		if(name.length() < 0){
			throw new IllegalArgumentException("Enter a value for name");					
		}
		else if(address.length() < 0){
			throw new IllegalArgumentException("Enter a value for address");
		}
		else if(phoneNumber < 0 || phoneNumber > 11){
			throw new IllegalArgumentException("Enter a value for phone number");
		}
		else if(website.length() < 0){
			throw new IllegalArgumentException("Enter a value for website");
		}
		else if(capacity < 0){
			throw new IllegalArgumentException("Enter a value for capacity");
		}
	}
	
	//Getters for the variables
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public int getCapacity() {
		return capacity;
	}


}
