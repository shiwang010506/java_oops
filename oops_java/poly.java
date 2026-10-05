class animal{
    void eats() {
        System.out.println("animal eats");

    }
    void sound() {
        System.out.println("animals make sound");
    }

}
class dog extends animal{
    void sound() {
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void sound() {
        System.out.println("cat meows");
    }
}
class poly{
    public static void main(String[] args) {
        animal a;
        a = new dog();
        a.sound();


        a = new cat();
        a.sound();
        
        
    }
}