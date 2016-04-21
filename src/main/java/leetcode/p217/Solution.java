package leetcode.p217;

import java.util.BitSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        BitSet seta = new BitSet();
        BitSet setb = new BitSet();
        for (int i : nums) {
            BitSet set = i >= 0 ? seta : setb;
            i = i >= 0 ? i : 0 - i;
            if (set.get(i)) {
                return true;
            } else {
                set.set(i);
            }
        }
        return false;
    }
}
