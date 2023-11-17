class Calculation{
    void add(int x, int y){
        System.out.println(x + y);
    }
    //changing parameter overloading 
    void add(int x, int y, int z){
        System.out.println(x + y + z);
    }
    //changing data type overloading
    void add(double x, double y){
        System.out.println(x + y);
    }
    void add(int x, double y){
        System.out.println(x + y);
    }
    //changing the order of parameter
    void add(double x, int y){
        System.out.println(x * y);
    }
}
public class TestMethodOverloading{
    public static void main(String[] rahul){
        Calculation x1 = new Calculation();
        x1.add(1, 2);
        x1.add(1, 2, 3);
        x1.add(1.0, 2.0);
        x1.add(1, 2.0);
        x1.add(1.0, 2);
    }
}
