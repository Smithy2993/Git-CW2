/**
 * The event class
 *
 * @author James Smith
 */

package comp2541.coursework.cwk2;

import org.joda.money.*;
import org.joda.time.*;

public class Event
{
	//Instance Variables
	public String artists;
	public String date;
	public String doors;
	public int ticketPrice;
	public int ticketsSold;
	public Venue capacity;
	
	//Constructor for the variables
	public Event(String artists, String date, String doors,
			int ticketPrice, int ticketsSold) {
		this.artists = artists;
		this.date = date;
		this.doors = doors;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
		
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

	 //Getters for the variables
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
	
	//Add artist Method
	public String addArtist(String artists){
		return artists;
	}
	
	//Method to check if the event has passed
	public boolean isPast(String date, String doors){
		LocalDate datestring = LocalDate.parse(date);
		LocalTime doorsstring = LocalTime.parse(doors);
		
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		if(currentDate.isBefore(datestring)){
			return true;
		}
		else if(currentTime.isBefore(doorsstring)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	//Method to check if the event is upcoming
	public boolean isUpcoming(String date,String doors){
		LocalDate datestring = LocalDate.parse(date);
		LocalTime doorsstring = LocalTime.parse(doors);
		
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		if(currentDate.isAfter(datestring)){
			return true;
		}
		else if(currentTime.isAfter(doorsstring)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Are  sold out method
	public boolean isSoldOut(int ticketsSold, int capacity){
		if(capacity - ticketsSold < 0 ){
			return true;
		}
		else{
			return false;
			
			}
		}
	
	//Method to check if there are tickets avaliable
	public int ticketsAvailable(int ticketsSold, int capacity){
		int available = capacity - ticketsSold;
		return available;
		
	}
	
	//Method to sell tickets
	public boolean sellTickets(int ticketsRequired, int ticketsSold, int capacity){
		if(ticketsRequired > (capacity - ticketsSold)){
			return true;
		}
		return false;
		
	}
	//Method to calculate how much was earned
	public Money boxOfficeTakings(int ticketPrice, int ticketsSold){
		Money ticket = Money.of(CurrencyUnit.GBP, ticketPrice);
		Money Earnings = ticket.multipliedBy(ticketsSold);
		return Earnings;
	}
	}
		
