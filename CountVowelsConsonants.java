
public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* The characters a, e, i, o, u are known as vowels in the English alphabet. Any character other than that is known as the consonant.*/
	
		String sValue = "This is a really simple sentence";    
		sValue = sValue.toLowerCase();    
		int jValueLength = sValue.length();
		int jVowelCount = 0;
		int jConsonantCount = 0;
		
		for(int i = 0; i < jValueLength; i++) {    
            if(sValue.charAt(i) == 'a' || sValue.charAt(i) == 'e' || sValue.charAt(i) == 'i' || sValue.charAt(i) == 'o' || sValue.charAt(i) == 'u') {    
            	jVowelCount++;    
            } 
            else if(sValue.charAt(i) >= 'a' && sValue.charAt(i)<='z') {    
            	jConsonantCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + jVowelCount);    
        System.out.println("Number of consonants: " + jConsonantCount);    
		
	}

}
