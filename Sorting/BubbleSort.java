package Sorting;

import java.util.Arrays;

//recursive bubble sort class
public class BubbleSort {

         static void bubbleSort(int arr[], int num)
        {

            // Base case
            if (num == 1)
                return;

            // One pass of bubble sort. After
            // this pass, the largest element
            // is moved (or bubbled) to end.
            for (int i=0; i<num-1; i++) {
                //System.out.print(Arrays.toString(arr));
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i], arr[i+1]
                    int temp = arr[i];
                    //Swapping of elements with neighbour elements
                    // if neighbour one is smaller than the respective element
                    System.out.println(Arrays.toString(arr)+" Swap since "+arr[i]+" > "+ arr[i + 1]+".");
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;


                }
                //Swapping of elements with neighbour elements
                // if neighbour one is larger than the respective element
                System.out.println(Arrays.toString(arr)+" No swapping since "+arr[i]+" < "+arr[i + 1]+".");

            }

            // Largest element is fixed,
            // recur for remaining array
             for(int r=num-1; r<num; r++) {
                //Next pass over begins
            System.out.println(" pass over ");
            }
            bubbleSort(arr, num=num-1);

        }


    }




