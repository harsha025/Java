
package com.practice;

public class Circle {

	/**
	 * @param args
	 */
	int radius;
	float diameter;
	static double PI=3.14159;
	 void calculateArea(int radius){
		 System.out.println("Radius 	:"+radius);
	 }
	 void calculateArea(float diameter){
		 System.out.println("Diameter	:"+diameter);
	 }
	   Circle(int r, float d){  //method  
		  radius=r;  
		  diameter=d;
		 }  
	void displayInformation()
	{
		System.out.println("Diameter	:"+diameter);
		System.out.println("Radius 	    :"+radius);
		System.out.println("PI			:"+PI);
	}
	
	void calculateArea()
	{
		System.out.println(PI*radius*radius);
		}
	void circumference()
	{
		System.out.println(2*PI*radius);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle s = new Circle(6,3.0f);
		s.displayInformation();
		s.calculateArea();
		s.circumference();
		s.calculateArea(4);
		s.calculateArea(8.0f);
	}

}
