/**
 * The Venue class
 *
 * @author James Smith
 */

package comp2541.coursework.cwk2;

public class Venue{
	
	//Instance variables
	private String name;
	private String address;
	private int phone_number;
	private String website;
	private int capacity;

	//Constructor for the variables
	public Venue(String name, String address, int phone_number, String website,
			int capacity) {
		super();
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.website = website;
		this.capacity = capacity;
		
		if(name.length() < 0){
			throw new IllegalArgumentException("Enter a value for name");					
		}
		else if(address.length() < 0){
			throw new IllegalArgumentException("Enter a value for address");
		}
		else if(phone_number < 0){
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
	
	public int getPhone_number() {
		return phone_number;
	}

	public String getWebsite() {
		return website;
	}

	public int getCapacity() {
		return capacity;
	}


}
