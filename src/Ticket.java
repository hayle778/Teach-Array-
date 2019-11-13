/*
.I`m are asking the user to add 10 input
.print it out the values(names) form the user
.import the Scanner class
.Loop "Enter a name output 10 times
.

*/

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );   //  introducing the Scanner class for the program
        String[] names = new String[10];     //  introducing the array with the data type that the



        String namesList;
          int x;                              // initalize, condition and increment the user input
        for ( x = 0; x < 10;  x++ ) {
      //      System.out.println( "List a name" );
              System.out.print( "Enter a name:-" );        // telling the computer the out put is "Enter a name"
       //     String namesList;
            namesList= input.nextLine();                // we are asking the computer to leave the space for the user input(object )
             names[x]= namesList ;               // it`s connecting  for loop with array

        }

         System.out.println( "....Print list of all name...." );   // use this for separating the user input page to the print page

        for(String star : names )                     //print out the name of the list that the user add 10 times under array
         System.out.println( "Names are:" + star );    //

    }


}