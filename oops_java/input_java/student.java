import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class student {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter roll no: ");
        int roll = sc.nextInt();

        FileWriter fw = new FileWriter("student.txt", true);
        fw.write("Name is: "+name);
        fw.write("roll is: "+roll);

        fw.close();

        System.out.println("Data written.");
    }
}
