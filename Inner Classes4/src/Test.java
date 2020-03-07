
public class Test {  //outer class
	int x=10;
	static int y=20;
	public void m1()//method of outer class
	{
		 int z=100;//instance variable of m1
		class Inner{ //method local inner class
			public void m2()
			{
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);//accessing z in method of inner class
			}
		}
		Inner i=new Inner();
		i.m2();
		
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		// TODO Auto-generated method stub

	}
	//if we declare inner class inside an instance method we can access
	//both static and non-static variables of outer class directly
	//if declared inside a static method then only static variables of outer 
	//class can be accessed directly


}
//a local variable of the method containing the inner class cannot be accessed 
//by the inner class because the variable is stored in stack and the
//object of the inner class is stored in the heap
//once function ends the variable is popped from the stack but
//the object of the inner class may remain in the heap
//this leads to ambiguity
//this problem is solved using the final keyword
