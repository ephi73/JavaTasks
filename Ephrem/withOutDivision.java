package Ephrem;
import java.lang.Math;
import java.util.Scanner;

public class withOutDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();

        divide(numb1,numb2);
    }

    public static int divide(int numb1, int numb2){
        // handle divisibility by 0
        if (numb2 == 0)
        {
            System.out.println("Error!! Divisible by 0");
            System.exit(1);
        }

        // store sign of the result
        int sign = 1;
        if (numb1* numb2 < 0) {
            sign = -1;
            // convert both dividend and divisor to positive
            numb1 = Math.abs(numb1); numb2 = Math.abs(numb2);
        }


        // initialize quotient by 0
        int quotient = 0;

        // loop till dividend `x` becomes less than divisor `y`
        while (numb1 >= numb2)
        {
            numb1 = numb1 - numb2;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }

        System.out.println("The quotient is "+(sign *quotient));
        System.out.println("The remainder is "+ (sign *numb1));

        return  quotient;
    }
}
