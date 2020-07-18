package main.java.problems.problem14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return new String("");
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0; i<=strs.length-1; i++) {
            if(strs[i].length()<min){ min=strs[i].length();
                index=i;

            }
        }
        System.out.println(index);
        StringBuffer sb=new StringBuffer();

        label:
        for(int i =0; i<=strs[index].length()-1;i++){
            char buf=strs[0].charAt(i);
            for(int j=1;j<=strs.length-1;++j){
                if(strs[j].charAt(i)!=buf) {
                    break label;
                }
            }
            sb.append(buf);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strings={"aa","a"};
        Solution solution=new Solution();
        System.out.println(solution.longestCommonPrefix(strings));
    }
}
