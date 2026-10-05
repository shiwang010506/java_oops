class Grandparent {

    void house() {
        System.out.println("Grandparent has a house");
    }
}

class Parent extends Grandparent {

    void car() {
        System.out.println("Parent has a car");
    }
}

class Child extends Parent {

    void bike() {
        System.out.println("Child has a bike");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.house();
        c.car();
        c.bike();
    }
}