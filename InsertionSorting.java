package sorting;

public class InsertionSorting {
    public void sort(int[] items) {
        int currentPos = 1;
        while(currentPos < items.length) {
            if(items[currentPos] < items[currentPos - 1]) {
                int insertIndex = getInsertIndex(items, currentPos);
                insert(items, insertIndex, currentPos);
            }
            currentPos++;
        }
    }

    public int getInsertIndex(int[] items, int currentPos) {
        for(int i = 0; i < items.length; i++) {
            if(items[i] > items[currentPos]) {
                return i;
            }
        }
        return -1;
    }

    public void insert(int[] items, int insertIndex, int currentPos) {
        int temp = items[insertIndex];
        items[insertIndex] = items[currentPos];

        for(int i = currentPos; i > insertIndex; i--) {
            items[i] = items[i - 1];
        }

        items[currentPos] = temp;
    }
}
