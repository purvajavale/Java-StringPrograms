
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Kayak";    
        boolean flag = true;    
        string = string.toLowerCase(); 
        int jCount = string.length();
        
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(jCount-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
	}

}
