package Lakjshman0091;
class printthread extends Thread{
	String name;
	printthread(String name)
	{
		this.name=name;
	}
	public void run() {

		try{
			for(int i=5;i>=1;i--) {
				System.out.println(name +" "+i);
				
			}
		}
		catch(Exception e) {
			
		}
	}
}
public class test11 {

	public static void main(String[] args)throws Exception {
		System.out.println("strat");
		printthread t1=new printthread("first");
		printthread t2=new printthread("second");
		printthread t3=new printthread("third");
		t1.start();
		System.out.println(t1.isAlive());
		t1.join();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t2.start();
		t2.join();
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		t3.start();
		t3.join();
		System.out.println(t3.isAlive());
		                
		System.out.println("After execuetion of code ---->");
		System.out.println("isAlive ....!");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		
	}

}
