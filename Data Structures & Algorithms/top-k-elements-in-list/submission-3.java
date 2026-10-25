class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();
        int[] res = new int[k];
        for(int i = 0; i< nums.length ;i++){
            bucket.add(new ArrayList<>());
        }
        for(int i = 0; i< nums.length ;i++){
            
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
       
        for(Map.Entry<Integer,Integer> entry: map.entrySet() ){
           bucket.get(entry.getValue()-1).add(entry.getKey());
        }
        
        int index = 0;
        for(int i = bucket.size() -1 ; i >= 0; i--){
        
            for(int number: bucket.get(i)){
                System.out.println(number);
                res[index++] = number;
                if(index == k){
                    return res;
                }
            }
        }

        return res;
    }
}
