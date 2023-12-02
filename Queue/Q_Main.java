import java.util.Stack;

public class Q_Main{
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();

		System.out.println(stack.isEmpty());

		stack.push("Minecraft");
		stack.push("DOOM");

		System.out.println(stack.isEmpty());
		System.out.println(stack);

		System.out.println("Last element: " + stack.peek());

		String game = stack.pop();
		System.out.println(stack);
		System.out.println("Game: " + game);
	}
}
