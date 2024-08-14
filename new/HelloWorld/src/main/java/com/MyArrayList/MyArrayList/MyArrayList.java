package com.MyArrayList.MyArrayList;
import java.util.NoSuchElementException;
import java.util.Arrays;

public class MyArrayList {
    private Integer[] array;
    private int size;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        array = new Integer[initialCapacity];
        size = 0;
    }

    public boolean add(Integer item) {
        if (item == null) {
            throw new IllegalArgumentException("Null values are not allowed");
        }
        if (size == array.length) {
            grow();
        }
        array[size++] = item;
        return true;
    }

    public void add(int index, Integer item) {
        if (item == null) {
            throw new IllegalArgumentException("Null values are not allowed");
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == array.length) {
            grow();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = item;
        size++;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Integer removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removedElement;
    }

    public boolean remove(Integer item) {
        int index = indexOf(item);
        if (index == -1) {
            throw new NoSuchElementException("Element not found");
        }
        remove(index);
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public int indexOf(Integer item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Integer item) {
        return indexOf(item) != -1;
    }

    public Integer[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public void sort() {
        if (size > 1) {
            mergeSort(array, 0, size - 1);
        }
    }

    private void grow() {
        int newSize = (int) (array.length * 1.5);
        array = Arrays.copyOf(array, newSize);
    }

    private void mergeSort(Integer[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private void merge(Integer[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Integer[] leftArray = new Integer[n1];
        Integer[] rightArray = new Integer[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

