/*
package algorithm;

import java.util.List;

public class Sort {

    long executionTime = 0;
	*/
/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 *//*



    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        public int[] insertionSort(int[] array) {
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            //implement here
            for (int i = 1; i < array.length; i++) {
                int k = array[i];
                int j = i - 1;
                while (j >= 0 && k < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    j--;
                }
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }


    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        public int[] bubbleSort(int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        public int[] mergeSort(int[] array, int l, int r) {
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            if (l < r) {
                // Find the middle point
                int m = (l + r) / 2;
                // Sort first and second halves
                mergeSort(array, l, m);
                mergeSort(array, m + 1, r);
                // Merge the sorted halves
                merge1(array, l, m, r);

                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - startTime;
                this.executionTime = executionTime;
            }

        return list;
    }
        public static class MergeSort implements SortingAlgorithm {

            public void sort(int[] array, int k) {
                int[] aux = new int[array.length];
                int hi = Math.min(k - 1, array.length - 1);
                sort(array, aux, 0, hi);
            }

            // may want to add additional methods

            private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
                // copy to aux[]
                for (int k = lo; k <= hi; k++) {
                    aux[k] = a[k];
                }

                // merge back to a[]
                int i = lo, j = mid+1;
                for (int k = lo; k <= hi; k++) {
                    if      (i > mid)              a[k] = aux[j++];   // this copying is unnecessary
                    else if (j > hi)               a[k] = aux[i++];
                    else if (aux[j] < aux[i])      a[k] = aux[j++];
                    else                           a[k] = aux[i++];
                }
            }

            // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
            private static void sort(int[] a, int[] aux, int lo, int hi) {
                if (hi <= lo) return;
                int mid = lo + (hi - lo) / 2;
                sort(a, aux, lo, mid);
                sort(a, aux, mid + 1, hi);
                merge(a, aux, lo, mid, hi);
            }

            public String toString() {
                return "Merge Sort";
            }
            return list;
        }


        public int [] quickSort(int [] array){
        int [] list = array;
            public static class QuickSort implements SortingAlgorithm {
                @Override
                public void sort(int[] array, int k) {
                    int N = Math.min(k - 1, array.length - 1);
                    quicksort(array, 0, N);
                }

                */
/** Puts A[LO..HI] into sorted order. *//*

                private static void quicksort(int[] a, int lo, int hi) {
                    if (hi <= lo) {
                        return;
                    }
                    int j = partition(a, lo, hi);
                    quicksort(a, lo, j - 1);
                    quicksort(a, j + 1, hi);
                }

                */
/** Returns array copy of AL. *//*

                private static int[] convertListToArray(List<Integer> al) {
                    int[] returnArray = new int[al.size()];

                    for (int i = 0; i < al.size(); i += 1) {
                        returnArray[i] = al.get(i);
                    }

                    return returnArray;
                }
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
            public static class HeapSort implements SortingAlgorithm {

            }
                public void sort(int[] array, int k) {
                    int N = Math.min(array.length, k);

                    for (int m = N/2; m >= 1; m--)
                        sink(array, m, N);

                    while (N > 1) {
                        exch(array, 1, N);
                        N -= 1;
                        sink(array, 1, N);
                    }
                }

                private static void sink(int[] pq, int m, int N) {
                    while (2*m <= N) {
                        int j = 2*m;
                        if (j < N && less(pq, j, j+1)) j++;
                        if (!less(pq, m, j)) break;
                        exch(pq, m, j);
                        m = j;
                    }
                }
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
*/
