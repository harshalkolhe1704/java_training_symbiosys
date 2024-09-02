//4)calculate area of rectangle ,area of circle and circumference of the circle

import java.util.*;
public class Shapes 
{
	public static void calAreaTriangle()
	{
		//Area of triangle = (0.5*base*height)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length or base of the triangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the height of the triangle : ");
		int height = sc.nextInt();
		
		double areaOfTriangle = 0.5 * (length * height);
		System.out.println("Area of the Triangle is : " + areaOfTriangle);
	}
	public static void calAreaCircle()
	{
		//Area of Circle = (pi*r*r)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		
		double areaOfCircle = 3.14 * radius * radius;
		System.out.println("Area of the circle is : " + areaOfCircle);
	}
	public static void calCircumCircle()
	{
		//Circumference of circle = (2 * pi * r)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		
		double CircumferenceOfCircle = 2 * 3.14 * radius;
		System.out.println("Circumference of the Circle : " + CircumferenceOfCircle);
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Shapes.calAreaTriangle();
//		Shapes.calAreaCircle();
		Shapes.calCircumCircle();

	}

}
