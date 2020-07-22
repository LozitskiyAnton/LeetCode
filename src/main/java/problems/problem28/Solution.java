package main.java.problems.problem28;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack==null || needle.length()==0 || needle==null) return 0;
        int m=0;
        for(int i=0;i<haystack.length();i++)
        {
            if(needle.length()+i>haystack.length()) return -1;

            m=i;
            for(int j=0; j<needle.length(); j++){
                if (haystack.charAt(m)==needle.charAt(j)){
                    if(j==needle.length()-1) return i;
                    m++;
                }
                else {
                    break;
                }
            }


        }
        return -1;

    }
}
