class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char currentBracket : str.toCharArray()) {
            if(currentBracket == '(' || currentBracket == '{' || currentBracket == '[') 
                stack.push(currentBracket);
            else 
             if(stack.isEmpty()) return false;
            else 
             if(currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                char openingBracket = stack.pop();
                if(!matchBracket(openingBracket, currentBracket))
                    return false;
          }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    public boolean matchBracket(char opening, char closing) {
        if(opening == '(' && closing == ')')
            return true;
        if(opening == '{' && closing == '}')
            return true;
        if(opening == '[' && closing == ']')
            return true;
        else return false;
    }
    
}