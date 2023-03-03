package Lakjshman0091;
//create a thread using Thread ,give A name using parameterized constrctor
//print welcome and presidency
class lakshman extends Thread{
	String name;
	lakshman(String n){
		name=n;
	}
	public void run(){
	try {	System.out.println(name+"running");
		System.out.println("wecome");
		Thread.sleep(7);
		System.out.println("presidency");
	}
	catch(Exception e) {
		
	}
	}
}
public class test10 {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		lakshman m1 = new lakshman("first");
		lakshman m2 = new lakshman("second");
		lakshman m3 = new lakshman("third");
		lakshman m4 = new lakshman("fourth");
		lakshman m5 = new lakshman("fifth");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		Thread.sleep(1333);
		System.out.println("kernel mode");
	}

}
