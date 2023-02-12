import java.util.Stack;
public class stack {
	public static void main(String[] args){
		Stack<String> stack= new Stack<String>();
		System.out.println(stack.isEmpty());
		stack.push("sruthi");
		stack.push("sarath");
		stack.push("helo");
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search("sruthi"));
		System.out.println(stack.search("sruthi2eq"));
		
	}

}
