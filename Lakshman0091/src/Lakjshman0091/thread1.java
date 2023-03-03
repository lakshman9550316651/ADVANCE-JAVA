package Lakjshman0091;
//creating a single thread using runnable interfacxe 
//Runnable creates task can be assigned to a thread 
class Task implements Runnable{
public void run() {
	System.out.println(Thread.currentThread()+"running");
	System.out.println("welcome");
	}
}
class Task2 implements Runnable{
public void run() {
	System.out.println(Thread.currentThread()+"running");
	System.out.println("presidency");
	}
}
public class thread1 {

	public static void main(String[] args) throws Exception {
		System.out.println("Hi");
		Task task= new Task();
		Task2 task2=new Task2();
		Thread t1=new Thread(task);
		Thread t2=new Thread(task2);
		t1.setName("firstchild");
		t2.setName("secondchild");
		t1.start();
		t2.start();
		Thread.sleep(1);;
		System.out.println("BYE--->");
	}

}
