package sorting;

import java.util.Arrays;

public class MergeSorting {
    public int[] sort(int[] items) {
        if(items.length <= 1) {
            return items;
        }
        int middle = items.length / 2;

        int[] left = Arrays.copyOfRange(items, 0, middle);
        int[] right = Arrays.copyOfRange(items, middle, items.length);
        sort(left);
        sort(right);
        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right) {
        int n = left.length + right.length;
        int[] items = new int[n];

        int leftIndex = 0;
        int rightIndex = 0;

        for(int i = 0; i < n; i++) {
            if(leftIndex == left.length) {
                items[i] = right[rightIndex++];
            } else if(rightIndex == right.length) {
                items[i] = left[leftIndex++];
            } else if(left[leftIndex] < right[rightIndex]) {
                items[i] = left[leftIndex++];
            } else {
                items[i] = right[rightIndex++];
            }
        }
        return items;
    }
}
