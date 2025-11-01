import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PracticeTest {
    // --- maxDiff ---

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
    void testMaxDiffArrayListPositiveAndNegative() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(-2);
        numbers.add(9);
        numbers.add(-5);

        // Act
        int actual = Practice.maxDiffArrayList(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffArrayListDuplicates() {
        // Arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        // Act
        int actual = Practice.maxDiffArrayList(numbers);

        // Assert
        // Largest: 3, Smallest: 3, Difference: 3 - 3 = 0
        assertEquals(0, actual);
    }

    @Test
    void testMaxDiffHashSetPositiveAndNegative() {
        // Arrange
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(8);
        numbers.add(-2);
        numbers.add(9);
        numbers.add(-5);

        // Act
        int actual = Practice.maxDiffHashSet(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffHashSetDuplicates() {
        // Arrange
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        // Act
        int actual = Practice.maxDiffHashSet(numbers);

        // Assert
        // Largest: 3, Smallest: 3, Difference: 3 - 3 = 0
        assertEquals(0, actual);
    }

    @Test
    void testMaxDiffMapKeysPositiveAndNegative() {
        // Arrange
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(8, -5);
        numbers.put(-2, 9);
        numbers.put(9, -2);
        numbers.put(-5, 8);

        // Act
        int actual = Practice.maxDiffMapKeys(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffMapKeysDuplicates() {
        // Arrange
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(3, -2);
        numbers.put(3, -2);
        numbers.put(3, -2);

        // Act
        int actual = Practice.maxDiffMapKeys(numbers);

        // Assert
        // Largest: 3, Smallest: 3, Difference: 3 - 3 = 0
        assertEquals(0, actual);
    }

    @Test
    void testMaxDiffMapValuesPositiveAndNegative() {
        // Arrange
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(8, -5);
        numbers.put(-2, 9);
        numbers.put(9, -2);
        numbers.put(-5, 8);

        // Act
        int actual = Practice.maxDiffMapValues(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffMapValuesDuplicates() {
        // Arrange
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(3, -2);
        numbers.put(3, -2);
        numbers.put(3, -2);

        // Act
        int actual = Practice.maxDiffMapValues(numbers);

        // Assert
        // Largest: -2, Smallest: -2, Difference: -2 - -2 = 0
        assertEquals(0, actual);
    }

    // --- longestWord ---

    @Test
    void testLongestWordOneMatch() {
        String[] list = { "fire", "twenty", "lamp", "oxygen" };

        String actual = Practice.longestWord(list, 'l');

        assertEquals("lamp", actual);
    }

    @Test
    void testLongestWordMultiMatch() {
        String[] list = { "tire", "twenty", "tape", "titanium", "refrigerator" };

        String actual = Practice.longestWord(list, 't');

        assertEquals("titanium", actual);
    }

    @Test
    void testLongestWordArrayListOneMatch() {
        ArrayList<String> list = new ArrayList<>();
        list.add("fire");
        list.add("twenty");
        list.add("lamp");
        list.add("oxygen");

        String actual = Practice.longestWordArrayList(list, 'l');

        assertEquals("lamp", actual);
    }

    @Test
    void testLongestWordArrayListMultiMatch() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tire");
        list.add("twenty");
        list.add("tape");
        list.add("titanium");
        list.add("refrigerator");

        String actual = Practice.longestWordArrayList(list, 't');

        assertEquals("titanium", actual);
    }
}
