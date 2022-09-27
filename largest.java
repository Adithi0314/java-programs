
public class largest {

	public static void main(String[] args) {
		
		int [] arr = new int [] {25, 1, 7, 7, 59,89};  
		
        //Initializing max element with first element of array.  
        int max = arr[0];  
         
        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element  in given array: " + max);  

	}

}
