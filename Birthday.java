/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int b;
        int y;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter the month of your birth please");  //prompt the user for a birth month
        b = keys.nextInt();
        System.out.println ("What year is it right now?");
        y= keys. nextInt();
        keys.close ();
        
        //determine the number of days in the user's birth month
        if (b==1 || b== 3 ||b== 5 ||b== 7 ||b==8 ||b== 10 || b==12) {
            System.out.println ("Your birthday month has 31 days");
        }
        if (b== 4||b== 6 ||b== 9 ||b== 11){
            System.out.println ("Your birthday month has 30 days");
        }
        if (b==2) {
            if (y%4==0) {
                System.out.println ("Your birthday month has 29 days");
                }
            if (y%4 >0) {
                System.out.println ("Your birthday month has 28 days");
                }                    
           }
        }
}