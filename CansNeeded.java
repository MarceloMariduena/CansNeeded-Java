// @author: mmariduena

import java.util.Scanner;

class CansNeeded {
  public static void main(String[] args) {

    // Scanner object
    Scanner input = new Scanner(System.in);

    // Declaring variables
    int numOfRooms;
    double total = 0;
    double cansOfPaintNeeded;

    // Prompt user for rooms being painted
    System.out.println("Please enter the number of rooms you wish to paint:");
    numOfRooms = input.nextInt();

    // Converts the inputed numOfRooms into arrays 
    double[] roomNumberCeil = new double[numOfRooms];
    double[] roomNumberWidth = new double[numOfRooms];
    double[] roomNumberHeight = new double[numOfRooms];

    // For loop assigns inputs to the arrays
    for (int i = 0; i < numOfRooms; i++ ){
      System.out.println("Please enter room" + i + " cieling height in feet (8 or 10):");
      roomNumberCeil[i] = input.nextInt();

      System.out.println("Please enter room" + i + " width:");
      roomNumberWidth[i] = input.nextInt();

      System.out.println("Please enter room" + i + " height:");
      roomNumberHeight[i] = input.nextInt();

      // Adds area of each room during each iteration
      total += 2*(roomNumberCeil[i] * roomNumberWidth[i]) + 2*(roomNumberHeight[i] * roomNumberWidth[i]);
    }

    // Calculates the amount of cans needed (rounded up)
    cansOfPaintNeeded = Math.ceil(total / 30); 

    System.out.println("You will need " + cansOfPaintNeeded + " cans of paint.");



  }
}