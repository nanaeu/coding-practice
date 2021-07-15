import java.util.Scanner;

/*
 * Stack 기본 구현
 * 백준 10828번 풀이
 * 
 * Coded by NANAEU	(2021.07.15)
 */

class Stack{
	private int top;
	private int[] stack;
	
	public Stack(int size) {
		this.stack = new int[size];
		this.top = -1;
	}
	
	public void push(int x) {
		this.stack[++top] = x;
	}
	
	public int pop() {
		if(top == -1) return -1;
		return this.stack[top--];
	}
	
	public int size() {
		return top+1;
	}
	
	public int empty() {
		if(top == -1) return 1;
		return 0;
	}
	
	public int top() {
		if(top == -1) return -1;
		return this.stack[top];
	}
	
}

public class BOJ_10828 {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = scan.nextInt();
		
		Stack stack = new Stack(N);
		
		String cmd;
		
		for(int i=0 ; i<N ; i++) {
			
			// 명령 입력받기
			cmd = scan.next();
			
			switch(cmd) {
			case "push":
				stack.push(scan.nextInt());
				break;
			case "pop":
				sb.append(stack.pop()).append("\n");
				break;
			case "top":
				sb.append(stack.top()).append("\n");
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				sb.append(stack.empty()).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
		
		scan.close();
	}
}
