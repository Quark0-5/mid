class Person{
    private String name;
    private double weight, height;
    Person(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    public void setName(String data){
        name = data;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getheight(){
        return height;
    }
    public double BMI(double weight, double height){
        return (weight / (height*height));
    }
}
public class encapsulation{
    public static void main(String[] rahul){
        Person akash = new Person(45.0, 1.7);
        Person hasib = new Person(120.0, 1.7);
        Person nahid = new Person(170, 2.0);
        akash.setName("Sri Akash Datta");
        hasib.setName("Md. Hasib Molla");
        nahid.setName("Sk Nahid Hassan Badal");
        System.out.println(akash.getName() + "'s BMI = " + akash.BMI(akash.getWeight(), akash.getheight()));
        System.out.println(hasib.getName() + "'s BMI = " + hasib.BMI(hasib.getWeight(), hasib.getheight()));
        System.out.println(nahid.getName() + "'s BMI = " + nahid.BMI(nahid.getWeight(), nahid.getheight()));
    }
}