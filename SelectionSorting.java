package sorting;

public class SelectionSorting {
    public void sort(int[] items) {
        int currentPos = 0;
        while(currentPos < items.length) {
            int nextIndex = getSmallerIndex(items, currentPos);
            swap(items, currentPos, nextIndex);

            currentPos++;
        }
    }

    public int getSmallerIndex(int[] items, int currentPos) {
        int currentSmaller = items[currentPos];
        int currentSmallerIndex = currentPos;

        for(int i = currentSmallerIndex + 1; i < items.length; i++) {
            if(items[i] < currentSmaller) {
                currentSmaller = items[i];
                currentSmallerIndex = i;
            }
        }

        return currentSmallerIndex;
    }

    public void swap(int[] items, int left, int right) {
        if(left != right) {
            int temp = items[left];
            items[left] = items[right];
            items[right] = temp;
        }
    }
}
