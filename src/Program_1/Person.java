package Program_1;

// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Gettter method
    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public static void main(String[] args) {
        Person p1=new Person("Jiya",19 );
        Person p2=new Person("Priya",9 );
        // Print information about the first person
        System.out.println("Person 1 - Name: " + p1.getname() + ", Age: " + p1.getage());

        // Print information about the second person
        System.out.println("Person 2 - Name: " + p2.getname() + ", Age: " + p2.getage());

    }
}
