
public class DivideNCounts {
	
	public static void main(String[] args) {  
		
        String str = "aaaabbbbcccc";  
        
        int len = str.length();  
        int n = 3;  
        int temp = 0, chars = len/n;  
        String[] equalStr = new String [n];  
        
        if(len % n != 0) {  
            System.out.println("This string cannot be divided into "+ n +" equal parts.");  
        } else {  
            for(int i = 0; i < len; i = i+chars) {  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                System.out.println(equalStr[temp]);  
                temp++;  
            }  
        }
	}
}
