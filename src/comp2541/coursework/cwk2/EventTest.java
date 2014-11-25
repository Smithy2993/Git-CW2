package comp2541.coursework.cwk2;

import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest
{
	
	public static void main(String[] args){
		Venue venue1 = new Venue("O2 Academy","Leeds","07584937289","www.o2academy.co.uk",28000);
		Event event1 = new Event(venue1,"Eminem, Gramatik, Gentlemans Dub Club","12-05-2012","19:00:00",30,6000);
		
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
		System.out.println(event1.getArtists());
		
	}
	
	
	}