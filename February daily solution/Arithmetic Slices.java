class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int count =1;
        int ans=0;
       
       for(int i=2;i<A.length;i++){
          if(A[i]-A[i-1]==A[i-1]-A[i-2]){
                ans+=count++; 
           }else{
              count=1;
          }
           
       }
        
        return ans;
    }
}
