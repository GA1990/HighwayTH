package lesson6;

public class Puzurkovajasortirovka {
    public static void main(String[] args) {
        int a[] = {10, 12, 23, 9, 15, 55, 19};
        int n = a.length;
        for (int i = 0; i < n - 1; i++)

            for (int j = 0; j < n - i - 1; j++)

                if (a[j] > a[j + 1]) {


                    int temp = a[j];

                    a[j] = a[j + 1];

                    a[j + 1] = temp;
//                    System.out.println(a[j]);
                }
    }
}

