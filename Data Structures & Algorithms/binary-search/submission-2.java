class Solution {
    public int search(int[] nums, int target) {
         int l =0;
         int r= nums.length-1;
         int m;
         while(r>=l){
        m =l+(r-l)/2;//to prevent integer overflow
      if(nums[m]==target)
      return m;
      else if(nums[m]>target){
        r = --m;

      }
      else{
        l = ++m;
      }
         }
        return -1;
    }
}
