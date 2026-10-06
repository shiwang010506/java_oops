import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class fileread {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("student.txt", true);
        fw.write("Name is: Shiwang\n");
        fw.write("Roll is: 10\n");

        fw.close();

        FileReader fr = new FileReader("student.txt");
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}