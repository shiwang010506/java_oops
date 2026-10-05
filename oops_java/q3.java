class parent{
    int x = 10;
    void show() {
        System.out.println("PARENT");
    }
    
}

class child extends parent {
    int y = 20;
    void show() {
        System.out.println(y);
    System.out.println(super.x);
    }
    void display() {
        super.show();
    }
}
class q3 {
    public static void main(String[] args) {

    child c1 = new child();
    c1.show();
    c1.display();

  
    }
}