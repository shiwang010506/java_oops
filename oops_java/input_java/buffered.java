import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class buffered{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name: ");
        String name = br.readLine();

        System.out.println("Enter the age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Enter the marks: ");
        double marks = Double.parseDouble(br.readLine());

        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Marks is: "+marks);
    }
}

