public class Coins {
    public static String getChange(){
        /*ToDo*/
        return(cents + " cents: Quarter(s) " + quarters + ", Dime(s) " + dimes +", Nickel(s) " + nickels +", Penny(s) " + pennies);
    }
    public static void main(String[] args)
    {
        System.out.println(Coins.getChange());
    }
}