package lesson6;

import java.util.Arrays;

public class Array_Sort_Exampl {
    public static void main(String[] args) {
        int [] mas = {54, 26, 93, 17, 77, 31, 44, 55, 20};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
