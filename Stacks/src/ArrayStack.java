
public class ArrayStack implements Stack {
	
	private String arr[];
	private int top;
	
	public ArrayStack() {
		arr = new String[100];
		top = -1;
	}
	
	public ArrayStack(int capacity) {
		arr = new String[capacity];
		top = -1;
	}
	
	
	@Override
	public String pop() {
		String temp = arr[top];
		arr[top] = null;
		top --;
		return temp;
	}

	@Override
	public void push(String e) {
		top ++;
		arr[top]=e;
		
	}

	@Override
	public String pick() {
		return arr[top];
	}

	@Override
	public int size() {
	
		return top+1;
	}

	@Override
	public void display() {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+",");
		}
		
	}

	@Override
	public boolean isEmpty() {
		if(top== -1) return true;
		else
			return false;
	}
   
	
}
