//WAP to find the sum of all elements in an array

public class SumElements{
    public static void main(String[] args) {
        int[] a = {2, 7, 5, 4, 100};
        int sum = 0;
        for(int i = 0; i<a.length; i++) {
            sum = (sum + a[i]);
        }
        System.out.println("Sum = " +sum);
    }
}