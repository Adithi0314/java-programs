
public class Compare_String {

	public static void main(String[] args) {
		String first = "java";
	    String second = "java";
	    String third = "python";

	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	    
        // compare second and third strings
	    boolean result3 = second.equals(third);
	    System.out.println("Strings first and third are equal: " + result3);
	    
	}
 
}
