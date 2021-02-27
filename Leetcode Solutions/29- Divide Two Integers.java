class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE &&  divisor==-1) return Integer.MAX_VALUE;
        int dividendabs=Math.abs(dividend);
        int divisorabs=Math.abs(divisor);
        int result=div(dividendabs,divisorabs);
        return (dividend<0)==(divisor<0)?result:-result;
    }
    public int div(int dividend,int divisor){
        int count=0;
        while(dividend-divisor>=0){
            int step=1;
            int cur=divisor;
            while(dividend-(cur+cur)>0){
                cur=cur+cur;
                step=step+step;
                
            }dividend=dividend-cur;
            count=count+step;
        }
        return count;
    }
}
