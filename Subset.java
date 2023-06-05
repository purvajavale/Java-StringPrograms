
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "FUN";  
        int len = str.length();  
        int temp = 0;  
        //Total possible subsets for string of size n is n*(n+1)/2  
        String arr[] = new String[len*(len+1)/2];  // 3*4/2 = 3*2 = 6 combinations
        
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                System.out.println(arr[temp]);  
                temp++;                 
            }  
        }  
	}
}
