//This is finding greatest among 3 numbers 
import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		if(b>a && b>c) {
			System.out.println("b is greater");
		}
		if(c>a && c>b) {
			System.out.println("c is greater");
		}

	}

}
