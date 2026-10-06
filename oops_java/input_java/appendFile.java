import java.io.FileWriter;
import java.io.IOException;

public class appendFile{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("Student.txt", true);
        fw.write("Name is: Shiwang\n");
        fw.write("Roll is: 101\n");

        fw.close();

        System.out.println("Data written.");
    }
}