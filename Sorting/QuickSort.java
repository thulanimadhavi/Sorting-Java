package Sorting;
import java.util.Arrays;

//Quick sort class
class QuickSort
{
    /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
    static int partition(int arr[], int low, int high)
    {
        System.out.println(Arrays.toString(arr));
        System.out.println(" Last element of the unsorted array is chosen as the pivot = "+arr[high]);

        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                System.out.println(" "+arr[j]+" < "+arr[high]+", So "+arr[j]+" swapped with "+arr[i+1]);
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr)+" "+arr[j+1]+" >= "+arr[high]);
        }
        // swap arr[i+1] and arr[high] (or pivot)
        System.out.println("Crossing over");
        System.out.println(" "+arr[high]+", which is the pivot is =< "+arr[i+1]+" , So they are swapped");
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        System.out.println(Arrays.toString(arr));

        return i+1;

    }

    /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    static void qSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);



            // Recursively sort elements before
            // partition and after partition
            System.out.println("Partition of sorted array happens at "+arr[pi]+"\n");

            qSort(arr, low, pi-1);
            qSort(arr, pi+1, high);


        }

    }


    }


