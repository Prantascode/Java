package Lambda_Expressions.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(11);
        nums.add(12);
        //nums.forEach((n) -> {System.out.println(n);});

        Consumer<Integer> get = (n) -> {System.out.println(n);};
        nums.forEach(get);
    }
}
