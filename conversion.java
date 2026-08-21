public class conversion {
    public static void main(String[] args) {

        //IMPLICIT TYPE CONVERSION FROM INT TO DOUBLE
        // int num = 5;
        // double value = num;

        //IMPLICIT CONVERSION FROM BYTE TO INT
        // byte num = 5;
        // int value = num;


        //CONVERT CHAR INTO ITS UNICODE VALUE
        // char character = 'A';
        // System.out.println((int)character);

        //EXPLICIT CONVERSION OF DOUBLE INTO INT

        // double num = 6.0;
        // int value = (int)num;

        // FLOAT INTO INT

        // float num = 5.75f;
        // int value = (int)num;

        //WAP to demonstrate Overflow by converting 130 from int to byte

        int num = 130;
        byte value = (byte)num;

        System.out.println("no. before: "+ num);
        System.out.println("no. after: "+ value);

    }
}