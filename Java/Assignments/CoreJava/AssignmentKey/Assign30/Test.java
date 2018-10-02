/*
 * 30 Implement a superclass Person. Make two classes, Student and Instructor, inherit from Person.
 *   A person has a name and a year of birth. A student has a major, and an instructor has a salary. 
 *   Write the class definitions, the constructors, and the methods toString for all 
 *   classes. Supply a test program that tests these classes and methods. 
 */
class Person
{
    private String name;
    private int YearOfBirth;
    public Person(String name, int YearOfBirth) {

        this.name = name;
        this.YearOfBirth = YearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return YearOfBirth;
    }

    public String toString() {
        return "Name =" + name + ",Year Of Birth=" + YearOfBirth ;
    }
}


 class Student1 extends Person {

    private String major;
    public Student1(String name, int YearOfBirth, String major) {

        super(name, YearOfBirth);
        this.major = major;
    }
    public String getMajor() {

        return major;
    }
    public String toString() {

        return "Student " + super.toString() + ",major=" + major ;
        
    }

}
 class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {

        super(name, birthYear);
        this.salary = salary;
    }

    public double getSalary() {

        return salary;
    }

    public String toString() {

        return "Instructor " + super.toString() + ",salary=" + salary ;
    }
}



public class Test {

    public static void main(String[] args) {
        Person ps = new Person("likhitha", 1986);
        Student1 st = new Student1("Kim", 1991, "Java");
        Instructor inst = new Instructor("Vikash", 1989, 30000.0);
        System.out.println(ps);
        System.out.println("********************************************************************************");
        System.out.println(st);
        System.out.println("********************************************************************************");
        System.out.println(inst);
    }
}