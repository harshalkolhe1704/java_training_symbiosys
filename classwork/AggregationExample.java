package hasAinheritance;

class calculation
{
	int calArea(int l,int b)
	{
		return l * b;
	}
}
class rectangle
{
	calculation cal;
	String name;
	int area(int l,int b)
	{
		cal = new calculation();
		int rectArea = cal.calArea(l, b);
		return rectArea;
	}
}

public class AggregationExample 
{
	public static void main(String[] args)
	{
		rectangle rect = new rectangle();
		int rectarea = rect.area(4, 5);
		System.out.println("Area of rectangle is : " + rectarea);
	}

}
