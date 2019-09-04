/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;     
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter an x-coordinate");  //prompt the user for an x-coordinate
        x = keys.nextDouble();
        System.out.println("Enter a y-coordinate");  //prompt the user for a y-coordinate
        y = keys.nextDouble();
        keys.close();
        
        //determine the quadrant in which the user's order pair lies
        if (x >0 && y >0) {
            System.out.println("Your point is in the first quadrant");
        }
        if (x <0 && y >0) {
            System.out.println("Your point is in the second quadrant");
        }
        if (x <0 && y <0) {
            System.out.println("Your point is in the third quadrant");
        }
        if (x >0 && y <0) {
            System.out.println("Your point is in the fourth quadrant");
        }
        if (x ==0 && y ==0) {
            System.out.println("Your point is on the origin");
        }       
        if (x ==0 && y >0 || y<0) {
            System.out.println("Your point is on the y-axis");
        }
        if (x >0 || x<0 && y ==0) {
            System.out.println("Your point is on the x-axis");
        }
    }
}