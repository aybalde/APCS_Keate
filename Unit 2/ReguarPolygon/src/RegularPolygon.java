public class RegularPolygon
{
    //instance variables
    private int s;
    private int n;

    //constructor
    public RegularPolygon(int s, int n)
    {
        this.s = s;
        this.n = n;
    }
    //getter methods
    public int getNumSides()
    {
        return n;
    }

    public int getSideLength()
    {
        return s;
    }
    //mutator methods
    public double interiorAngle()
    {
        return /*ToDo*/
    }

    public double exteriorAngle()
    {
        return /*ToDo*/
    }

    public double area()
    {
        return /*ToDo*/
    }

    //NOTE: Do not change this code!!
    public String toString()
    {
        return "A regular polygon with " + getNumSides() + " sides of length " +
                getSideLength() + " has an interior angle measurement of " + interiorAngle() + " degrees, " +
                "an exterior angle measurement of " + exteriorAngle() + " degrees, and an area of " + area() + ".";
    }
}
