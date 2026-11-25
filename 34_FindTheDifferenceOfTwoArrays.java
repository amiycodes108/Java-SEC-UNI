import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> first = new ArrayList<>(), second = new ArrayList<>();
        for (int x : nums1) {
            boolean inSecond = false, added = false;
            for (int y : nums2) if (x == y) inSecond = true;
            for (int y : first) if (x == y) added = true;
            if (!inSecond && !added) first.add(x);
        }
        for (int x : nums2) {
            boolean inFirst = false, added = false;
            for (int y : nums1) if (x == y) inFirst = true;
            for (int y : second) if (x == y) added = true;
            if (!inFirst && !added) second.add(x);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(first);
        result.add(second);
        return result;
    }
}
