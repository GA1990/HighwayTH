
package homework;


        import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner IO = new Scanner(System.in);
        System.out.print("n is: ");
        int n = IO.nextInt();
        int result = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < 2; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(result);
    }
}
