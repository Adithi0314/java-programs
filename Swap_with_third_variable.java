
public class Swap_with_third_variable {
	public static void swap() {
	int a=10;
	int b=20;
	
	System.out.println("Value of a before swapping is :" +a);
	System.out.println("Value of b before swapping is :" +b);
	
	int temp=a;
	a=b;
	b=temp;
	
	System.out.println("Value of a after swapping is :" +a);
	System.out.println("Value of b after swapping is :" +b);
	}
	
	public static void main(String[] args) {
		swap();
		
		
	}

}
