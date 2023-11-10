import java.util.Arrays;
import java.util.Random;

public class Insertion_sort_Dec {
    public static void main(String[] args) {
        Random random = new Random(12345);
        int[] num = new int[500000];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(num));

        long tempoInicial = System.nanoTime();

        insertionSort(num, true);
        long tempoFinal = System.nanoTime();

        System.out.println(Arrays.toString(num));
        System.out.println("Levou " + (tempoFinal - tempoInicial) + " ms");
    }

    private static void insertionSort(int[] inputArray, boolean isDescending) {
        for (int i = 1; i < inputArray.length; i++) {
            int valAtual = inputArray[i];
            int j = i - 1;

            if (isDescending) {
                while (j >= 0 && inputArray[j] < valAtual) { // Modifica a condição para ordem decrescente
                    inputArray[j + 1] = inputArray[j];
                    j--;
                }
            } else {
                while (j >= 0 && inputArray[j] > valAtual) {
                    inputArray[j + 1] = inputArray[j];
                    j--;
                }
            }

            inputArray[j + 1] = valAtual;
        }
    }
}
