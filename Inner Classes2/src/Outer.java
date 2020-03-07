
public class Outer {
	int x=10;//instance variable of outer class
	class Inner{
		int x=100;//instance variable of inner class
		public void m1()
		{
			int x=1000;//local variable of function
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(new Outer().x);
			System.out.println(Outer.this.x);
		}
	}

	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.m1();
		// TODO Auto-generated method stub

	}

}
