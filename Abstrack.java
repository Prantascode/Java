abstract class Abstrack {
    public String name  = "Jhon";
    public int age = 22;
    public abstract void study();
}
class Student extends Abstrack{
    public int graduationyear = 2024;
    public void study(){
        System.out.println("Studying all day long.");

    }
}
class second{
    public static void main(String[] args) {
        Student myobj = new Student();
        System.out.println("Name : " + myobj.name);
        System.out.println("Age : : "+myobj.age);
        System.out.println("Graduation Year = "+myobj.graduationyear);
        myobj.study();
    }
}
