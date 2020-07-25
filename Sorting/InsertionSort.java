
package Sorting;

import java.util.Arrays;

class InsertionSort
{
    /*Function to sort array using insertion sort*/

    void sort(int arr[])
    {
        int num = arr.length;
        for (int i=1; i<num; ++i)
        {
            int key = arr[i];
            int j = i-1;
            if(arr[j]>key) {
                //Key element is compared with the previous element and if key
                // is smaller than previous they are swapped to the correct place of sorted array
                System.out.println(Arrays.toString(arr)+" "+arr[j]+" > "+ arr[i]+" So "+arr[i]+" is inserted in the correct place of sorted array");
            }
            else{
                //Key element is compared with the previous element and if key
                // is larger than previous separation of sorted array from that point
                System.out.println(Arrays.toString(arr)+" "+arr[j]+" < "+ arr[i]+" So "+arr[j]+" and "+arr[i]+" separated as the sorted array");
            }

            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;

            }

            arr[j+1] = key;
            //Moving of key to the correct place of the sorted array
                System.out.println("So "+key+" moves to index " + (j + 1) + " of the sorted array");

        }
        System.out.println(Arrays.toString(arr)+" Now whole array is sorted");
    }



}
