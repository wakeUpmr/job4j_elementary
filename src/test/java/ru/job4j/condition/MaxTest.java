package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To44Then44() {
        int left = 7;
        int right = 44;
        int result = Max.max(left, right);
        int expected = 44;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To4Then4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax50To13To44To22Then50() {
        int first = 50;
        int second = 13;
        int third = 44;
        int fourth = 22;
        int result = Max.max(first, second, third, fourth);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }
}
