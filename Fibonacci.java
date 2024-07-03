import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of series :");
        n = input.nextInt();
        int first = 0, sceond  = 1,fibo;
        System.out.print(first+" "+sceond);
        for(int i = 3;i<=n;i++){
            fibo = first + sceond;
            System.out.print(" "+fibo);
            first = sceond;
            sceond = fibo;
        }

        input.close();

    }
    
}
