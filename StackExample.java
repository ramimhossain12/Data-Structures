package Ramim_Apps_Ltd.company.ff;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> ob = new Stack<>();
        // Add elements to Stack.......push() Method
        ob.push("Dog");
        ob.push("Cat");
        ob.push("Horse");
        System.out.println("Stack: " + ob);


        // Remove element stacks......pop() Method
        String element = ob.pop();
        System.out.println("Removed Element: " + element);

        // Access element from the top......peek() Method
        String element1 = ob.peek();
        System.out.println("Element at top: " + element1);


        // Search an element........search() Method
        int position = ob.search("Cat");
        System.out.println("Position of Cat " + position);


        // Check if stack is empty..........empty() Method
        boolean result = ob.empty();
        System.out.println("Is the stack empty? "+ result );

    }

}
