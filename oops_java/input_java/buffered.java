import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class buffered{
    public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter the name: ");
String name = br.readLine();

System.out.println("enter the age: ");
int age = Integer.parseInt(br.readLine());

System.out.println("Age is: "+age);
System.out.println("Name is : "+name);
    }
}