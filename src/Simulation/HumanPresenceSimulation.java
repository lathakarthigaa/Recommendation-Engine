package Simulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class HumanPresenceSimulation 
{
	
	public boolean getHumanPresenceStatus(String time)
	{
		boolean humanPresenceStatus = false;
		
		return humanPresenceStatus;
	}
	
	/*public static void main( String args[] )
	  {
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:D:/Projects/Recommendation Engine/simulation");
	      
	      System.out.println("Inserting records into the table...");
	      stmt = c.createStatement();
	      
	      for(int j=20;j<=23;j++)
	      {
		      for(int i=0;i<=9;i++)
		      {
			      String sql = "INSERT INTO human_presence VALUES ('"+j+":0"+i+":00',0)";
			      stmt.executeUpdate(sql);
		      }
		      
		      for(int i=11;i<=59;i++)
		      {
			      String sql = "INSERT INTO human_presence VALUES ('"+j+":"+i+":00',0)";
			      stmt.executeUpdate(sql);
		      }
	      }
	      
	      System.out.println("Inserted records into the table...");
	      
	    } 
	    catch(SQLException e1)
	    {
	    	System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      System.exit(0);
	    }
	    
	    catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	  }*/
}
