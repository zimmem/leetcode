package leetcode.p283;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0;
        while(z < nums.length && nums[z] != 0  ) z++;
        int n = z + 1;
        while(n < nums.length && nums[n] == 0 ) n++;
        while(z < nums.length ){
            if(nums[z] == 0 ){
                while(n < nums.length){
                    if( nums[n] != 0 ){
                        nums[z] = nums[n];
                        nums[n] = 0 ;
                        n++;
                        break;
                    }
                    n++;
                    if(n == nums.length){
                        return;
                    }
                }
            }
            z++;
        }
    }
    
    public static void main(String[] args) {
//        int []nums = new int[]{1};
//        new Solution().moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));
        System.out.println(0^3);
    }
    
}