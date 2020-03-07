//Method local inner classes are declared inside a method of a class
//they are used for nested functions functionality because
//java does not support function declaration inside another function
//its scope is restricted to the function so this type is 
//rarely used
public class Test {
	public void m1()
	{
		class Inner{
			public void sum(int x,int y)
			{
				System.out.println("The sum is: "+(x+y));
			}
			
		}
		Inner i=new Inner();
		i.sum(10, 20);
		
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		
		// TODO Auto-generated method stub

	}

}
