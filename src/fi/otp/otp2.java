package fi.otp;

public class otp2 {

	static String generateOTP(int len)
	{
	   
	    String str = "'a''e''i''o''u'"+"0123456789";
	    int n = str.length();
	  
	  
	    String OTP="";
	  
	    for (int i = 1; i <= len; i++)
	        OTP += (str.charAt((int) ((Math.random()*10) % n)));
	  
	    return(OTP);
}
}
