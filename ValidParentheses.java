import java.util.Stack;

class ValidParentheses {

    public boolean validParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        boolean validString = false;

        for (char ch: s.toCharArray()) {
            
        }

        return validString;
    }


    public static void main(String[] args) {
        ValidParentheses test = new ValidParentheses();

        String test1 = "()[]{}";
        String test2 = "[]";
        String test3 = "(]";
        System.out.println(test.validParentheses(test1));
        System.out.println(test.validParentheses(test2));
        System.out.println(test.validParentheses(test3));


    }

}