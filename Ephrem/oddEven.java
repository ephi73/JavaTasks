package Ephrem;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int numb = input.nextInt();

        isOddEven(numb);
    }

    public static String isOddEven(int numb){
        String isOdd= "";
        if(numb%2==0){
            isOdd+="Even";
        }else {
            isOdd+="Odd";
        }
        System.out.println(isOdd);
        return isOdd;
    }
}
