package javaprograms;

public class CountPunctuation {

	public static void main(String[] args) {
	
     int count=0;
     
     String str="good morning ?/;:";
     for(int i=0;i<str.length();i++) {
    	
    	 if(str.charAt(i)=='!'|| str.charAt(i)==':'|| str.charAt(i)==';'|| str.charAt(i)=='/'||str.charAt(i)=='?'||str.charAt(i)=='?')
    	 {
     
     	 count++;
    	 }
     
	}
 System.out.println("number of punctuations is:"+count);
}
}
