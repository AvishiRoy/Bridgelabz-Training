import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }

    // UC3 Method
    public static boolean checkPalindrome(String word){

        char[] arr = word.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            if(arr[left] != arr[right]){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean stackPalindrome(String word){

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

}
