package main.java.problems.problem69;


//нахождение квадратного корня по формуле Ньютона
class Solution {
    public int mySqrt(int x) {
        if (x==1) return 1;
        if (x==0) return 0;
        int result = x;
        int div = x/2;
        while(x>0){
            div= (x/div + div) /2;
            if(result > div) result = div;
            else return result;
        }
        return  result;
    }
}