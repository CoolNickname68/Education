package MyIntegerList.MyIntegerList;
import com.MyIntegerList.MyIntegerList.IntegerList;
import com.MyIntegerList.MyIntegerList.MyIntegerList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyIntegerListTest {

    @Test
    void testAdd() {
        IntegerList list = new MyIntegerList(10);
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
    }

    @Test
    void testRemoveByIndex() {
        IntegerList list = new MyIntegerList(10);
        list.add(1);
        list.add(2);
        list.remove(0);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(2), list.get(0));
    }

    @Test
    void testSortAndBinarySearch() {
        IntegerList list = new MyIntegerList(10);
        list.add(3);
        list.add(1);
        list.add(2);
        list.sort();
        assertEquals(Integer.valueOf(1), list.get(0));
        assertTrue(list.binarySearch(2));
        assertFalse(list.binarySearch(4));
    }

    @Test
    void testEquals() {
        IntegerList list1 = new MyIntegerList(10);
        list1.add(1);
        list1.add(2);

        IntegerList list2 = new MyIntegerList(10);
        list2.add(1);
        list2.add(2);

        assertTrue(list1.equals(list2));

        list2.add(3);

        assertFalse(list1.equals(list2));
    }
}
