// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch,chh;
        System.out.print("Have you completed your masters : ");
        ch  = input.next().charAt(0);
        System.out.print("Are you fulent in English : ");
        chh = input.next().charAt(0);

        if(ch == 'y' && chh == 'y'){
            System.out.println("You are eligible to for the job interview.");
        }else{
            System.out.println(("Sorry.you are not eligible to for the job interview."));
        }
        input.close();
    }
  }