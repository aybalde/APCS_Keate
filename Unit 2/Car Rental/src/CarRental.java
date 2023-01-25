public class CarRental
{
    //instance variables
    private String make;
    private String model;
    private int year;
    private String licensePlate;

    //constructor
    public CarRental(String make, String model, int year, String licensePlate)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }
    //getter methods
    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }
    //mutator methods
    public String rentalCode()
    {
        String code = /*ToDo*/
        int lastNum = /*ToDo*/
        int licenseNum = /*ToDo*/
        code += /*ToDo*/
        return code;
    }

    //NOTE: Do not change this code!!
    public String toString()
    {
        return "The rental code for the " + year + " " + make + " " + model +
                " with a license plate of " + licensePlate + " is " + rentalCode() + ".";
    }
}