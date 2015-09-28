package MainPackage;

public class Triangle extends GeometricObject
{
	
	//Created the three sides of a triangle
	private double side1=1;
	private double side2=1;
	private double side3=1;
	
	//Create no arg constructor
	public Triangle()
	{
	}
	
	//Create constructor that creates a triangle with the specified side 1,2, and 3
	public Triangle(double side1, double side2, double side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	//Setters and Getters
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//Method that returns triangle perimeter
	public double getPerimeter()
	{
		return this.side1+this.side2+this.side3;
	}
	
	//Method that returns a description of the triangle
	public String toString()
	{
		return "Side 1="+side1+"Side 2="+side2+"Side 3="+side3+
				"Area="+getArea()+"Parimeter="+getPerimeter();
	}
	
	//Method that returns the triangle area
	public double getArea()
	{
		double x = (this.side1+this.side2+this.side3)/2;
		double triangleArea=Math.sqrt(x*(x-side1)*(x-side2)*(x-side3));
		return triangleArea;
	}

}
