package sorting;

public class QuickSorting {
    public void sort(int[] items) {
        quickSort(items, 0, items.length - 1);
    }

    public void quickSort(int[] items, int left, int right) {
        int index = partition(items, left, right);

        if(left < index - 1) {
            quickSort(items, left, index - 1);
        }
        if(right > index) {
            quickSort(items, index, right);
        }
    }

    public int partition(int[] items, int left, int right) {
        int i = left;
        int j = right;
        int pivot = items[(left + right) / 2];

        while (i <= j) {
            while (items[i] < pivot) {
                i++;
            }
            while (items[j] > pivot) {
                j--;
            }

            if(i <= j) {
                int tmp = items[i];
                items[i] = items[j];
                items[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
