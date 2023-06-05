
public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sValue = "This is test program - purva";
		int jValueLength =  sValue.length();
		int jCounter = 0;
		
		for(int i = 0 ; i < jValueLength ; i++) {
			 if(sValue.charAt(i) != ' ')   { 
				jCounter++;
			}
		}
		System.out.println("Count of Charaters are : " + jCounter );
	}

}
