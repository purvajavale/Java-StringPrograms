
public class CountPuntuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*In Java, the char variable stores the ASCII value of a character (number between 0 and 127) rather than the character itself.
		The ASCII value of lower case alphabets are from 97 to 122. 
		And, the ASCII value of upper case alphabets are from 65 to 90. 
		That is, alphabet a is stored as 97 and alphabet z is stored as 122.
		Similarly, alphabet A is stored as 65 and alphabet Z is stored as 90.
		Now, when we compare variable c between 'a' to 'z' and 'A' to 'Z', the variable is compared with the ASCII value of the alphabets 97 to 122 and 65 to 90 respectively.
		Since the ASCII value of * does not fall in between the ASCII value of alphabets.
		 Hence, the program outputs * is not an alphabet.*/
		
		String sValue = "This is test program - purva";
		int jValueLength =  sValue.length();
		
		for(int i = 0 ; i < jValueLength ; i++) {
			if( (sValue.charAt(i) >= 'a' && sValue.charAt(i) <= 'z') ||
					(sValue.charAt(i) >= 'A' && sValue.charAt(i) <= 'Z'))
	            System.out.println(sValue.charAt(i) + " is an alphabet.");
	        else
	            System.out.println(sValue.charAt(i) + " is not an alphabet.");
		}
	}

}
