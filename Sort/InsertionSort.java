package lyp.com.text.Sort;

public class InsertionSort {
    static int[] mInts = new int[] {2,6,8,7,1,4,9};
    public static int[] insertionSort(int[] ints){
        int len = ints.length;
        int preIndex, current = 0;
        for (int i = 1; i< len ; i++){
            preIndex = i - 1;
            current = ints[i];//循环比较对象
            while (preIndex>= 0 && ints[preIndex] > current){
                ints[preIndex + 1] = ints[preIndex];
                preIndex--;//后移
            }

            ints[preIndex + 1] = current;
        }

        return  ints;
    }


    public static void  main(String args[]){
        insertionSort(mInts);;
        for (int mInt : mInts) {
            System.out.println(mInt);
        }
    }
}
