class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
HashMap<String,List<String>> h = new HashMap<>();
for(String c : strs){
        char[] ch = c.toCharArray();
       Arrays.sort(ch);
String sorted = new String(ch);
if(!h.containsKey(sorted)){
    ArrayList<String> l = new ArrayList<>();
l.add(c);
h.put(sorted,l);

}
else{
  List<String> m =  h.get(sorted);
    m.add(c);
}
}
return new ArrayList(h.values());
    }
}
