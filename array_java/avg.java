public class avg{
    public static void main(String[] args) {
        int[] a = {2, 7, 5, 4, 100};
        int sum = 0;
        for(int i = 0; i<a.length; i++) {
            sum = (sum + a[i]);
        }
        double avgerage = (sum/a.length);
        System.out.println("avg = " +avgerage);
    }
}