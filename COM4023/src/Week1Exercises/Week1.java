/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week1Exercises;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author nellis-greenwood
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //exercise 1
        System.out.println("Hello World");
        
        //Exercise 2
        Scanner read = new Scanner(System.in);
        System.out.println("What is your name?");
        String name=read.nextLine();
        System.out.println("Your name is "+ name);
        
        //Exercise 3
        int length, height;
        System.out.println("Enter length:");
        name=read.nextLine();
        length=Integer.parseInt(name);
        System.out.println("Enter Height:");
        name=read.nextLine();
        height=Integer.parseInt(name);
        System.out.println("Perimeter="+(length+length+height+height));
        System.out.println("Area="+(length*height));
        
        //Exercise 4
        double num1, num2;
        System.out.println("Enter number 1:");
        name=read.nextLine();
        num1=Double.parseDouble(name);
        System.out.println("Enter number 2:");
        name=read.nextLine();
        num2=Double.parseDouble(name);
        System.out.println("Average of numbers is: "+((num1+num2)/2));
        
        //Exercise 5
    }
    
}
