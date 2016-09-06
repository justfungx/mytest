package mytest;

public class java45 {

	public static void main(String[] args) {
	java541 obj1 = new java541("A");
	java541 obj2 = new java541("B");
	java542 obj3 = new java542("C");
	Thread t1q = new Thread(obj3);
	
	
//	obj1.run();
//	obj2.run();
	obj1.start(); //權限大於RUN ，所以還是會執行RUN
	obj2.start();
	t1q.start();
	try{ 
		Thread.sleep(200);
	}catch(InterruptedException e){

	}
	System.out.println("Main");
	obj2.interrupt();
}
}
class java541 extends Thread {
	String name;
	java541(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

class java542  implements Runnable{
	String name;
	java542(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}