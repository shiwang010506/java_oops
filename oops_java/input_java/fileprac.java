import java.io.FileWriter;
import java.io.IOException;

public class fileprac{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Student.txt");
        fw.write("Name is: Shiwang\n");
      
        fw.close();

        System.out.println("Data written.");
    }
}
