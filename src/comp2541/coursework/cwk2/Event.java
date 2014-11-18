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
	private String artists;
	private LocalDate date;
	private LocalTime doors_open;
	private Money price;
	private int tickets_sold;
		
	//Constructor for the variables
		public Event(String artists, LocalDate date, LocalTime doors_open,
				Money price, int tickets_sold) {
			this.artists = artists;
			this.date = date;
			this.doors_open = doors_open;
			this.price = price;
			this.tickets_sold = tickets_sold;
		}

}
