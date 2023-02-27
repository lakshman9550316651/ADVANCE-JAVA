package Multithreading;
class Mythread extends Thread{
	String name;
	Mythread(String Name){
	this.name=Name;	
	System.out.println(Name+"is created");
	}
	public void run() {
		try {
		for(int i=0;i<=5;i++) {
			System.out.println(i+"--->"+name);
			Thread.sleep(200);
		}
		}catch(Exception e) {
			System.out.print("Exception Handled");
		}
	}
}
public class singlethreadd {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.out.println("Main thread egins");
System.out.println("Hello");

  Mythread m1 =new Mythread("first");
  Mythread m2 =new Mythread("second");
  Mythread m3 =new Mythread("third");
  Mythread m4 =new Mythread("fourth");
  Mythread m5 =new Mythread("fifth");
  Mythread m6 =new Mythread("sixth");
  Mythread m7 =new Mythread("seventh");
  Mythread m8 =new Mythread("eight");
  Mythread m9=new Mythread("ninth");
  Mythread m10 =new Mythread("tenth");
  
  m1.start();
  m2.start();
  m3.start();
  m4.start();
  m5.start();
  m6.start();
  m7.start();
  m8.start();
  m9.start();
  m10.start();
  
  
  Thread.sleep(1000);
  System.out.println("Bye");
	}

}
