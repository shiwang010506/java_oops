import java.io.FileWriter;
import java.io.IOException;

public class appendFile{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("Student.txt, true");
        fw.write("Name is: Shiwang");
        fw.write("Roll is: 101");

        fw.close();

        System.out.println("Data written.");
    }
}