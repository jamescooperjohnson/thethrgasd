
public class prop extends main
{




	public prop(String n,  String c, int l, int p, int r)
		{
			name =n;
			color=c;
			location=l;
			price=p;
			rent=r;
		}

	@Override
	public void info(){
		sr.mono();

		System.out.println( "You landed on " + sr.comic.get(roll).name);
		System.out.println( "You can purchase this for $" + sr.comic.get(roll).price);
		System.out.println( "The rent per land is $" + sr.comic.get(roll).rent);
		System.out.println("its color is " +  sr.comic.get(roll).color);
	}

}
		
			