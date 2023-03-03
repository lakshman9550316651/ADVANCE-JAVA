package Lakjshman0091;
class mythread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread()+"running");
		System.out.println("Welcome ");
	}
}
public class s91 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HI");
		mythread t1=new mythread();
		t1.setName("First");
		t1.start();
		Thread.sleep(20);
		System.out.println("BYE ---->");
	
	}

}
