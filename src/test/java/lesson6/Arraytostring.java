package lesson6;

public class Arraytostring {
    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 3};

//show array address in memory
        System.out.println(sampleArray);

//print array
        for (int i=0; i<sampleArray.length; i++){
            System.out.print(sampleArray[i] + " ");
        }

    }
}
