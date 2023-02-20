package classobjectdemo;
class circle{
 public double x=2,y=2;
 public double R=5;
 public void circumference() {
	 System.out.println("CIRCUMFERENCE IS: "+2*3.14*R);
 }
 public void area() {
	 System.out.println("AREA IS :"+3.14*R*R);
 }
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle acircle=new circle();
		circle bcircle=new circle();
		acircle.circumference();
		bcircle.circumference();
		acircle.area();
		bcircle.area();
	}

}
