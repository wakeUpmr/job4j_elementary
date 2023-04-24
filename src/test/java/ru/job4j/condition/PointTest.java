package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;

        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to07Then7() {
        double expected = 7;
        Point first = new Point(0, 0);
        Point second = new Point(0, 7);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to45Then5() {
        double expected = 5;
        Point first = new Point(1, 1);
        Point second = new Point(4, 5);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111Then1point73() {
        double expected  = 1.73;
        Point first = new Point(0, 0, 0);
        Point second = new Point(1, 1, 1);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}