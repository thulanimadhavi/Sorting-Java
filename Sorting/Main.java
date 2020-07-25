package Sorting;

import java.util.Arrays;
import java.util.Scanner;

//Main class to implement all sorting methods
public class Main {

    public static void main(String[] args) {
        System.out.print("Select a sorting method:\n" +
                "1.Bubble sort\n" +
                "2.Insertion sort\n" +
                "3.Selection sort\n" +
                "4.Merge sort\n" +
                "5.Quick sort\n" +
                "6.Heap sort\n");
        Scanner sc3 = new Scanner(System.in);
        int method =sc3.nextInt();
        System.out.print("How many numbers do you need to sort?");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int i;
        int[] arr=new int[num];
        Scanner sc2 = new Scanner(System.in);
        for(i=0;i<num;i++) {


            System.out.print("Enter the numbers");
            arr[i] = sc2.nextInt();
        }

        String methodString;
        switch (method)
        {
            case 1: methodString = "Bubble Sort";
                BubbleSort ob= new BubbleSort();
                ob.bubbleSort(arr, arr.length);
                break;
            case 2:  methodString = "Insertion Sort";
                InsertionSort ob1 = new InsertionSort();
                ob1.sort(arr);
                break;
            case 3:  methodString = "Selection Sort";
                SelectionSort ob2 = new SelectionSort();
                ob2.sort(arr);
                break;
            case 4:  methodString = "Merge Sort";
                MergeSort ob3 = new MergeSort();
                ob3.mergeSort(arr);

                break;
            case 5:  methodString = "Quick Sort";
                QuickSort ob4 = new QuickSort();
                ob4.qSort(arr, 0, num-1);

                break;
            case 6:  methodString = "Heap Sort";
                HeapSort ob5 = new HeapSort();
                ob5.sort(arr);
                break;
            default: methodString = "Invalid Sorting method";
        }

            System.out.println("Sorted array : ");
            System.out.println(Arrays.toString(arr));








    }
}
