package main.java.problems.problem53;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length<2) return nums[0];

        int begin=0;
        int buf=0;
        int max=Integer.MIN_VALUE;
        int length= nums.length;
        for (int i=0; i<nums.length;){
            for(int j=i; j<nums.length; j++){
                if(j>=nums.length) break;
                buf+=nums[j];
                if (buf>max) {max=buf;
                }
            }
            i++;
            buf=0;
        }
        return max;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] n= {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(solution.maxSubArray(n));
    }
}
