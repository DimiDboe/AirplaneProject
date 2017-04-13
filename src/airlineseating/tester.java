/*
 * Alec Ramos
   Dimas Rodriguez
 */
package airlineseating;

import java.util.Scanner;

/**
 *
 * @author Alec.Ramos001
 */
public class tester
{
    //Plane samplePlane = new Plane();
    
    
    public static void main(String[] args)
    {
        PlaneClass ecoClass = new PlaneClass("Economy Class", 15, 6);
        PlaneClass firstClass =  new PlaneClass("First Class", 5, 4);
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Airline Seating");
        while(1<2)
        {
            System.out.println("Which would you like to do?");
            System.out.println("'Add': Add Passenger \n'View': View Seating \n'Quit': Quit");
            String userInput = s.next();
            if(userInput.equalsIgnoreCase("Add"))
            {
                System.out.println("\nPlease select class: \n1: Economy Class (15 Rows, 6 Columns)\n2: First Class(5 Rows, 4 Columns)");
                int userClass = s.nextInt();
                System.out.println("Enter the row:");
                int userRow = (s.nextInt()) - 1;
                System.out.println("Enter the column:");
                int userCol = (s.nextInt()) - 1;
                switch(userClass)
                {
                    case 1:
                        ecoClass.claim(userRow, userCol);
                        System.out.println("Seat added!");
                        break;
                    case 2:
                        firstClass.claim(userRow, userCol);
                        System.out.println("Seat added!\n");
                        break;
                    default:
                        System.out.println("Invalid entry for class, please try again.");
                        break;
                }
            }
            else if(userInput.equalsIgnoreCase("View"))
            {
                System.out.println("");
                ecoClass.viewSeats();
                firstClass.viewSeats();
                System.out.println("");
            }
            else if(userInput.equalsIgnoreCase("Quit"))
            {
                break;
            }

        }
    }
   
}
