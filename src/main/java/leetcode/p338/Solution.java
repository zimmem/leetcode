package leetcode.p338;

import java.util.Arrays;

public class Solution {

    public int[] countBits(int num) {
        int first_bit = 1;
        int target = 1;
        int[] array = new int[num + 1];
        array[0] = 0;
        for (int i = 1; i <= num; i++) {
            array[i] = array[i - first_bit] + 1;
            if (i ==  target) {
                first_bit = first_bit * 2 ;
                target = first_bit * 2 - 1;
            }
        }
        return array;
    }
    
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(new Solution().countBits(8)));

        //System.out.println(hammingWeight(1));
        System.out.println(reverseBits(1 << 31));
    }
    
    public static int hammingWeight(int n) {
        int result = 0 ;
         while(n>0){
             result = (n & 1) + result;
             n = n >> 1;
         }
         return n;
     }
    
    public static int reverseBits(int n) {
        long nn = n >= 0 ? n : 2 * (long) Integer.MAX_VALUE + 2 + n;
        int m = 0 ;
        int b = 0;
        while(nn != 0 ){
            m = m << 1;
            m += (nn & 1);
            nn = nn >> 1;
            b ++;
        }
        m = m << (32 - b);
        return m;
    }
}
