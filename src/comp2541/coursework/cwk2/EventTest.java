package comp2541.coursework.cwk2;

import org.joda.money.Money;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest
{
	
	public static void main(String[] args){
		Venue venue1 = new Venue("O2 Academy","Leeds","07584937289","www.o2academy.co.uk",28000);
		Venue venue2 = new Venue("Antwerp Mansion","Manchester","07482038751","www.google.co.uk",40000);
		
		Event event1 = new Event(venue1,"Eminem, Gramatik, Gentlemans Dub Club","12-05-2012","19:00:00",30,6000);
		Event event2 = new Event(venue2,"Metrodome, Gentlemans Dub Club","12-14-2014","22:00:00",5,19000);
		
		//Event constructor validation testing
		try{
			Event testartist = new Event(venue1,"","24-11-2010","13:10",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testdate = new Event(venue1,"game","","13:10",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testtime = new Event(venue1 ,"game","24-11-2010","",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testprice = new Event(venue1 ,"game","24-11-2010","13:10",-1,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testsold = new Event(venue1, "game","24-11-2010","13:10",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		
		//Venue constructor Validation testing
		try{
			Venue testname = new Venue("","Wallaby way","07594837268","www.google.com",0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Venue testaddress = new Venue("o2 academy","","07594837268","www.google.com",0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Venue testphone = new Venue("o2 academy","Wallaby way","","www.google.com",0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Venue testwebsite = new Venue("o2 academy","Wallaby way","07594837268","",0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Venue testcapacity = new Venue("o2 academy","Wallaby way","07594837268","www.google.com",-1);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		
		//addArtist Method testing
		event1.addArtist("Lionel ritchie");
		event2.addArtist("DJ Hazard");
		System.out.println(event1.getArtists());
		System.out.println(event2.getArtists());
		
		//isPast Method testing
		boolean past1 = event1.isPast("2014-12-20", "18:00:00");
		System.out.println(past1);
		boolean past2 = event2.isPast("2014-11-25", "09:00:00");
		System.out.println(past2);
		
		//isUpcoming Method testing
		boolean upcoming1 = event1.isUpcoming("2014-12-20", "18:00:00");
		System.out.println(upcoming1);
		boolean upcoming2 = event2.isUpcoming("2014-11-25", "09:00:00");
		System.out.println(upcoming2);
		
		//isSoldOut Method testing
		boolean soldout1 = event1.isSoldOut();
		System.out.println(soldout1);
		boolean soldout2 = event2.isSoldOut();
		System.out.println(soldout2);
		
		//ticketsAvailable Method testing
		int available1 = event1.ticketsAvailable();
		System.out.println(available1);
		int available2 = event2.ticketsAvailable();
		System.out.println(available2);
		
		//sellTickets Method testing
		boolean sold1 = event1.sellTickets(9000);
		System.out.println(sold1);
		boolean sold2 = event2.sellTickets(3000);
		System.out.println(sold2);
		
		//boxOfficeTakings Method testing
		Money cash1 = event1.boxOfficeTakings();
		System.out.println(cash1);
		Money cash2 = event2.boxOfficeTakings();
		System.out.println(cash2);
		
	}
	
	
	}