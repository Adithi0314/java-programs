
public class Tester {
//converting super class type to subclass type
	public static void main(String[] args) {
		Product1 p1=(Product1) new Laptop("DELL",45000);
		
		Laptop l=(Laptop)p1;
		System.out.println("product name:" +l.p_name);
		System.out.println("product brand:" +l.brand);
		System.out.println("product price:" +l.price);
		
	}

}
