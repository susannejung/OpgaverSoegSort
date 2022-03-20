package FilEksempler;

public class SorteringsAlgortimer {

    public static int binarySearch(String[] list, String key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key.compareTo(list[mid])<0)
                high = mid - 1;
            else if (key.compareTo(list[mid])==0)
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }

    public static void selectionSort(String[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            String currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j])>0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }


    public static void mergeSort(String[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            String[] firstHalf = new String[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            String[] secondHalf = new String[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merge two sorted lists */
    public static void merge(String[] list1, String[] list2, String[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].compareTo(list2[current2])<0)
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }


    private static void quickSort(String[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            System.out.print(pivotIndex+" ");
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    private static int partition(String[] list, int first, int last) {
        String pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && (list[low].compareTo(pivot)==0 ||list[low].compareTo(pivot)<0))
                low++;

            // Search backward from right
            while (low <= high && list[high].compareTo(pivot)>0)
                high--;

            // Swap two elements in the list
            if (high > low) {
                String temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && (list[high].compareTo(pivot)<0 || list[high].compareTo(pivot)==0))
            high--;

        // Swap pivot with list[high]
        if (pivot.compareTo(list[high])>0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
