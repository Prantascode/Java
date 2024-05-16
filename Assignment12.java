// print sum of odd numbers from m-n

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int m;
      System.out.print("Enter Starting Value : ");
      m = input.nextInt();

      int n;
      System.out.print("Enter End Value : ");
      n = input.nextInt();

      int sum = 0;
      for (int i = m; i <= n; i = i + 2) {
        sum+=i;

      }
      System.out.print("Sum = "+sum);
      input.close();

    }
  }