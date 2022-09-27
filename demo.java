package com.sample;

public class demo {
    void add(int x, int y)
    {
    	System.out.println("add (int, int) method is running");
    	int z=x+y;
    	System.out.println("the value of z is : " +z);
    }
    void add(double x, double y)
    {
    	System.out.println("add (double,double) method is running");
    	double  z=x+y;
    	System.out.println("the value of z is :"  +z);
    }
	public static void main(String[] args) {
		 demo d=new demo();
		 d.add(4,5);
	}

}
