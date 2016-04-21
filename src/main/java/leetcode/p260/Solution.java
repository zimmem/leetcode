package leetcode.p260;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        return set.parallelStream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{0,0,1})));
    }
}