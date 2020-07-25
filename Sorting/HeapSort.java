package Sorting;

import java.util.Arrays;

//Heap sort class
    public class HeapSort
    {
        public void sort(int arr[])
        {
            int num = arr.length;
            // Build heap (rearrange array)
            for (int i = num / 2 - 1; i >= 0; i--) {
                System.out.println(Arrays.toString(arr)+" Current root is "+arr[i]);
                heapify(arr, num, i);
            }

            // One by one extract an element from heap
            for (int i=num-1; i>=0; i--)
            {
                // Move current root to end
                System.out.println(Arrays.toString(arr)+" Last element of the unsorted array "+arr[i]+" is swapped with largest element of the unsorted array "+arr[0]+"\n");

                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                // call max heapify on the reduced heap
                System.out.println(Arrays.toString(arr)+" Current root is "+arr[0]);
                heapify(arr, i, 0);
            }
        }

        // To heapify a subtree rooted with node i which is
        // an index in arr[]. n is size of heap
        void heapify(int arr[], int num, int i)
        {
            int largest = i;  // Initialize largest as root
            int l = 2*i + 1;  // left = 2*i + 1
            int r = 2*i + 2;  // right = 2*i + 2

            // If left child is larger than root
            if (l < num && arr[l] > arr[largest]) {
                System.out.println(Arrays.toString(arr)+" left child of the current root "+arr[largest]+" < "+arr[l]+", So root and the left child are swapped ");
                largest = l;
            }
            // If right child is larger than largest so far
            if (r < num && arr[r] > arr[largest]) {
                System.out.println(Arrays.toString(arr)+" right child of the current root "+arr[largest]+" >  "+arr[r]+", So root and the right child are swapped");
                largest = r;
            }
            // If largest is not root
            if (largest != i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Recursively heapify the affected sub-tree
                heapify(arr, num, largest);
            }
        }



    }


