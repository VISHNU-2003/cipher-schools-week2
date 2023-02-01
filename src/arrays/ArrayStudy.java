package arrays;

import java.sql.SQLOutput;

public class ArrayStudy  {
    static void print(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 1.Array Creation expression
        int size = 5;
        int arr[] = new int[size];//combination of 19 and 20
        //int arr[], int[] arr, int []arr, -> all are the same
        //int arr[] -> Array Declaration expression
        //arr = new int[size];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        print(arr);

        for(int i=0;i<size;i++)
        {
            arr[i] = i+1;
        }
        //2.array initializers list
        print(arr);
        int arr2[] = {1,2,3};
        print(arr2);
        //If we want to increase size of an array?
        int copyArray[] = new int[2*size];//create an array of double size
        for (int i=0;i<size;i++)
        {
            copyArray[i] = arr[i];
        }
        copyArray[5] = 6;
        copyArray[6] = 7;
        print(copyArray);


    }
}
