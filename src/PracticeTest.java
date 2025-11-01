import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = { 8, -2, 9, -5 };

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffDuplicates() {
        // Arrange
        int[] numbers = { 3, 3, 3 };

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 3, Smallest: 3, Difference: 3 - 3 = 0
        assertEquals(0, actual);
    }

    // TODO: Make tests for each problem you solve

    @Test
    void testLongestWordOneMatch() {
        ArrayList<String> list = new ArrayList<>();
        list.add("fire");
        list.add("twenty");
        list.add("lamp");
        list.add("oxygen");

        String actual = Practice.longestWord(list, 'l');

        assertEquals("lamp", actual);
    }

    @Test
    void testLongestWordMultiMatch() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tire");
        list.add("twenty");
        list.add("tape");
        list.add("titanium");
        list.add("refrigerator");

        String actual = Practice.longestWord(list, 't');

        assertEquals("titanium", actual);
    }

    @Test
    void testWordLenCountSomeMatch() {
        Set<String> list = new HashSet<>();
        list.add("cat");
        list.add("yellow");
        list.add("raining");
        list.add("smell");
        list.add("vehicles");
        list.add("on");
        list.add("tent");

        int actual = Practice.wordLenCount(list, 3, 7);

        // Words within 4-6 char length: yellow, smell, tent
        assertEquals(3, actual);
    }

    @Test
    void testWordLenCountNoMatch() {
        Set<String> list = new HashSet<>();
        list.add("fan");
        list.add("megatron");
        list.add("no");
        list.add("jackson");

        int actual = Practice.wordLenCount(list, 3, 7);

        // Words within 4-6 char length:
        assertEquals(0, actual);
    }
}
