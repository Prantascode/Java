/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */
import java.util.Scanner;

public class Assingment6{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int value;
        System.out.print("Enter a value between 0-9 : ");
        value = input.nextInt();

        if(value >= 0 && value <= 9){
            if(value == 0){
                System.out.print("Zero");
            }else if(value == 1){
                System.out.print("One");
            }else if(value == 2){
                System.out.print("Two");
            }else if(value == 3){
                System.out.print("Three");
            }else if(value == 4){
                System.out.print("Four");
            }else if(value == 5){
                System.out.print("Five");
            }else if(value == 6){
                System.out.print("Six");
            }else if(value == 7){
                System.out.print("Seven");
            }else if(value == 8){
                System.out.print("Eight");
            }else if(value == 9){
                System.out.print("Nine");
            }
        }else{
            System.out.println("Invalid Number.");
        }
        input.close();
    }
}