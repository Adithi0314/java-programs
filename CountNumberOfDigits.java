package javaprograms;

public class CountNumberOfDigits {
   

	public static void main(String[] args) {
		
		int count=0,num=3452;
		
		while(num!=0) {
			num=num/10; //3452/10=345 ,345/10=34 ,34/10=3
			count++;//1//2//3//4
		}
		System.out.println("Number of digits:" +count);
	}

}
