package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyFiveThenOneHundredAndThirtySix() {
        int start = 10;
        int finish = 25;
        int result = Counter.sumByEven(start, finish);
        int expected = 136;
        assertThat(result).isEqualTo(expected);
    }
}