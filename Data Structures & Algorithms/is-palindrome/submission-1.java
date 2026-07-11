class Solution {
    public boolean isPalindrome(String s) {
         String a = s.replaceAll("[^a-zA-Z0-9]","");
      
     String m = new StringBuilder(a).reverse().toString();
  return(m.equalsIgnoreCase(a));
    
    
    

        
       
        
    }
}
