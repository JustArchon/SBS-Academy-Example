import java.util.Scanner;
public class sortpractice {
    public static void main(String[] args) {
        int[] sortarray = {7,3,6,5,1,2,4,9,8,10};
        int[] Quickarray = sortarray.clone();
        Quicksort(Quickarray);
        for(int num : Quickarray){
            System.out.print(num + " ");
        }
        System.out.println("");
        int[] bubblearray = sortarray.clone();
        Bubblesort(bubblearray);
        for (int num : bubblearray){
            System.out.print(num + " ");
        }
    }
    public static void Bubblesort(int[] arr){
        for(int cycle = 1; cycle < arr.length; cycle++){
            for(int i = 0; i < arr.length-cycle; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }
    public static void Quicksort(int[] a){
        pivot_sort(a, 0, a.length-1);
    }
    public static void pivot_sort(int[] arr, int lo, int hi){
        if (lo >= hi){
            return;
        }

        int pivot = Quick_Partition(arr, lo, hi);
        pivot_sort(arr, lo, pivot);
        pivot_sort(arr, pivot+1, hi);
    }
    public static  int Quick_Partition(int[] arr, int left, int right){
        int lo = left - 1;
        int hi = right + 1;
        int pivot = arr[(left + right) / 2];
        while(true){

            do{
                lo++;
            }while(arr[lo] < pivot);

            do{
                hi--;
            }while(arr[hi] > pivot && lo <= hi);

        if(lo >= hi) {
            return hi;
        }

        swap(arr, lo, hi);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

