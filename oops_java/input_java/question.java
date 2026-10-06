//Store five student names in a file with FileWriter
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class question {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 student names:");

        FileWriter fw = new FileWriter("student.txt");

        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            fw.write("Name is: " + name + "\n");
        }

        fw.close();
        sc.close();

        System.out.println("Names successfully stored in student.txt");
    }
}
