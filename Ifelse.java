import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the value : ");
        num = input.nextInt();

        if(num > 0 ){
            System.out.print("Positive");
        }else{
            System.out.print("Negative");
        }
        input.close();

        }
    }
