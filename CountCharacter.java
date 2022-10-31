package javaprograms;

public class CountCharacter {

	public static void main(String[] args) {
		
		String string="hello good morning";
		
		int count=0;
		
		for(int i=0;i<string.length();i++) {
			
			if(string.charAt(i)!=' ')
				count++;
		}
		System.out.println("total number of characters in a string:"+count);
	}

}
