package javaprograms;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		try  
        {  
        int arr[]= {1,3,5,7};  
        System.out.println(arr[2]); //may throw exception   
        }  
            // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Exception Caught");  

	}

}
