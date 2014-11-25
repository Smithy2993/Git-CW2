package comp2541.coursework.cwk2;

import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest
{
	public static void main(String[] args){
		try{
			Event testartist = new Event("","24-11-2010","13:10",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testdate = new Event("game","","13:10",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testtime = new Event("game","24-11-2010","",0,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testprice = new Event("game","24-11-2010","13:10",-1,0);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
		try{
			Event testsold = new Event("game","24-11-2010","13:10",0,-1);
		}
		catch(IllegalArgumentException error){
			System.err.println("Something went wrong. Error:" + error.getMessage());
		}
	}
	
	
	}