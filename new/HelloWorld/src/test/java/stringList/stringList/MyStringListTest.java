package stringList.stringList;
import com.stringList.stringList.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStringListTest {

    @Test
    void testClear() {
        StringList list = new MyStringList(10);
        list.add("one");
        list.add("two");

        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    void testEquals() {
        StringList list1 = new MyStringList(10);
        list1.add("one");
        list1.add("two");

        StringList list2 = new MyStringList(10);
        list2.add("one");
        list2.add("two");

        assertTrue(list1.equals(list2));

        list2.add("three");

        assertFalse(list1.equals(list2));
    }

    @Test
    void testToArray() {
        StringList list = new MyStringList(10);
        list.add("one");
        list.add("two");

        String[] array = list.toArray();

        assertArrayEquals(new String[]{"one", "two"}, array);
    }
}

