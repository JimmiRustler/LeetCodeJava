import java.util.Stack;
public class validParentheseSolution {
    public static boolean isValid(String s) {
    //Convert string to an array of characters
    char[] chars = s.toCharArray();
        //Create a new stack to hold open
       Stack<Character> openBrackets = new Stack<Character>();
       /*Switch Statemenet: This statement takes in the current object from the chars array and does one of the following. If it is an open bracket
       * of any type, it adds that to the list openBrackets. If the bracket is closed, it checks the top element of openbrackets as comparison. Since they must
       * close in the order they open, the top element must be the opening bracket of the currently checked closed bracket. If not, the loop breaks and returns false
       * If true, it pops the element off the stack of open brackets and proceeds to the next. 
       * It must pass all elements in the array properly to return true
       */
        for(int i=0; i<chars.length; i++){
            Character check = chars[i];
            switch (check){
                case '{' :
                {
                    openBrackets.push('{');
                    break;
                }
                case '[' :
                {
                    openBrackets.push('[');
                    break;
                }
                case '(' :
                {
                    openBrackets.push('(');
                    break;
                }

                case '}' :
                {
                    if(openBrackets.peek() !='{'){
                        return false;
                    }else {
                        openBrackets.pop();
                        break;
                    }
                }
                case ']' :
                {
                    if(openBrackets.peek() !='['){
                        return false;
                    }else{
                        openBrackets.pop();
                        break;
                    }
                }
                case ')' :
                {
                    if(openBrackets.peek() !='('){
                        return false;
                    }else{
                        openBrackets.pop();
                        break;
                    }
                } 
            }
        }
        return true;
    }
}
