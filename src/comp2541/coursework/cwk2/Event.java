/**
 * The event class
 *
 * @author James Smith
 */

package comp2541.coursework.cwk2;
/**
 * Importing the relevant libraries that are needs
 */
import org.joda.money.*;
import org.joda.time.*;

public class Event
{
	/**
	 * Instance Variables
	 */
	public String artists;
	public String date;
	public String doors;
	public int ticketPrice;
	public int ticketsSold;
	public Venue place;
	
	/**
	 * The Constructor that is needed for the instance variables
	 */
	public Event(Venue Venue,String artists, String date, String doors,
			int ticketPrice, int ticketsSold) {
		this.place = Venue;
		this.artists = artists;
		this.date = date;
		this.doors = doors;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
		
		/**
		 * The validation for each of the instance variables. 
		 * The validation makes sure that an incorrect input cannot be entered for each variable
		 */
		if(artists.length() <= 0){
			throw new IllegalArgumentException("Enter a value for artist");					
		}
		else if(date.length() <= 0){
			throw new IllegalArgumentException("Enter a value for the date");
		}
		else if(doors.length() <= 0){
			throw new IllegalArgumentException("Enter a value for doors opening time");
		}
		else if(ticketPrice < 0){
			throw new IllegalArgumentException("Enter a value for the ticket price");
		}
		else if(ticketsSold < 0){
			throw new IllegalArgumentException("Enter a value for tickets sold");
		}
	}
	
	
	/**
	 * Getters for the variables
	 */
	public String getArtists() {
		return artists;
	}
	public String getDate() {
		return date;
	}
	public String getDoors() {
		return doors;
	}
	public int getticketPrice() {
		return ticketPrice;
	}
	public int getTicketsSold(){
		return ticketsSold;
	}
	
	/**
	 * The addArtist() method
	 * This method add's a new artist to the variable artist
	 */
	//Add artist Method
	public void addArtist(String artists){
		this.artists = this.artists + "," + artists;
	}
	
	/**
	 * The isPast() method
	 * This method checks to see if current date is after the date given
	 * If it is then it will return true
	 * Else it will return false
	 */
	//Method to check if the event has passed
	public boolean isPast(String date,String doors){
		LocalDate datestring = LocalDate.parse(date);
		LocalTime doorsstring = LocalTime.parse(doors);
		
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		if(currentDate.isAfter(datestring) || currentTime.isAfter(doorsstring)){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * The isUpcoming() method
	 * This method checks to see if current date is before the date given
	 * If it is then it will return true
	 * Else it will return false
	 */
	public boolean isUpcoming(String date,String doors){
		LocalDate datestring = LocalDate.parse(date);
		LocalTime doorsstring = LocalTime.parse(doors);
		
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		if(currentDate.isBefore(datestring) || currentTime.isBefore(doorsstring)){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * The isSoldOut() method
	 * This method checks to see if tickets sold is more than the capacity of the venue
	 * If it is then it will return true
	 * Else it will return false
	 */
	public boolean isSoldOut(){
		if(place.getCapacity() == ticketsSold || ticketsSold > place.getCapacity() ){
			return true;
		}
		else{
			return false;
			
			}
		}
	
	/**
	 * The ticketsAvailable() method
	 * This method checks how many tickets are avaible
	 * It does this by taking tickets sold from the capacity
	 */
	public int ticketsAvailable(){
		int available = place.getCapacity() - ticketsSold;
		return available;
		
	}
	
	/**
	 * The sellTickets() method
	 * This method checks to see if the amount of tickets required is more than tickets available
	 * If it is then it will return true
	 * Else it will return false
	 */
	public boolean sellTickets(int ticketsRequired){
		if(ticketsRequired > (place.getCapacity() - ticketsSold)){
			return true;
		}
		return false;
		
	}
	
	/**
	 * The boxOfficeTakings() method
	 * This method multiplies ticket price by the amount of tickets sold
	 * It then returns that value
	 */
	public Money boxOfficeTakings(){
		Money ticket = Money.of(CurrencyUnit.GBP, ticketPrice);
		Money Earnings = ticket.multipliedBy(ticketsSold);
		return Earnings;
	}
	}
		
