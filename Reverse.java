
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Dream big";    
        String reversedStr = "";    
        
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        System.out.println("Reverse of given string: " + reversedStr);    
		
        //other
        StringBuffer sbr = new StringBuffer(string); 
        sbr.reverse(); 
        System.out.println("Reverse of given string: " + sbr);
        
        //other
        char[] temparray = string.toCharArray(); 
        int left, right = 0; 
        right = temparray.length - 1; 
  
        for (left = 0; left < right; left++, right--) { 
            // Swap values of left and right 
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right] = temp; 
        } 
  
        for (char c : temparray) {
            System.out.print(c); 
        }
        System.out.println(); 
	}

}
