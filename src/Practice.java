import java.util.*;

public class Practice {

    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    /**
     * Returns the longest word that starts with a different character in an
     * arrayList.
     * 
     * @param words a non-empty, non-null, all-lowercase arrayList of words
     * @return the longest word that starts with c
     */
    public static String longestWord(ArrayList<String> words, char c) {
        String longest = "";
        for (String word : words) {
            if (word.startsWith(Character.toString(c)) && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    /**
     * Count how many words are longer than n characters and shorter than m
     * characters in a HashSet
     * 
     * @param a non-empty, non-null, all-lowercase HashSet of words
     * @return the amount of words that fit within the length limits
     */
    public static int wordLenCount(Set<String> words, int n, int m) {
        int count = 0;
        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }
}