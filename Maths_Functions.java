/*
A Single Example using different mathematical functions
Showing the use of different mathematical functions 
 */
public class Maths_Functions
{
    public static void main(String args[])
    {
        //Declaring Variables
        double m = 6.25;
        double n = 8.75;
        double p = 15.625;
        // Displaying Outputs 
        // Doing Calculation at same time 
        System.out.println("The Output of Different Mathematical Functions are :- ");
        System.out.println("Minimum Value Between 6.25 & 8.75 :- " + Math.min(m,n));
        System.out.println("Maximum Value Between 6.25 & 8.75 :- " + Math.max(m,n));
        System.out.println("Square Root of 6.25 :- " + Math.sqrt(m));
        System.out.println("Cube Root of 15.625 :- " + Math.cbrt(p));
        System.out.println("6.25 raise to the power 3 :- " + Math.pow(m,3));
        System.out.println("Absolute Value of (6.25-8.75) :- " + Math.abs(m-n));
        System.out.println("The Floor Value of 6.25 :- " + Math.floor(m));
        System.out.println("The Ceil Value of 6.25 :- " + Math.ceil(m));
        System.out.println("Integral Value of 6.25 :- " + Math.rint(m));
        System.out.println("Rounded Value of 6.25 :- " + Math.round(m));
        System.out.println("Exponent Value of 6.25 :- " + Math.exp(m));
        System.out.println("Natural Log of 6.25 :- " + Math.log(m));
    }
}