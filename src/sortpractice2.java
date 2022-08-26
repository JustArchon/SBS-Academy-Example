public class sortpractice2 {
    public static void main(String[] args) {
        int[] sortarray = {7,3,6,5,1,2,4,9,8,10};
        Quicksort(sortarray);
        for(int num : sortarray){
            System.out.print(num + " ");
        }
    }
    public static void Quicksort(int[] arr){
        pivot_sort(arr, 0, arr.length-1);
    }
    public static void pivot_sort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int pivot = Quick_Partition(arr, lo, hi);
        pivot_sort(arr, lo , pivot);
        pivot_sort(arr,pivot+1,hi);
    }
    public static  int Quick_Partition(int[] arr, int left, int right){
        int lo = left -1;
        int hi = right +1;
        int pivot = arr[(left + right) / 2];
        while(true){
            do {
                lo++;
            }while(arr[lo] < pivot);
            do{
                hi--;
            }while(arr[hi] > pivot && lo <= hi);
            if(lo >= hi){
                return hi;
            }
            swap(arr, lo ,hi);
        }

    }
    public static void swap(int[] arr, int lo, int hi){
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }
}

