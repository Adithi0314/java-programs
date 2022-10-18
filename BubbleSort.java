package javaprograms;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp=0;
		for (int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
      int arr[]= {3,56,12,67,34,89,14,98,5};
      
      System.out.println("Array before BubbleSort");
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]+" ");
      }
      System.out.println();
      
      //calling the function
      bubbleSort(arr);
      
      System.out.println("Array after BubbleSort");
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]+" ");
      }
      

	}

}
