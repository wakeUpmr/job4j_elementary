package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {10, 12, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 11, 12};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {10, 12, 9, 11, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 9, 10, 11, 12};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {2, 5, 2, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 2, 2, 5};
        assertThat(result).containsExactly(expected);
    }
}