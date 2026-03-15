interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input){

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char c : input.toCharArray())
            stack.push(c);

        for(char c : input.toCharArray()){
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeStrategy strategy = new StackStrategy();

        String input = "noon";

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + strategy.check(input));
    }
}