
public abstract class main
{

	protected String name;
	protected String color;
	protected int location;
	protected int price;
	protected int rent;
	protected String power;
	protected int roll=(int) ((Math.random()*10)+2);


	public abstract void info();


	public String getName()
		{
			return name;
		}


	public void setName(String name)
		{
			this.name = name;
		}


	public String getColor()
		{
			return color;
		}


	public void setColor(String color)
		{
			this.color = color;
		}


	public int getLocation()
		{
			return location;
		}


	public void setLocation(int location)
		{
			this.location = location;
		}


	public int getPrice()
		{
			return price;
		}


	public void setPrice(int price)
		{
			this.price = price;
		}


	public int getRent()
		{
			return rent;
		}


	public void setRent(int rent)
		{
			this.rent = rent;
		}


	public String getPower()
		{
			return power;
		}


	public void setPower(String power)
		{
			this.power = power;
		}


	public int getRoll()
		{
			return roll;
		}


	public void setRoll(int roll)
		{
			this.roll = roll;
		}


}
