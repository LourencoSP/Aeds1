import java.util.Arrays;
import java.util.Random;

public class Selection_sort {
    public static void main(String[] args) {

        int[] num = new int[100];
        Random random = new Random(12345);
        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(num));
        long tempoInicial = System.nanoTime();
        selectionSort(num);
        long tempoFinal = System.nanoTime();

        System.out.println(Arrays.toString(num));
        System.out.println("Levou " + (tempoFinal - tempoInicial) + " ms");



    }

    private static void selectionSort(int[] num) {
        int length = num.length;

        for(int i = 0; i < length - 1; i++){
            int min = num[i];
            int indexMin = i;
            for(int j = i + 1; j <length; j++){
                if(num[j] < min){
                    min = num[j];
                    indexMin = j;
                }
            }
            swap(num, i, indexMin);
        }

    }

    private static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;

    }

}
