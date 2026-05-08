### What is Array of Objects?
An array of objects is a data structure that allows you to store multiple instances of a class in a single array. Each element of the array is an object, and you can access the properties and methods of each object using the array index. This is particularly useful when you want to manage a collection of related objects, such as a list of students, employees, or products.  
#### Example of an Array of Objects in Java:
```java
class Student {
    String name;
    int age;    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ArrayOfObjectsExample {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];
        
        // Initializing the array with Student objects
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 19);
        
        // Accessing properties of each Student object
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name + ", Age: " + students[i].age);
        }
    }
}
```