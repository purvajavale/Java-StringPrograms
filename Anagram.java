import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Two Strings are called the anagram if they contain the same characters : Brag,Grab */

		String sValue1="Brag";  
        String sValue2="Grab";  
  
        sValue1 = sValue1.toLowerCase();  
        sValue2 = sValue2.toLowerCase();  
  
        if (sValue1.length() != sValue2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            char[] string1 = sValue1.toCharArray();  
            char[] string2 = sValue2.toCharArray();  
  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }  

}
