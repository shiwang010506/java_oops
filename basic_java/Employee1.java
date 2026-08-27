class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("name is : "+ name);
        System.out.println("id is : "+ id);
        System.out.println("salary is : "+ salary);
    }
    
}

public class Employee1{
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee E2 = new Employee();

        E1.name = "Rahul";
        E1.id = 100;

        E2.name = "Aman";
        E2.id = 101;

        E1.display();
        E2.display();


    }
}