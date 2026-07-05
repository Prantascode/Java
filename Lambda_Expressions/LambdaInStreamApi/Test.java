package Lambda_Expressions.LambdaInStreamApi;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8);

        nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(n -> System.out.println(n));
            
    }
}
