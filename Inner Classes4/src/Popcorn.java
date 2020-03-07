//Anonymous inner classes are the ones with no names
//they are used for instant use or one time usage
//there are three types
//1)which extends a class
//2)which implements an interface
//3)which is defined as an argument
public class Popcorn {
	public void taste()
	{
		System.out.println("Salty");
	}
			public static void main(String[] args)
		{
				Popcorn P=new Popcorn()
				{
					public void taste()
					{
						System.out.println("Sweet");
					}
				};

			Popcorn P1=new Popcorn();
			P1.taste();
		}

}

