package javaprograms;

public class RemoveCharacters {

	public static void main(String[] args) {
		String inputString = "Good Morning";
        char ch = 'o';
        String result = removeCharacters(inputString, ch); 
 
        System.out.println("After removing character '" + ch + "' from the inputString '" + inputString
                + "' the result will be: \n" + result);
 
    }
    public static String removeCharacters(String str, char ch) {
 
        String result = str.replace("o", "");
        return result;

	}

}
