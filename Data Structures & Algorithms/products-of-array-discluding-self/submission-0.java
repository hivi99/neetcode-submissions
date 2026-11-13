class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prev[]=new int[n];

        int next[]= new int[n];
        int prod[]= new int[n];
   
    prev[0]=1;
  int suffix=1;
   
    for(int i=0;i<nums.length-1;i++){
       prev[i+1]=prev[i]*nums[i];
 
    }
    for(int i=nums.length-1;i>=0;i--){
        next[i]=suffix;
   suffix = suffix*nums[i];
 
    }

    for(int i=0;i<nums.length;i++){
  prod[i]=prev[i]*next[i];}
  return prod;
    }
  
}  
