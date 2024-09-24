package abstractionpack;

abstract class GeometricShapes 
{
	String NameOfShape;
	//abstract method
	abstract double calculateArea();
	public abstract String toString();
	
	//constructor
	public GeometricShapes (String  NameOfShape)
	{
		System.out.println("Inside the Constructor " + " of GeometricShape class");
		this.NameOfShape = NameOfShape;
	}
	
	//non-abstract method
	public String getNameOfShape()
	{
		return NameOfShape;
	}

}

class circle extends GeometricShapes
{
	double radius;
	public circle(String NameOfShape,double radius)
	{
		super(NameOfShape);
		System.out.println(" Inside the Constructor of Circle Class");
		this.radius = radius;
	}
	
    //implementing method
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the shape is " + super.NameOfShape + 
				" and its area is : " + calculateArea();
	}
	
}

class square extends GeometricShapes
{
	double length;
	public square(String NameOfShape,double length)
	{
		super(NameOfShape);
		System.out.println("Inside the constructor of Square class");
		this.length = length;
	}
	//implementing methods
	@Override
	double calculateArea()
	{
		return length * length;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the shape is " + super.NameOfShape + 
				" and its area is : " + calculateArea();
	}	
}

public class abstractexa 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GeometricShapes shapeObj1 = new circle("circle" , 6.5);
		System.out.println(shapeObj1.toString());
		GeometricShapes shapeObj2 = new square("Rectangle" , 8);
		System.out.println(shapeObj2.toString());	
	}

}


/*
 
 */


