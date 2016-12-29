package com.practice;

public class Rectangle {

	int length;
	float breadth;
	 void calculateArea(int length){
		 System.out.println("length 	:"+length);
	 }
	 void calculateArea(float breadth){
		 System.out.println("breadth	:"+breadth);
	 }
	 Rectangle(int l, float b){  //Constructor
		 length=l;  
		 breadth=b;
		 }  
	void displayInformation()
	{ 
		System.out.println("length	:"+length);
		System.out.println("breadth 	    :"+breadth);

	}
	
	void calculateArea()
	{
		System.out.println(length*breadth);
		}
	void circumference()
	{
		System.out.println(2*length+2*breadth);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle s = new Rectangle(8,5.0f);
		s.displayInformation();
		s.calculateArea();
		s.circumference();
		s.calculateArea(4);
		s.calculateArea(8.0f);
	}

}
