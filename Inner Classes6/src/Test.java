//this is anonymous inner class that implements runnable interface
import java.util.*;

public class Test {
	public static void main(String[] args) {
	Runnable r=new Runnable() {
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child thread");
			}
		}
		
	};
	Thread t=new Thread(r);//r is the object of class which implements 
							//Runnable interface
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("Main thread");
	}
	
	}
}
