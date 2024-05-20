/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unittesteg1;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class UnitTestEg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarations
        String firstName;
        String lastName;
        String username;

        Scanner input = new Scanner(System.in);
        
         System.out.println("Please enter your first name: ");
            firstName = input.nextLine();

            System.out.println("Please enter your last name: ");
            lastName = input.nextLine();
        
        // Loop until a valid username is entered
        boolean isValidUsername = false;
        while (!isValidUsername) {
            //Entering details
           

            System.out.println("Please enter username: ");
            username = input.nextLine();

            if (username.length() <= 5 && username.contains("_")) {
                System.out.println("Username successfully captured");
                isValidUsername = true; // Exit the loop
            } else {
                System.out.println("Please ensure your username is no more than 5 characters in length and has an underscore");
            }
        }
    }
}



