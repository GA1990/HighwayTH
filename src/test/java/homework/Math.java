package homework;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner IO = new Scanner(System.in);
        System.out.print("q is: ");
        int q = IO.nextInt();

        System.out.print("w is: ");
        int w = IO.nextInt();
// если я правильно понимаю, нас интересует именно деление с остатком
        System.out.println("we have: " +(int)q%w);
    }
}

