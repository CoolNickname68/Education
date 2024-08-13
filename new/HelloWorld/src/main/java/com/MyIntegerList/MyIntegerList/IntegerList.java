package com.MyIntegerList.MyIntegerList;

public interface IntegerList {

    // Добавление элемента.
    Integer add(Integer item);

    // Добавление элемента на определенную позицию списка.
    Integer add(int index, Integer item);

    // Установить элемент на определенную позицию.
    Integer set(int index, Integer item);

    // Удаление элемента.
    Integer remove(Integer item);

    // Удаление элемента по индексу.
    Integer remove(int index);

    // Проверка на существование элемента.
    boolean contains(Integer item);

    // Поиск элемента.
    int indexOf(Integer item);

    // Поиск элемента с конца.
    int lastIndexOf(Integer item);

    // Получить элемент по индексу.
    Integer get(int index);

    // Сравнить текущий список с другим.
    boolean equals(IntegerList otherList);

    // Вернуть фактическое количество элементов.
    int size();

    // Вернуть true, если элементов в списке нет.
    boolean isEmpty();

    // Удалить все элементы из списка.
    void clear();

    // Создать новый массив из целых чисел в списке и вернуть его.
    Integer[] toArray();

    // Сортировка массива
    void sort();

    // Бинарный поиск элемента
    boolean binarySearch(Integer item);
}
