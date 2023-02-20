package classobjectdemo;
abstract class shape{
	abstract public void Area();
	
}
class circle9 extends shape{
	private int r=5;
	public void Area() 
	{
		System.out.println("Area of circle is:"+3.141*r*r);
	}
}
class Sphere9 extends shape{
	private int r=3;
	public void Area() {
		System.out.println("Area of Sphere is:"+4*3.141*r*r);
	}
}
class Cylinder9 extends shape{
	private int r=3,h=9;
	public void Area() {
		System.out.println("Area of cylinder is:"+2*3.141*r+3.141*r*r*h);
	}
}
public class Test4 {

	public static void main(String[] args) {
		circle9 c1=new circle9();
		Sphere9 s1=new Sphere9();
		Cylinder9 c2=new Cylinder9();
		c1.Area();
		s1.Area();
		c2.Area();

	}

}
