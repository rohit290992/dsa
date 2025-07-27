import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        // Consider it like sorting of playing cards, where you have 2 decks one is sorted an another
        //unsorted and you pick one element in each iteration and put it in its correct place in sorted
        //deck.
        for(int i =1; i<arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }
}
