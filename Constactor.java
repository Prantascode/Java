public class Constactor {
    int modelYear;
    String modelname;
    public Constactor(int year,String name){
         modelYear = year ;
        modelname = name;
    }
    public static void main(String[] args) {
        Constactor mycar = new Constactor(2022, "Audi");
        System.out.println(mycar.modelname + " " +mycar.modelYear);
    }
    
}
