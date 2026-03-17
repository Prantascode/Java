package Exceptions;

public class Main {
    public static void main(String[] args) {
        try{
            int [] arr = {1, 4 ,7};
            System.out.println(arr[6]);
        }catch(Exception e){
            System.out.println("Something went wrongy.");
        }
    }
}
