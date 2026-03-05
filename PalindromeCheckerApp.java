import java.util.Stack;
import java.util.ArrayDeque;

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
    public static boolean reversePalindrome(String word){

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

}
