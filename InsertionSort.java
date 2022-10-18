package javaprograms;

public class InsertionSort {

	public static void insertionSort(int array[]) {
	int n=array.length;
	for(int j=1;j<n;j++) {
		int key=array[j];
		int i=j-1;
		while((i>-1)&&(array[i]>key)) {
			array[i+1]=array[i];
			i--;
		}
		array[i+1]=key;
	}
	}
	public static void main(String[] args) {
		int[] arr= {9,6,12,5,67,89,11,1,5,90};
		
		System.out.println("Array before InsertionSort");
	      for(int i:arr) {
	    	  System.out.println(i+" ");
	      }
	      System.out.println();
	      
	      //calling the function
	      insertionSort(arr);
	      
	      System.out.println("Array after InsertionSort");
	      for(int i:arr) {
	    	  System.out.println(i+" ");

	}

}
}
