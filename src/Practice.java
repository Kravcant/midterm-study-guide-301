import java.util.*;

public class Practice {
    // --- maxDiff ---

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
     * Returns the difference between the largest and smallest integer in an
     * arrayList.
     * 
     * @param nums a non-empty, non-null arrayList of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiffArrayList(ArrayList<Integer> nums) {
        // TODO: implement this
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    /**
     * Returns the difference between the largest and smallest integer in an
     * HashSet.
     * 
     * @param nums a non-empty, non-null HashSet of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiffHashSet(HashSet<Integer> nums) {
        // TODO: implement this
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    /**
     * Returns the difference between the largest and smallest keys in an
     * HashMap.
     * 
     * @param nums a non-empty, non-null HashMap of numbers
     * @return the difference between the largest and smallest keys
     */
    public static int maxDiffMapKeys(Map<Integer, Integer> nums) {
        // TODO: implement this
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums.keySet()) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    /**
     * Returns the difference between the largest and smallest values in an
     * HashMap.
     * 
     * @param nums a non-empty, non-null HashMap of numbers
     * @return the difference between the largest and smallest values
     */
    public static int maxDiffMapValues(Map<Integer, Integer> nums) {
        // TODO: implement this
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums.values()) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    // --- longestWord ---

    /**
     * Returns the longest word that starts with a different character in an array.
     * 
     * @param words a non-empty, non-null, all-lowercase array of words
     * @return the longest word that starts with c
     */
    public static String longestWord(String[] words, char c) {
        String longest = "";
        for (String word : words) {
            if (word.startsWith(Character.toString(c)) && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    /**
     * Returns the longest word that starts with a different character in an
     * arrayList.
     * 
     * @param words a non-empty, non-null, all-lowercase arrayList of words
     * @return the longest word that starts with c
     */
    public static String longestWordArrayList(ArrayList<String> words, char c) {
        String longest = "";
        for (String word : words) {
            if (word.startsWith(Character.toString(c)) && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}