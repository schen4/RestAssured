package myTest;

public class StringInAlphabet {

	public static boolean isStringOnlyAlphabet(String str) 
	{ 
	return ((!str.equals("")) 
	&& (str != null) 
	&& (str.matches("^[a-zA-Z]*$"))); 
	} 
}
