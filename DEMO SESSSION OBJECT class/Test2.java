package classobjectdemo;
//create class sphere ,another class cylinder and print volume of both
class sphere{
	private double r=6.7;
	public void Vol_sphere() 
	{
		System.out.println("Volume of sphere is"+4.0/3*3.141*r*r*r);
		}
	
	
	}
	

class cylinder{
	private double r=9.7,h=6.4;
	public void Vol_cylinder(){
		System.out.println("Volume of cylinder is :"+3.141*r*r*h);
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		sphere s1=new sphere();
		cylinder c1=new cylinder();
		s1.Vol_sphere();
		c1.Vol_cylinder();

	}

}
