import java.util.*;
public class Jstack{
	public static void main(String[] args){
	Stack <Integer> stack = new Stack<>();
	Scanner sc  = new Scanner(System.in);
	int flag = 0;
	while(flag >=0 ){
		System.out.println("1.Push 2.Pop 3.Peek 4.IsEmpty");
		int choice = sc.nextInt();
		if(choice == 1){
		System.out.println("Entet the element to push");
		stack.push(sc.nextInt());
		}else if(choice == 2){
		System.out.println(stack.pop());
		}else if(choice == 3){
		System.out.println(stack.peek());
		}else {
		System.out.println("Is stack empty?" + stack.isEmpty());
		}
		System.out.println("Should we proceed with the next operation?");
		flag  = sc.nextInt();
	}
	}
}
