// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        System.out.print("Chosse Your Option :");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Bangali");
                break;
             case 2:
                System.out.println("Hindi");
                break;
             case 3:
                System.out.println("Urdu");
                break;    
        
            default:
                System.out.println("English");
                break;
        }
        input.close();

    }
}