import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );   // indicator of there is a loop a head so leave the space for the user
        String[] names = new String[10];     // array that needs a connection with a for loop


        //   System.out.println("Enter a name");


        // initalize, condition and increment the user input
        //   for( x = 0; x < 10; x++) {



        String cheese = "";
        for (int x = 0; x < 10;  x++ ) {
            System.out.print( "Enter a name:" );        // we are commanding the computer to print the list with underneath user input
          cheese = input.nextLine();       // we are asking the computer to leave the space for the user input
            names[x] =  cheese;

        }


        for(String m : names )
         System.out.println( "Names are:" + m );

    }


}