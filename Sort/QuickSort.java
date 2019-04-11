package lyp.com.text.Sort;

public class QuickSort {
    static int[] mInts = new int[] {2,6,8,7,1,4,9};

    public static void Quicksort(int[] array,int start,int end){
        int tbegin = start, tend = end;
        int pivot = array[start];
        while (tbegin < tend){
            while (tbegin < tend && array[tend] >= pivot){
                --tend;
            }
            array[tbegin] = array[tend];

            while (tbegin < tend && array[tbegin] <= pivot){
                ++tbegin;
            }
            array[tend] = array[tbegin];
        }

        array[tbegin] = pivot;
        if (start < tend){
            Quicksort(array,start,tend  - 1);
        }
        if (tbegin < end){
            Quicksort(array,tbegin + 1,end );
        }
    }


    public static void main(String args[]){
        Quicksort(mInts,0,mInts.length-1);
        for (int mInt : mInts) {
            System.out.println(mInt);
        }
    }
}
