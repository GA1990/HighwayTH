package homework;

import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {
//        Scanner IO = new Scanner(System.in);
//        System.out.print("number with a fraction: ");
//        double a = IO.nextInt();
        double n = 33.56;
        double b = n - (int) n;
        if (b >= 0.5) {

            n += 1;

        } else n= (int) n;

        System.out.println((int)n);

    }
}