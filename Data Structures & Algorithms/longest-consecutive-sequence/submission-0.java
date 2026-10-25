class Solution {
    public int longestConsecutive(int[] nums) {

        int  res = 0;
        Set<Integer> map= new HashSet<>();
       for(int num: nums) {
        map.add(num);
       }

       for(int num:nums){

        if(!map.contains(num-1)){
            int len = 1;
            while(map.contains(num+len)){
                len++;
            }
            res = Math.max(len,res);
        }
       }
        return res;
    }
}
