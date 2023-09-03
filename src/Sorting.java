public class Sorting {
    public static void quickSort(int[] arrayToSort, int low, int high) {
        if (arrayToSort.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int supportElement = arrayToSort[low + (high - low) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arrayToSort[i] < supportElement) {
                i++;
            }
            while (arrayToSort[j] > supportElement) {
                j--;
            }
            if (i <= j) {
                int k = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = k;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arrayToSort, low, j);
        }
        if (high > i) {
            quickSort(arrayToSort, i, high);
        }
    }

    public static void mergeSort(int[] arrayToSort, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int middle = arrayLength / 2;
        int[] firstArray = new int[middle];
        int[] secondArray = new int[arrayLength - middle];

        System.arraycopy(arrayToSort, 0, firstArray, 0, middle);
        if (arrayLength - middle >= 0)
            System.arraycopy(arrayToSort, middle, secondArray, 0, arrayLength - middle);

        mergeSort(firstArray, middle);
        mergeSort(secondArray, arrayToSort.length - middle);

        mergeArray(arrayToSort, firstArray, secondArray, arrayToSort.length / 2, arrayToSort.length - arrayToSort.length / 2);
    }

    private static void mergeArray(int[] arrayToSort, int[] firstArray, int[] secondArray, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (firstArray[i] <= secondArray[j]) {
                arrayToSort[k++] = firstArray[i++];
            }
            else {
                arrayToSort[k++] = secondArray[j++];
            }
        }
        while (i < left) {
            arrayToSort[k++] = firstArray[i++];
        }
        while (j < right) {
            arrayToSort[k++] = secondArray[j++];
        }
    }
}
