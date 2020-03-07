//Concept of inner classes is needed only when one object should not exist 
//without the existence of another object
public class Outer {
	class Inner{
		public void m1()
		{
			System.out.println("Inside inner class method");
		}
	}
	//accessing inner class from static area of outer class
	/*public static void  main(String[] args)
	{
		/*Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.m1();
		
		//new Outer().new Inner().m1();
		Outer o=new Outer();
		o.m2();
		
	}*/
	//accessing inner class from instance area of outer class
	public void m2()
	{
		Inner i=new Inner();
		i.m1();
	}
	//accessing inner class from outside the outer class is same as
	//accessing it from the static area of outer class

}
