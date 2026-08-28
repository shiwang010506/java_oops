//Accept 5 integers from the user and print them
import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter the nos.");

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Nos. are : ");
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        
    }
}