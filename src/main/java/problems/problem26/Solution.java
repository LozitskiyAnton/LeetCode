package main.java.problems.problem26;

/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.*/

import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static int removeDuplicates1(int[] A) {
        if (A.length < 2)
            return A.length;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }

            i++;
        }

        return j + 1;
    }

    public int removeDuplicates(int[] nums) {

        if(nums==null||nums.length==0) return 0;
        int length1=0;
        for(int i=nums.length-1; i>=1;i--) {
            if (nums[i] == nums[i - 1]) {
                System.arraycopy(nums, i, nums, i - 1, nums.length - (i));

                length1++;
            }


        }
        return nums.length-length1;
    }


    public static void main(String[] args) {
        int[] origin = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(origin));
//        for (int i:origin){
//            System.out.print(i+",");
//        }
        System.out.println("");
        Solution solution=new Solution();
        int l=solution.removeDuplicates1(origin);
        System.out.println(l);
        System.out.println(Arrays.toString(origin));
        for (int i=0;i<l;i++){
            System.out.print(origin[i]+",");
        }
    }
}
