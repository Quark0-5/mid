class Student{
    String name;
    long id;
    static String universityName = "Northern University of Bussiness Technology";
    Student(String name, long id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Name = "+name+"\nID = "+id+"\nUniversity = "+universityName);
    }
    static void display1(){
        System.out.println("It's a static method");
        System.out.println("University = "+universityName);
        //System.out.println("Name = " + name);
        //display();We can't call the non static variable and method 
    }
    static void display2(){
        universityName = "Khulna University";//changing static varible 
        display1();
    }
}
public class TestStaticMethod{
    public static void main(String[] rahul){
        Student s1 = new Student("Rahul Kumar Ghosh", 11220120819L);
        s1.display();
        Student.display2();
        //System.out.println("University = "+Student.universityName);
    }
}