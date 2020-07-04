
class hi extends Thread
{
	public void run()
	{
		System.out.println("hi");
	}
	
}
public class HELLO {
	public static void main(String args[])
		{
		System. out. println("Hello Java");
		
		hi t1 = new hi();
		t1.start();
		}
}
