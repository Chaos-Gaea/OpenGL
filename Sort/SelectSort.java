package lyp.com.text.Sort;

public class SelectSort {
    static int[] mInts = new int[] {2,6,8,7,1,4,9};



    public static int[] selectSort(int[] ints){
        int len = ints.length;
        int temp ,minNum = 0;
        for (int i = 0; i < len - 1; i++){

             minNum  = i;
            for (int j = i + 1; j < len; j++){
                if (ints[j] < ints[minNum]){
                   minNum = j;   //
                }
            }
            temp = ints[i];
            ints[i] = ints[minNum];
            ints[minNum] = temp;
        }

        return ints;
    }

    public static void main(String arg[]){
        selectSort(mInts);
        for (int mInt : mInts) {
            System.out.println(mInt);
        }
    }
}
