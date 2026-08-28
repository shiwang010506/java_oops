//WAP to find the largest element in an array
public class largestNo {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(largest<arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}