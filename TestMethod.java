import java.util.Scanner;
class Calculator{
    public int add(int x, int y){
        return (x + y);
    }
    public int sub(int x, int y){
        return (x - y);
    }
    public int multiply(int x, int y){
        return (x * y);
    }
    public void division(int x, int y){
        if(y == 0){
            System.out.println("Division can't be occured because "+ x +"/" + y);
        }else{
            System.out.println(x + "/" + "="+ x/y);
        }
    }
}
public class TestMethod{
    public static void main(String[] rahul){
        Scanner scan = new Scanner(System.in);
        Calculator x1 = new Calculator();
        System.out.print("Enter the first Number = ");
        int x = scan.nextInt();
        System.out.print("Enter the second Number = ");
        int y = scan.nextInt();
        System.out.println(x + "+" + y + "="+ x1.add(x, y));
        System.out.println(x + "-" + y + "=" + x1.sub(x, y));
        System.out.println(x + "*" + y + "=" + x1.multiply(x, y));
        x1.division(x, y);
        scan.close();
    }
}