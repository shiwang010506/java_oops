//Take an integer as input and determine whether it is even or odd

import java.util.Scanner;

public class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. : "); 
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Given no is even.");
        }
        else
        System.out.println("Given no is odd.");
    }
}