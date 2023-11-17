
class Employee{
    String name, gender;
    int age;
    void display(){
        System.out.println("New Method");
    }
}

public class TestClass{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Employee e = new Employee();
        e.name = "Rahul Kumar Ghosh";
        e.gender = "Male";
        e.age = 23;
        e.display();
        System.out.println("Name = " + e.name + "\nAge = " + e.age + "\nGender = " + e.gender);
    }
}