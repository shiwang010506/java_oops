import java.util.Scanner;

public class largerNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first no: ");
        int num1 = sc.nextInt();

        System.out.println("enter the second no: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("The larger no is: " + num1);

        }
        else if(num2 > num1) {
            System.out.println("The larger no is : " + num2);
        }
        else
        System.out.println("They are same! ");

    }
}