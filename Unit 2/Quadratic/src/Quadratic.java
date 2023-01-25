public class Quadratic {
    //instance variables
    private double a;
    private double b;
    private double c;

    //constructor
    public Quadratic(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //mutator method
    public String findRoots()
    {
        double root1 = /*ToDo*/
        double root2 = /*ToDo*/
        //Do not alter the code below in any way.
        String message = "The roots for a quadratic with coefficients a = " + a + " b = " + b + " and c = " + c;
        message += " are " + root1 + " and " + root2 + ".";
        return message;
    }
}
