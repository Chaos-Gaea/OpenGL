package lyp.com.text.Sort;

import java.util.Arrays;
import java.util.SortedMap;

public class MergeSort {
    static int[] mInts = new int[] {2,6,8,7,1,4,9};

    public static void   mergeSort(int[] ints){
        int len = ints.length;
        int[] temp = new int[len];
        sort(ints,temp,0,len - 1);
    }


    public static  int[] Mergesort(int[] ints){
        int len = ints.length;
        if (len < 2 )
            return ints;

        int mid = len / 2;
        int[] left = Arrays.copyOfRange(ints,0,mid);
        int[] right = Arrays.copyOfRange(ints,mid,len);
        return merge(Mergesort(left),Mergesort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        for (int index = 0 , i = 0 , j = 0;index < result.length;index++){
            if (i>= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }

        return result;
    }



    private static void sort(int[] ints,int[] temp,int num,int r) {
        int mid = (num + r) /2;
        if (num == r)
            return;

        //递归调用
        sort(ints,temp,num,mid);
        sort(ints,temp,mid + 1,r);

        for (int i = num; i<= r; i++){
            temp[i] = ints[i];
        }


        int i1 = num;
        int i2 = mid + 1;

        for (int cur = num;cur <= r; cur++) {
            if (i1 == mid + 1)
                ints[cur] = temp[i2++];
            else if (i2 > r)
                ints[cur] = temp[i1++];
            else if (temp[i1] < temp[i2])

                ints[cur] = temp[i1++];
            else
                ints[cur] = temp[i2++];

        }
    }




    public static void main(String args[]){
//        mergeSort(mInts);

        Mergesort(mInts);
        for (int mInt :  Mergesort(mInts)) {
            System.out.println(mInt);
        }

    }

}
