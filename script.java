/*Learning OOP Concepts in Java*/ 

+--------------------------------------+
|                Person                |
+--------------------------------------+
| - name: String                      |
| - age: int                          |
+--------------------------------------+
| + setName(name: String): void       |
| + setAge(age: int): void            |
| + getName(): String                 |
| + getAge(): int                     |
+--------------------------------------+


public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        displayInfo(person);

        Student student = new Student();
        student.setName("Bob");
        student.setAge(20);
        student.setStudentId("12345");
        displayInfo(student);
    }

    public static void displayInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}


/*Classes and Object */
// Defining a simple class
public class Car {
    // Data members (properties)
    String brand;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        // Displaying car information using methods
        car1.displayInfo();
        car2.displayInfo();
    }
}


/*Constructor */
public class Car {
    String brand;
    String model;
    int year;

    // Default constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using constructors to create objects
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2022);

        car1.displayInfo();
        car2.displayInfo();
    }
}
/*Access Modifiers */

public class Car {
    String brand;
    String model;
    int year;

    // Default constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using constructors to create objects
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2022);

        car1.displayInfo();
        car2.displayInfo();
    }
}

/*Getters and setters */
public class Person {
    private String name;
    private int age;

    // Getter for name property
    public String getName() {
        return name;
    }

    // Setter for name property
    public void setName(String newName) {
        name = newName;
    }

    // Getter for age property
    public int getAge() {
        return age;
    }

    // Setter for age property
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Using setters to set properties
        person.setName("Alice");
        person.setAge(30);

        // Using getters to retrieve properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
