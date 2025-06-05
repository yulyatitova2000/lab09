package org.example;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class StreamApiDemoTest {
    @Test
    public void deleteAllNullTest0() {
        var list = new ArrayList<>();
        var list1 = new ArrayList<>();

        var obj0 = new Object();
        var obj1 = new Object();
        var obj2 = new Object();

        list.add(null);
        list.add(obj0);
        list.add(obj1);
        list.add(null);
        list.add(obj2);

        list1.add(obj0);
        list1.add(obj1);
        list1.add(obj2);
        assertEquals(list1, StreamApiDemo.deleteAllNull.apply(list));
    }

    @Test
    public void getCountPositiveTest() {
        var set = new HashSet<Integer>();
        Collections.addAll(set, -2, -1, 0, 1, 2);
        assertEquals(Optional.of(2), Optional.of(StreamApiDemo.getCountPositive.apply(set)));
    }

    @Test
    public void getLastThree() {
        var list = new ArrayList<>();
        var list1 = new ArrayList<>();

        var obj = new Object();
        var arr = new ArrayList<>();
        var set = new HashSet<>();
        Collections.addAll(list, null, new HashSet<>(), obj, arr, set);
        Collections.addAll(list1, obj, arr, set);
        assertEquals(list1, StreamApiDemo.getLastThree.apply(list));
    }

    @Test
    public void getFirstEvenTest0() {
        var list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 3, 5, 8);
        assertEquals(Optional.of(8), Optional.of(StreamApiDemo.getFirstEven.apply(list)));
    }

    @Test
    public void getFirstEvenTest1() {
        var list = new ArrayList<Integer>();
        assertNull(StreamApiDemo.getFirstEven.apply(list));
    }

    @Test
    public void getSquaresTest() {
        var list = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, null, -2, -9, 0);
        Collections.addAll(list2, 1, 4, 9, 81, 0);
        assertEquals(list2, StreamApiDemo.getSquares.apply(list));
    }

    @Test
    public void getSortAllNonEmptyTest() {
        var list = new ArrayList<String>();
        var list1 = new ArrayList<String>();
        Collections.addAll(list, "", "def", "abc", null, "", "ghij");
        Collections.addAll(list1, "abc", "def", "ghij");
        assertEquals(list1, StreamApiDemo.getSortAllNonEmpty.apply(list));
    }

    @Test
    public void getStringListTest() {
        var list = new ArrayList<String>();
        var set = new HashSet<String>();
        Collections.addAll(list, "ghi", "def", "abc");
        Collections.addAll(set, "ghi", "abc", "def");
        assertEquals(list, StreamApiDemo.getStringList.apply(set));
    }

    @Test
    public void getSumOfSquaresTest() {
        var set = new HashSet<Integer>();
        Collections.addAll(set, 2, 3, 4, null, -3);
        assertEquals(Optional.of(38), Optional.of(StreamApiDemo.getSumOfSquares.apply(set)));
    }

    @Test
    public void getHumanMaxAgeTest() {
        var list = new ArrayList<Human>();
        Collections.addAll(list,
                new Human("Ivan", "Ivanov", "Ivanovich", 34, Gender.Male),
                new Human("Petr", "Ivanov", "Ivanovich", 34, Gender.Male),
                new Human("Oleg", "Ivanov", "Ivanovich", 9, Gender.Male));

        assertEquals(Optional.of(34), Optional.of(StreamApiDemo.getHumanMaxAge.apply(list)));
    }

    @Test
    public void getSortHumansTest() {
        var list = new ArrayList<Human>();
        Collections.addAll(list,
                new Human("Ivan", "Ivanov", "Ivanovich", 36, Gender.Female),
                new Human("Petr", "Ivanov", "Ivanovich", 34, Gender.Male),
                new Human("Oleg", "Ivanov", "Ivanovich", 9, Gender.Female));

        var list1 = new ArrayList<Human>();
        Collections.addAll(list1,
                new Human("Petr", "Ivanov", "Ivanovich", 34, Gender.Male),
                new Human("Oleg", "Ivanov", "Ivanovich", 9, Gender.Female),
                new Human("Ivan", "Ivanov", "Ivanovich", 36, Gender.Female));

        assertEquals(list1, StreamApiDemo.getSortHumans.apply(list));
    }

}