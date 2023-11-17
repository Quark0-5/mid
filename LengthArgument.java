class variableArgument{
    int add(int ...data){
        int sum = 0;
        for(int a : data){
            sum += a;
        }
        return sum;
    }
}
public class LengthArgument{
    public static void main(String[] rahul){
        variableArgument x1 = new variableArgument();
        System.out.println(x1.add(1, 2));
        System.out.println(x1.add(1, 2, 3, 4, 5));
        for(String x : rahul){
            System.out.println(x);
        }
        int data[] = {1, 2, 3, 4, 5};
        for(int x : data){
            System.out.print(x + " ");
        }
    }
}