class Animal {
    void eats() {
        System.out.println("Animal eats");
    }
}
class dog extends Animal {
    void bark() {
        System.out.println("dog barks");
    }
}
class puppy extends dog {
    void cry() {
        System.out.println("puppy cries");
    }
}
class main {
    public static void main(String[] args) {
        puppy p1 = new puppy();
        p1.cry();
        p1.bark();
        p1.eats();
    }
}