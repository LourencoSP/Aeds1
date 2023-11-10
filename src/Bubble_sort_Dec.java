import java.util.Arrays;
import java.util.Random;

public class Bubble_sort_Dec {
    public static void main(String[] args) {
        Random random = new Random(12345);
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(num));

        long tempoInicial = System.nanoTime();

        boolean swap = true;
        while (swap) {
            swap = false;

            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    swap = true;
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }

        long tempoFinal = System.nanoTime();

        System.out.println(Arrays.toString(num));
        System.out.println("Levou " + (tempoFinal - tempoInicial) + " ms");
    }
}

