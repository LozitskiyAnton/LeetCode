package main.java.problems.problem67;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("1", "111"));
    }

    public String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        String buf1 = l1 >= l2 ? a : b;
        String buf2 = l1 >= l2 ? b : a;
        int l=buf1.length() - buf2.length();
        for (int i = 0; i < l; i++) {
            buf2 = "0" + buf2;
        }
        String[] r1 = buf1.split("");
        String[] r2 = buf2.split("");
        int carry = 0;
        StringBuilder result = new StringBuilder();

        for (int i = r1.length - 1; i >= 0; i--) {
            if ((Integer.parseInt(r1[i], 2) & Integer.parseInt(r2[i], 2)) == 1) {
                if (carry == 1) {
                    result.append("1");
                } else {
                    carry = 1;
                    result.append("0");
                }
            } else {
                if (carry == 1) {
                    if ((r1[i].equals("0") && r2[i].equals("0"))) {
                        result.append("1");
                        carry = 0;
                    } else {
                        result.append("0");
                    }
                } else {
                    if ((r1[i].equals("0") && r2[i].equals("0"))) {
                        result.append("0");
                    } else {
                        result.append("1");
                    }
                }
            }
        }
        if (carry == 1) result.append("1");
        return result.reverse().toString();
    }
}
