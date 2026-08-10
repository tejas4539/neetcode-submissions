class DynamicArray {
    int capacity;
    int[] arr;
    int size = 0;
    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            arr = new int[capacity];
        }
    }

    public int get(int i) {
        if (i >= 0 && i < size) {
            return arr[i];
        }
        return -1;
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = n;
    }

    public int popback() {
        int a = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return a;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
