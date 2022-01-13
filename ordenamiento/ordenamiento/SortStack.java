package ordenamiento;

//Java program to sort a stack using 
//a auxiliary stack.
import java.util.*;

class SortStack
{
 // This function return the sorted stack
 public static Stack<Integer> sortstack(Stack<Integer> input)
 {
     Stack<Integer> tmpStack = new Stack<Integer>();
     while(!input.isEmpty())
     {
         // pop out the first element
         int tmp = input.pop();
     
         // while temporary stack is not empty and
         // top of stack is greater than temp
         while(!tmpStack.isEmpty() && tmpStack.peek() < tmp)
         {
             // pop from temporary stack and 
             // push it to the input stack
         input.push(tmpStack.pop());
         }
         
         // push temp in temporary of stack
         tmpStack.push(tmp);
     }
     return tmpStack;
 }
 
 // Driver Code
 public static void main(String args[])
 {
     Stack<Integer> input = new Stack<Integer>();
     input.add(2);
     input.add(4);
     input.add(3);
     input.add(1);
     input.add(5);
 
     // This is the temporary stack
     Stack<Integer> tmpStack=sortstack(input);
     System.out.println("Los numeros ordenados son:");
 
     while (!tmpStack.empty())
     {
         System.out.print(tmpStack.pop()+" ");
     } 
 }
}