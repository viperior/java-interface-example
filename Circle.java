class Circle implements Measurable
{
	private double radius;
	private String name;

	public Circle(double x)
	{
		setRadius(x);
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double x)
	{
		if( x < 0.001 )
		{
			x = 0;
		}

		radius = x;
	}

	public double getPerimeter()
	{
		return Math.PI * 2 * radius;
	}
}
