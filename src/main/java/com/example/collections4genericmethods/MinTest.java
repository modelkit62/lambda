package com.example.collections4genericmethods;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.example.collections4genericmethods.SortingExamples.min;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MinTest {
    private static final Comparator<Integer> COMP = new Comparator<Integer>() {
        public int compare(Integer left, Integer right) {
            return Integer.compare(left, right);
        }
    };

    private List<Integer> list = new ArrayList<>();

    @Test(expected = IllegalArgumentException.class)
    public void shouldRaiseExceptionForEmptyList() {
        min(list, COMP);

        assertThat(list, Matchers.hasSize(0));
    }

    @Test
    public void shouldReturnSingleElementInList() {
        list.add(1);

        final int result = min(list, COMP);

        assertEquals(1, result);
    }

    @Test
    public void shouldFindLowestInList() {
        list.add(3);
        list.add(1);
        list.add(2);

        final int result = min(list, COMP);

        assertEquals(1, result);
    }

}
