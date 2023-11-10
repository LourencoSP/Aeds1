import java.util.Arrays;
import java.util.Random;

public class Insertion_sort {
    public static void main(String[] args) {
        Random random = new Random(12345);
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(num));

        long tempoInicial = System.nanoTime();

        insertionSort(num);
        long tempoFinal = System.nanoTime();

        System.out.println(Arrays.toString(num));
        System.out.println("Levou " + (tempoFinal - tempoInicial) + " ms");
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int valAtual = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > valAtual) {
                inputArray[j + 1] = inputArray[j]; // Corrigido para mover elementos maiores para a direita
                j--;
            }
            inputArray[j + 1] = valAtual;
        }
    }
}
