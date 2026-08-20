//Take marks of 3 subjects as input and calculate the total and percentage

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the marks of mathematics : ");
        int maths = sc.nextInt();

        System.out.println("enter the marks of Physics : ");
        int physics = sc.nextInt();

        System.out.println("enter the marks of Chemistry : ");
        int chemistry = sc.nextInt();

        int Total = (maths+physics+chemistry);

        System.out.println("Total Sum = " +Total );

        double percentage = (Total/300.0) * 100;

        System.out.println("Percentage = "+ percentage );
    }
}

