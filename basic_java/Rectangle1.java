class Rectangle{
    int length;
    int breadth;

    void area() {
        System.out.println("area is : "+ (length*breadth));
    }

    void Perimeter() {
        System.out.println("perimeter is : "+ 2*(length + breadth));
    }
}

public class Rectangle1{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 4;

        r1.area();
        r1.Perimeter();
    }
}