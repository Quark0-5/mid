class callByValue{
    void change(int x){
        x = 30;
    }
}
public class callByValueExample{
    public static void main(String[] rahul){
        callByValue x1 = new callByValue();
        int x = 10;
        System.out.println("x = "+x);
        x1.change(x);
        System.out.println("x = "+x);
    }
}