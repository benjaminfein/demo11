import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 9, 6, 5, 3, 8};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Not sorted array: " + Arrays.toString(arr));

//        Sorting.quickSort(arr, low, high);
//        System.out.println("Sorted array by quickSort: " + Arrays.toString(arr));

        Sorting.mergeSort(arr, arr.length);
        System.out.println("Sorted array by mergeSort: " + Arrays.toString(arr));

        int searchVal = 7;
        int retVal = Arrays.binarySearch(arr, searchVal);
        System.out.println("The index of element " + searchVal + " is: '" + retVal + "'");
    }
}
