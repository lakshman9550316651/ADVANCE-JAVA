package classobjectdemo;
import java.util.Scanner;
class Room{
 private int l=0,b=0;
 Room(){
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the lenght and breaths of the class Rooms");
	 l=sc.nextInt();
	 b=sc.nextInt();
	 
 }
 public void cprint() {
	 System.out.println("Length of room ="+l);
	 System.out.println("Breadth of room ="+b);
 }
}
public class Test3 {

	public static void main(String[] args) {
		Room r1=new Room();
		Room r2=new Room();
		Room r3=new Room();
		System.out.println("The measurements of clasroom1 are :");r1.cprint();
		System.out.println("The measurements of clasroom2 are :");r2.cprint();
		System.out.println("The measurements of clasroom3 are :");r3.cprint();

	}

}
