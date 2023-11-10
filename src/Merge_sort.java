import java.util.Arrays;
import java.util.Random;

public class Merge_sort {
    public static void main(String[] args) {
        Random random = new Random(12345);
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(num));

        long tempoInicial = System.nanoTime();

        MergeSort(num);
        long tempoFinal = System.nanoTime();

        System.out.println(Arrays.toString(num));
        System.out.println("Levou " + (tempoFinal - tempoInicial) + " ms");
    }

    private static void MergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] metEsq = new int[midIndex];
        int[] metDir = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            metEsq[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            metDir[i - midIndex] = inputArray[i];
        }
        MergeSort(metEsq);
        MergeSort(metDir);

        merge(inputArray, metEsq, metDir);

    }

    private static void merge(int[] inputArray, int[] metEsq, int[] metDir) {
        int tamEsq = metEsq.length;
        int tamDir = metDir.length;

        int i = 0, j = 0, k = 0;
        while (i < tamEsq && j < tamDir) {
            if (metEsq[i] <= metDir[j]) {
                inputArray[k] = metEsq[i];
                i++;
            } else {
                inputArray[k] = metDir[j];
                j++;
            }
            k++;
        }
        while (i < tamEsq) {
            inputArray[k] = metEsq[i];
            i++;
            k++;
        }
        while (j < tamDir) {
            inputArray[k] = metDir[k - i];
            j++;
            k++;
        }

    }
}
