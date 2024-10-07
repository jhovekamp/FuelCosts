import java.util.Scanner; // before the class at top of the file

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsGas = 0.0;
        double MPG = 0.0;
        double priceGas = 0.0;
        double cost = 0.0;
        double miles = 0.0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                gallonsGas = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the gallons of gas was: " + trash + "\n");
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        do
        {
            System.out.print("Enter your miles per gallon: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                MPG = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the miles per gallon was: " + trash + "\n");
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        do
        {
            System.out.print("Enter the price per gallon of gas: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                priceGas = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the price per gallon of gas was: " + trash + "\n");
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        cost = (100/MPG) * priceGas;
        miles = MPG * gallonsGas;
        System.out.println("The cost to drive 100 miles is: " + cost + "\n");
        System.out.println("The car with a full tank of gas can go " + miles + " miles.");

    }
}