package week4;
/**
 * @author Mushka Stone
 * Part 2: Test Class

Write a test class to demonstrate the functionality of your generic stack implementation. 
In the test class, create two separate stacks with different data types and perform the following 
operations:

Create a stack for storing integers.
Push several integer values onto the integer stack and perform some pop and peek operations.
Create another stack for storing strings.
Push several string values onto the string stack and perform some pop and peek operations.
Your test class should demonstrate that your generic stack works correctly with different data types.
 */
public class TestClass {
	public static void main(String[]args) {
		//Lets create a new linkedstack of integers
		StackADT intStack = new StackADT();
		
		//Now lets tell the user we are pushing
		System.out.println("Now pushing to the integer stack...");
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		intStack.push(5);
		intStack.push(6);
		intStack.push(7);
		intStack.push(8);

		//Lets display the stack contents
		System.out.println("\nHere are the stack contents: " + intStack);
		
		//Lets tell the user we are peeking
		System.out.println("\nNow peeking...");
		
		System.out.println("The top node on the stack is: " + intStack.peek());
		
		//Lets tell the user we are popping
		System.out.println("\nNow popping...");
		
		System.out.println(intStack.pop());
		
		//Now lets show the user the new stack contents
		System.out.println("\nHere are the new stack contents: \n" + intStack);

		
		//Lets create a new linkedstack of strings
		StackADT strStack = new StackADT();
		
		//Lets tell the user we are pushing
		System.out.println("\nNow pushing the following fruits to the  string stack: Apple, Cherry, Banana, Orange, Plum");
		
		strStack.push("Apple");
		strStack.push("Cherry");
		strStack.push("Banana");
		strStack.push("Orange");
		strStack.push("Plum");
		
		//Lets print the contents
		System.out.println("\nThese are the contents in the stack: ");
		System.out.println(strStack);
		
		System.out.println("\nNow peeking...");
		
		System.out.println("The top node on the stack is: " + strStack.peek());
		
		System.out.println("\nNow popping...");
		
		System.out.println(strStack.pop());
		
		System.out.println("\nHere are the new contents of the stack: ");
		System.out.println(strStack);

		
		
		

	}
}
