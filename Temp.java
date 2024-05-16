import java.util.Scanner;

public class Temp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double cels,fern;
        System.out.print(" Frhernhite : ");    //cels = 0.56 * ferm - 32;
        fern = input.nextDouble();               //fern = 1.8 * cels + 32;

        cels =0.56 * fern - 32;
        input.close();

        System.out.println("Celsius : "+cels);
    }

}