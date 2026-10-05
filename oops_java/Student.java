class Student {

    // Instance variables
    int rollNo;
    String name;

    // 1. Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // 2. Method
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    // 3. Method Overloading
    void display(String course) {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        // Creating object using constructor
        Student s1 = new Student(101, "Rahul");

        // Calling method
        s1.display();

        System.out.println();

        // Calling overloaded method
        s1.display("B.Tech CSE");
    }
}