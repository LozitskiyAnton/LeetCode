package main.java.problems.problem53;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length<2) return nums[0];

        int begin=0;
        int buf=0;
        int max=0;
        int length= nums.length;
        for (int i=0; i<nums.length-1;){
            for(int j=i; j<nums.length-i; j++){
                if(j>=nums.length) break;
                buf+=nums[j];
                if (buf>max) {max=buf;
                }
            }
            i++;
            buf=nums[i];
        }
        return max;

    }
}
