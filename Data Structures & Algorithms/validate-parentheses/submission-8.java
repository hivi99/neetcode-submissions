class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack  =  new Stack<>();
      char c[] =  s.toCharArray();
      char top;
        for (char w :c){
            if(w=='(' || w=='[' || w=='{' ){
                stack.push(w);
            }
else{
if(stack.isEmpty())return false;

if(stack.peek()=='(' && w==')'){
    stack.pop();

    continue;
}


else if(stack.peek()=='[' && w==']'){
    stack.pop();

    continue;
}

else if(stack.peek()=='{' && w=='}'){
    stack.pop();
 
    continue;
}
else{
    return false;
}

        }
       
    }
     return stack.isEmpty();
}
}