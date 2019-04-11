package lyp.com.text.Sort;

public class ShellSort {
    static int[] mInts = new int[] {2,6,8,7,1,4,9,5};
    public static int[] shellsort(int[] ints){
        int len = ints.length;
        for (int gap = len/2; gap>0;gap /= 2){

            for (int j = gap; j < len; j++){

                int preIndex = j - gap;
                int current = ints[j];
                while (preIndex >=0 && ints[preIndex] > current){
                    ints[preIndex + gap]  = ints[preIndex];
                    preIndex -=  gap;
                }
                ints[preIndex + gap] = current;
            }
        }


        return ints;
    }


    public static  void  main(String args[]){
        shellsort(mInts);
        for (int mInt : mInts) {

            System.out.println(mInt);
        }

    }
}
