package com.MyIntegerList.MyIntegerList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyIntegerList implements IntegerList {

    private Integer[] elements;
    private int size;

    public MyIntegerList(int initialCapacity) {
        elements = new Integer[initialCapacity];
        size = 0;
    }

    @Override
    public Integer add(Integer item) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = item;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            grow();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Integer old = elements[index];
        elements[index] = item;
        return old;
    }

    @Override
    public Integer remove(Integer item) {
        int index = indexOf(item);
        if (index == -1) {
            throw new NoSuchElementException();
        }
        return remove(index);
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Integer old = elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return old;
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) >= 0;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (otherList == null) return false;
        if (size != otherList.size()) return false;
        for (int i = 0; i < size; i++) {
            if (!elements[i].equals(otherList.get(i))) return false;
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, 0, size);
    }

    @Override
    public boolean binarySearch(Integer item) {
        int index = Arrays.binarySearch(elements, 0, size, item);
        return index >= 0;
    }

    private void grow() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
