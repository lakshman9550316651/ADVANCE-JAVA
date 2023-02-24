package classobjectdemo;
import java.util.Scanner;
interface Shape78{
	public void set(double radius);
	public void area();
	public void volume();
}
class circlee implements Shape78{
 double radius;
 public void set(double radius) 
 {
	this.radius=radius; 
 }
 public void area() {
	
	 System.out.println("Area is"+3.14*radius*radius);
 }
 public void volume() {
 }
}
class spheree implements Shape78{
	 double radius;
	 public void set(double radius) {
		this.radius=radius; 
	 }
	 public void area() {
		
	 }
	 public void volume() {
		 System.out.println("Volume is"+(4/3*3.14*radius*radius*radius));
	 }
	}

public class Test5 {

	public static void main(String[] args) {
		int dn;
		Scanner sc = new Scanner(System.in);
		dn=sc.nextInt();
		System.out.println("Enter two or three");
		Shape78 s;
		if(dn ==2) {
			s=new circlee();
			s.set(7);
			s.area();
		}
		else {
			s=new spheree();
			s.set(6.9);
			s.volume();
		}
		
	}

}
