package Sorting;
import java.util.Arrays;

//Merge sort class
public class MergeSort

{
    public static void mergeSort(int[] array)

    {
        System.out.println(Arrays.toString(array));
            System.out.println("\n");

        if(array == null) {
            return;
        }


        if(array.length > 1)
        {
            int mid = array.length / 2;

            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = array[i];

            }



            // Split right part
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++)
            {
                right[i - mid] = array[i];

            }
            System.out.println(" # Two splits of array "+Arrays.toString(array)+" are "+Arrays.toString(left)+"and"+Arrays.toString(right));

            System.out.println("1) Left split of array"+Arrays.toString(array));
            mergeSort(left);
            System.out.println("2) Right split of array "+Arrays.toString(array));
            mergeSort(right);
            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {

                if(left[i] < right[j])
                {
                    //comparison of two sub arrays and insertion of elements in the correct place of merged the array
                    System.out.println("Comparing left array "+Arrays.toString(left)+" & right array "+Arrays.toString(right)+" -> "+left[i]+" < "+right[j]+" So, "+left[i]+" inserted in merged array");
                    array[k] = left[i];
                    i++;

                }



                else
                {
                    //comparison of two sub arrays and insertion of elements in the correct place of merged the array
                    System.out.println("Comparing left array "+Arrays.toString(left)+" & right array "+Arrays.toString(right)+" -> "+left[i]+" > "+right[j]+" So, "+right[j]+" inserted in merged array");
                    array[k] = right[j];
                    j++;

                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                array[k] = left[i];
                System.out.println("# Remaining element in the left array -> "+left[i]+" inserted in the merge array ");
                i++;
                k++;
            }
            while(j < right.length)
            {
                array[k] = right[j];
                System.out.println("# Remaining element in the right array -> "+right[j]+" inserted in the merge array ");
                j++;
                k++;
            }

                System.out.println(Arrays.toString(array) + " Merged array of "+Arrays.toString(left)+" & "+Arrays.toString(right)+"\n\n\n");


        }

    }


}