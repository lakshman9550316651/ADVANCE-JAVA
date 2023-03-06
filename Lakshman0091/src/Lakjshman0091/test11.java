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
				Thread.sleep(1000);

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
		t2.start();
		t3.start();
		System.out.println("isAlive ....!");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("isAlive ....!");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		
	}

}
