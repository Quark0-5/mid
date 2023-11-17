class callByReference{
    int number;
    void change(callByReference x1){
        x1.number = 23;
    }
}
public class callByReferenceExample{
    public static void main(String[] rahul){
        callByReference x1 = new callByReference();
        x1.number = 20;
        System.out.println(x1.number);
        x1.change(x1);
        System.out.println(x1.number);
    }
}