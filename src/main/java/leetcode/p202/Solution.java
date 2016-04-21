package leetcode.p202;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> cache = new HashSet<Integer>();
        int num = n;
        while(true){
            
            int theNew = 0;
            //  convert
            while(num > 0){
                int d = (num % 10);
                theNew = theNew + d*d;
                num = num /10;
            }
            num = theNew;
            if(cache.contains(theNew)){
                return false;
            }
            
            if(theNew == 1){
                return true;
            }
            cache.add(num);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(1));
        System.out.println(4>>1);
    }
}
