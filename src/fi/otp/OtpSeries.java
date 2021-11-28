package fi.otp;

public class OtpSeries 
{

	static String printOTP(int length)
	{
	    
	    String str = "aeiouAEIOU0123456789";
	    int n = str.length();
	  
	    String OTP="";
	  
	    for (int i = 1; i <= length; i++)
	        OTP += (str.charAt((int) ((Math.random()*10) % n)));
	  
	    return(OTP);
	}
	  

	public static void main(String[] args)
	{
	  
	    
	    int length = 6;
	    System.out.printf("Your OTP is - %s", printOTP(length));
	}
	}