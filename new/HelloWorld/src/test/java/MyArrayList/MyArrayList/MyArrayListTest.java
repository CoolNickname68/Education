package MyArrayList.MyArrayList;

import org.junit.jupiter.api.Test;

import com.MyArrayList.MyArrayList.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class MyArrayListTest {

    @Test
    void testAddAndGrow() {
        MyArrayList list = new MyArrayList(2); // Маленький начальный размер для тестирования grow
        list.add(1);
        list.add(2);
        list.add(3); // В этот момент должен сработать grow

        assertEquals(3, list.size());
        assertEquals(3, list.get(2));
    }

    @Test
    void testRemoveByIndex() {
        MyArrayList list = new MyArrayList(10);
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1); // Удаляем элемент со значением 2

        assertEquals(2, list.size());
        assertEquals(3, list.get(1));
    }

    @Test
    void testClear() {
        MyArrayList list = new MyArrayList(10);
        list.add(1);
        list.add(2);

        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    void testEquals() {
        MyArrayList list1 = new MyArrayList(10);
        list1.add(1);
        list1.add(2);

        MyArrayList list2 = new MyArrayList(10);
        list2.add(1);
        list2.add(2);

        assertTrue(list1.equals(list2));

        list2.add(3);

        assertFalse(list1.equals(list2));
    }

    @Test
    void testToArray() {
        MyArrayList list = new MyArrayList(10);
        list.add(1);
        list.add(2);

        Integer[] array = list.toArray();

        assertArrayEquals(new Integer[] {1, 2}, array);
    }

    @Test
    void testSort() {
        MyArrayList list = new MyArrayList(10);
        list.add(5);
        list.add(1);
        list.add(3);
        list.sort();

        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(5, list.get(2));
    }
}


