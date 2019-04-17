package homework;

import java.util.Scanner;

public class Math4 {
    public static void main(String[] args) {
        Scanner IO = new Scanner(System.in);
        System.out.print("n is: ");
        int n = IO.nextInt();
        int x = n / 100;
        int y = n % 10;
        int z = n / 10;
        int zS = z % 10;
        int nS = x + y + zS;
        System.out.println("Result=" + nS);

    }
}

