package main.java.problems.problem38;

class Solution {
    static int m=0;
    public String countAndSay(int n) {

        if(n==1) return "1";
        return generate(n-1,"1");
    }

    public static String generate(int n, String s){
        if (m==n) return s;
        StringBuilder result=new StringBuilder();
        label: for(int i=0;i<s.length();i++){
            switch (s.charAt(i) ){
                case  ('1'): {{if (i<s.length()-2 && s.charAt(i+1)=='1' && s.charAt(i+2)=='1'){result.append("31"); i+=2;}
                else{if (i<s.length()-2 && s.charAt(i+1)=='1' && s.charAt(i+2)!='1') {result.append("21"); i+=1;}
                else{if (i==s.length()-2 && s.charAt(i+1)=='1') {result.append("21"); break label;}
                else {if (i==s.length()-2 && s.charAt(i+1)!='1') {result.append("11");}
                else {result.append("11");}}}}} break;}

                case ('2'): {if (i<s.length()-2 && s.charAt(i+1)=='2' && s.charAt(i+2)=='2') {result.append("32"); i+=2;}
                else{if (i<s.length()-2 && s.charAt(i+1)=='2' && s.charAt(i+2)!='2') {result.append("22"); i+=1;}
                else{if (i==s.length()-2 && s.charAt(i+1)=='2') {result.append("22"); break label;}
                else {if (i==s.length()-2 && s.charAt(i+1)!='2') {result.append("12");}
                else {result.append("12");}}}}} break;

                case ('3'): {if (i<s.length()-2 && s.charAt(i+1)=='3' && s.charAt(i+2)=='3') {result.append("33"); i+=2;}
                else{if (i<s.length()-2 && s.charAt(i+1)=='3' && s.charAt(i+2)!='3') {result.append("23"); i+=1;}
                else{if (i==s.length()-2 && s.charAt(i+1)=='3') {result.append("23"); break label;}
                else {if (i==s.length()-2 && s.charAt(i+1)!='3') {result.append("13");}else {result.append("13");}}}}} break;

            }


        }  m++;

        return generate(n,result.toString());
    }

    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.countAndSay(30));
    }
}
