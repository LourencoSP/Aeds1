import java.util.Arrays;
import java.util.Random;

public class Quick_sort {
    public static void main(String[] args) {
        Random random = new Random(12345);
        int[] num = new int[500000];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(num));

        long tempoInicial = System.nanoTime();

        QuickSort(num, 0, num.length - 1);
        long tempoFinal = System.nanoTime();

        System.out.println(Arrays.toString(num));
        System.out.println("Levou " + (tempoFinal - tempoInicial) + " ms");
    }
    private static void QuickSort(int[] array){
        QuickSort(array , 0 , array.length - 1);
    }
    private static void QuickSort(int[] array, int bIndex, int aIndex) {
        if(bIndex >= aIndex){
            return;
        }
        int pivoIndex = new Random().nextInt(aIndex - bIndex) + bIndex;
        int pivo = array[pivoIndex];
        swap(array, pivoIndex, aIndex);
        int esqPoint = bIndex;
        int dirPoint = aIndex;

        while(esqPoint < dirPoint){

            while(array[esqPoint] <= pivo && esqPoint < dirPoint){
                esqPoint++;
            }
            while(array[dirPoint] >= pivo && esqPoint < dirPoint) {
                dirPoint--;
            }
            swap(array, esqPoint, dirPoint);

        }
        swap(array, esqPoint, aIndex);

        QuickSort(array, bIndex, esqPoint - 1);

        QuickSort(array, esqPoint + 1, aIndex);


        }
    private static void swap (int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
    }
