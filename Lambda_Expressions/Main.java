package Lambda_Expressions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.forEach((n)->{System.out.println(n);});
    }
}
