package javaprograms;

public class Sum_of_Array_Elements {

	public static void main(String[] args) {
		
		int [] arr=new int[] {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of all the elements of an array:" +sum);
	}

}
