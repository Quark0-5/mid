class Student{
    String name, department, gender, university;
    Long id;
    int age;
    Student(){
        System.out.println("This is Student's class!");
    }
    Student(long id, int age){
        this.id = id;
        this.age = age;
    }
    Student(String name, String department, String gender, String university){
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.university = university;
    }
    void display1(){
        System.out.println("Id = " + id + "\nAge = "+ age);
    }
    void display2(){
        System.out.println("Name = " + name + "\nDepartment = " + department + "\nGender = "+ gender + "\nUniversity = " + university );
    }
}


public class TestConstructorOverloading{
    public static void main(String[] rahul){
        Student x1 = new Student(11220120819L, 23);
        Student x2 = new Student("Rahul Kumar Ghosh", "CSE", "Male", "Northern University of Bussiness Technology");
        Student x3 = new Student();
        x1.display1();
        x2.display2();
    }
}