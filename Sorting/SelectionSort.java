package Sorting;

import java.util.Arrays;

class SelectionSort
{
    void sort(int arr[])
    {
        int num = arr.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < num-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < num; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            System.out.println(" unsorted array is from index "+i+" to "+(num-1)+"\n"+Arrays.toString(arr)+" Minimum element of unsorted array is "+arr[min_idx]+" So, it is swapped with first element in unsorted array "+arr[i]);
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
    }


}
