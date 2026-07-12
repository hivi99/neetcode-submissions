class Solution {
    public int[] twoSum(int[] numbers, int target) {
   Map<Integer,Integer> m = new HashMap<>();
   for(int i=0;i<numbers.length;i++){
    m.put(numbers[i],i);
   }
   for(int i=0;i<numbers.length;i++){
    int c = target - numbers[i];
  if(m.containsKey(c)){
    int val =  m.get(c);
    val++;
    int ind = ++i;
    return new int[]{ind,val};
  }
   }
   return new int[]{};
   
   
    }
    }
