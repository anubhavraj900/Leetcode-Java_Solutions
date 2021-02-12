// solution 1

class Solution {
    public int numberOfSteps (int num) {
        int k=num;
        int count=0;
        
        while(k!=0){
            if(k%2==0){
                k=k/2;
                count++;
            }else{
                k=k-1;
                count++;
            }
        }
    return count;
    }
}

// solution 2

class Solution {
    public int numberOfSteps (int num) {
        if(num==0) return 0;
    return 1+(num%2==0) ? numberOfSteps(num/2):numberOfSteps(num-1);
    }
}
