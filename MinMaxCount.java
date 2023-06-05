
public class MinMaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "grass is greener on the other side";    
	      int[] freq = new int[str.length()];   
	      int i, j; 
	          
	      //Converts given string into character array    
	      char string[] = str.toCharArray();    
	      
	      for(i = 0; i < string.length; i++) {    
	          freq[i] = 1;    
	          for(j = i+1; j < string.length; j++) {    
	              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
	                  freq[i]++;      
	              }    
	          }    
	      }
	}

}
