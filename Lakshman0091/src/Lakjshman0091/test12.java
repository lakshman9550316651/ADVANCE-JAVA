package Lakjshman0091;
class Printtask implements Runnable{
	
	public void run() {

		try{
			for(int i=5;i>=1;i--) {
				System.out.println(Thread.currentThread()+" "+i);
				
			}
		}
		catch(Exception e) {
			
		}
	}
	
}
public class test12 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Printtask p1= new Printtask();
		Thread tm1=new Thread(p1);
		Thread tm2=new Thread(p1);
		Thread tm3=new Thread(p1);
		
		tm1.start();
		
		System.out.println(tm1.isAlive());
		tm1.setName("first");
		tm1.join();
		System.out.println(tm1.isAlive());
		System.out.println(tm2.isAlive());
		tm2.start();
		tm2.join();
		System.out.println(tm2.isAlive());
		System.out.println(tm3.isAlive());
		tm3.start();
		tm3.join();
		
		
				
	}

}
