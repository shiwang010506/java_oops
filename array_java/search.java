//WAP to search for a given element in an array.

import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required element: ");
        int n = sc.nextInt();
        boolean found = false;

        int[] arr = {55, 32, 65, 78, 99, 48};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                found = true;
                break;
            }
            
        }
        if(found) {
            System.out.println("Element Found!");

        }
        else{
            System.out.println("Element not found!!");

        }
    }
}