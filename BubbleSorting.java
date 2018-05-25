package sorting;

public class BubbleSorting {
    public void swap(int[] items, int left, int right) {
        if(left != right) {
            int temp = items[left];
            items[left] = items[right];
            items[right] = temp;
        }
    }

    public void sort(int[] items) {
        boolean swapped = true;

        while (swapped != false) {
            swapped = false;
            for(int i = 1; i < items.length; i++) {
                if(items[i - 1] > items[i]) {
                    swap(items, i-1, i);
                    swapped = true;
                }
            }
        }
    }
}
