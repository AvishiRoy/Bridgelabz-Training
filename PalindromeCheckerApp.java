import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Welcome to Palindrome Checker ");
        System.out.println(" Application Version 1.0 ");
        System.out.println("=================================");

        String word = "madam";

        // UC2
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

        // UC3
        System.out.println("Reverse Method: " + reversePalindrome(word));

        // UC4
        System.out.println("Character Array Method: " + charArrayPalindrome(word));

        // UC5
        System.out.println("Stack Method: " + stackPalindrome(word));

        // UC6
        System.out.println("Queue + Stack Method: " + queueStackPalindrome(word));

    }

    // UC3 – String Reverse
    public static boolean reversePalindrome(String word){

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // UC4 – Character Array
    public static boolean charArrayPalindrome(String word){

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

    // UC5 – Stack Method
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

    // UC5 (extra method you already used earlier – Deque)
    public static boolean dequePalindrome(String word){

        ArrayDeque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.add(c);
        }

        while(deque.size() > 1){

            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }

        }

        return true;
    }

    // UC6 Queue + Stack Based Palindrome Check
    public static boolean queueStackPalindrome(String word){

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : word.toCharArray()){
            stack.push(c);
            queue.add(c);
        }

        while(!stack.isEmpty()){

            if(stack.pop() != queue.remove()){
                return false;
            }

        }

        return true;
    }

}
