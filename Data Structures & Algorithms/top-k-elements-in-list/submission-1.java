class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> h = new HashMap<>();
    for(int n=0;n<nums.length;n++) {
        int n1= nums[n];
        
         h.put(nums[n],h.getOrDefault(n1,0)+1);
        
        
        }
     
    int[] m =h.entrySet().stream().sorted((entry1,entry2) -> entry2.getValue() -
    entry1.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
    
    return m;
    }
}
