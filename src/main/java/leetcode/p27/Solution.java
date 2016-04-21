package leetcode.p27;

import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length -1;
        int i = 0 ;
        for(; i < nums.length ; i++){
            if(nums[i] == val){
                while(nums[j] == val && j > i){
                    j--;
                }
                if(j ==i){
                    return i;
                }
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        return i;
    }
    
    public static void main(String[] args) {
        int array[] = {3,2,2,3};
        System.out.println(new Solution().removeElement(array, 3));
        System.out.println(Arrays.toString(array));
    }
}