package leetcode.p303;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumArray {

    int[]                                   nums;

    Map<Integer, TreeMap<Integer, Integer>> cache = new HashMap<Integer, TreeMap<Integer, Integer>>();

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        int begin = i ;
        int end = j;
        for (i = Math.max(i, 0); i <= Math.min(j, nums.length - 1); i++) {
            TreeMap<Integer, Integer> cacheSum = cache.get(i);
            if (cacheSum != null &&  cacheSum.floorKey(j) != null) {
                Integer floorKey = cacheSum.floorKey(j);
                sum += cacheSum.get(floorKey);
                i = floorKey ;
            }else{
                sum += nums[i];
            }
        }
        TreeMap<Integer, Integer> cacheSum = cache.get(begin);
        if(cacheSum == null){
            cacheSum = new TreeMap<Integer, Integer>();
            cache.put(begin, cacheSum);
        }
        cacheSum.put(end, sum);
        return sum;
    }
    
    public static void main(String[] args) {
        NumArray array = new NumArray(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(array.sumRange(2, 4));
        System.out.println(array.sumRange(2, 5));
        System.out.println(array.sumRange(1, 5));
        System.out.println(array.sumRange(0, 5));
    }
}
