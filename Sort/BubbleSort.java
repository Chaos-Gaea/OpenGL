package lyp.com.text.Sort;

public class BubbleSort {
     static int[] mInts = new int[] {2,6,8,7,1,4,9};


    public static int[] bubbleSort(int[] ints){
         int len = ints.length;
         int temp = 0;
        for (int i = 0;i < len - 1; i++){
            for (int j = 0; j < len- 1 - i;j ++){
                if (ints[j] >0 && ints[j + 1] < ints[j]){
                    temp = ints[j+ 1];
                    ints[j+ 1 ] = ints[j];
                    ints[j] = temp;
                }
            }
        }



        return ints;
    }

    public  static void   main(String arg[]){
       bubbleSort(mInts);
        for (int mInt : mInts) {

            System.out.println(mInt);
        }
    }

}
