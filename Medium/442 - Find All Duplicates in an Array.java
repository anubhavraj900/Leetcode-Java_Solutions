class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
                int num=Math.abs(nums[i])-1;
            if(nums[num]<0)
                result.add(Math.abs(nums[i]));
            nums[num]=-nums[num];
        }
        return result;
    }
}
