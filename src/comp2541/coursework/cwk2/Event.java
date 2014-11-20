/**
 * The event class
 *
 * @author James Smith
 */

package comp2541.coursework.cwk2;

import java.util.*;
import org.joda.money.*;
import org.joda.time.*;

public class Event
{
	//Instance Variables
	public String artists;
	public LocalDate date;
	public LocalTime doors;
	public Money ticketPrice;
	public int ticketsSold;
		
	//Constructor for the variables
	public Event(String artists, LocalDate date, LocalTime doors,
			Money ticketPrice, int ticketsSold) {
		this.artists = artists;
		this.date = date;
		this.doors = doors;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
		
		if(artists.length() < 0){
			throw new IllegalArgumentException("Enter a value for artist");					
		}
		else if(date == null){
			throw new IllegalArgumentException("Enter a value for the date");
		}
		else if(doors == null){
			throw new IllegalArgumentException("Enter a value for doors opening time");
		}
		else if(ticketPrice == null){
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
	public LocalDate getDate() {
		return date;
	}
	public LocalTime getDoors() {
		return doors;
	}
	public Money getticketPrice() {
		return ticketPrice;
	}
	public int getTicketsSold(){
		return ticketsSold;
	}
	
	//Add artist Method
	public void addArtist(String artists){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter an artist: ");
		artists = scan1.nextLine();
		scan1.close();
	}
	
	//Method to check if the event has passed
	public boolean isPast(){
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		if(currentDate.isAfter(date)){
			return true;
		}
		else if(currentTime.isAfter(doors)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	//Method to check if the event is upcoming
	public boolean isUpcoming(){
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		if(currentDate.isBefore(date)){
			return true;
		}
		else if(currentTime.isAfter(doors)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Are  sold out method
	public boolean isSoldOut(int ticketsSold, int capacity){
		capacity = Venue.getCapacity();
		if(capacity - ticketsSold < 0 ){
			return true;
		}
		else{
			return false;
			
			}
		}
	
	//Method to check if there are tickets avaliable
	public void ticketsAvaliable(int ticketsSold, int capacity){
		
	}
	
	//Method to sell tickets
	public void sellTickets(){
		
	}
	//Method to calculate how much was earned
	public Money boxOfficeTakings(Money ticketPrice, int ticketsSold){
		Money Earnings = this.ticketPrice.multipliedBy(this.ticketsSold);
		return Earnings;
	}
	}
		
