public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {31, 24, 55, 63, 5, 104, 21};
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("ODD : "+odd);
        System.out.println("EVEN : "+even);
    }
}