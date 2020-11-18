
public class circle extends Shape{
	public int radius;
	public circle (double i, double j)
	{super (i,j);
		}
public circle (double i, double j, double radius) {
	super(i, j);
	this.radius = (int) radius;
}
public double calcArea()
{return Math.PI*radius*radius;

}}
