package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void findAllTest() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");

        String[] expected = {"Harry 1", "Harry 2", "Harry 3" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");

        String[] expected = {"Harry 3", "Harry 2", "Harry 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Test() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");

        String[] expected = {"Harry 10", "Harry 9", "Harry 8", "Harry 7", "Harry 6", "Harry 5", "Harry 4", "Harry 3", "Harry 2", "Harry 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10From11Test() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");
        manager.addMovie("Harry 11");

        String[] expected = {"Harry 11", "Harry 10", "Harry 9", "Harry 8", "Harry 7", "Harry 6", "Harry 5", "Harry 4", "Harry 3", "Harry 2" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast9From11Test() {
        PosterManager manager = new PosterManager(9);

        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");
        manager.addMovie("Harry 11");

        String[] expected = {"Harry 11", "Harry 10", "Harry 9", "Harry 8", "Harry 7", "Harry 6", "Harry 5", "Harry 4", "Harry 3" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast11Test() {
        PosterManager manager = new PosterManager(11);
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");
        manager.addMovie("Harry 11");

        String[] expected = {"Harry 11", "Harry 10", "Harry 9", "Harry 8", "Harry 7", "Harry 6", "Harry 5", "Harry 4", "Harry 3", "Harry 2", "Harry 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}