package day6;
import java.util.Scanner;  // Import the Scanner class
public class Cigarettes {
    public static void main(String[]args){
        /*Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int age;
        // Enter age and press Enter
        System.out.println("Enter Your Age");
        age = Integer.parseInt(myObj.nextLine());
        age = myObj.nextInt();
        */
        int age = 25;
        if (age>18){
            System.out.println("You are eligible to buy Cigarettes.");
        } else {
            System.out.println("You are not eligible to buy Cigarettes.");
               }
    }
}
