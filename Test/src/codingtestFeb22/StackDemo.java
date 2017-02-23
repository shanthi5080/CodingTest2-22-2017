package codingtestFeb22;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	
	 static void showpush(Stack<Integer> st, int a) {
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   static void showpop(Stack<Integer> st) {
	      System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	   }

	   public static void main(String args[]) {
	      Stack<Integer> st = new Stack<Integer>();
	      System.out.println("stack: " + st);
	      showpush(st, 44);
	      showpush(st, 55);
	      showpush(st, 66);
	      showpop(st);
	      showpop(st);
	      showpop(st);
	      try {
	         showpop(st);
	      }catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }
	   }

}
