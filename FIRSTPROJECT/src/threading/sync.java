package threading;

class sync implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
sync m1=new sync();  
Thread t1 =new Thread(m1); 
System.out.println(t1.isAlive());
t1.start();  
System.out.println(t1.isAlive());
 }  
}  
