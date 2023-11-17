public class TestMainMethodOverloading{
    public static void main(String[] rahul){
        System.out.println("My name is rahul");
    }
    public static void main(String x){
        System.out.println("I am not main method");
    }
    public static void main(double[] rahul){
        System.out.println("I am also not the main Method!!");
    }
}