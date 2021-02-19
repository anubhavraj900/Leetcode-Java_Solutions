class Solution {
    public int countSegments(String s) {
        if(s == null || s.length() == 0)
    {
        return 0;
    }
    
    String[] split = s.split(" ");
    int count = 0;
   for(String k:split){
        k = k.trim();
        if(!k.isEmpty())
        {
            count++;   
        }
    }
    
    return count;
    }
}
