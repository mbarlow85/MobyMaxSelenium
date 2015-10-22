package test.mobymax.qa.tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

public class MobyMaxTests extends Base
{
	
//		 private String password;
//		 
//		 public MobyMaxTests(String password)
//		 {
//			      this.password = password;		    
//		 }	
		  
//		  @Parameterized.Parameters
//		   public static Collection passWords() {
//		      return Arrays.asList(new Object[][] {	      
//		         {"911"}	       
//		      });
//		   }	  	  
		  
		  @Test	
		  public void test1_UpWorkRegistration()throws IOException, InterruptedException  {
			 this.getUpWorkRegistration();
		  }	
		  
		  @Test	
		  public void test2_MobyMaxRegistration()throws IOException, InterruptedException  {
			 this.getMobyMaxRegistration();
		  }	

}
