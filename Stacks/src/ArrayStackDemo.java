import java.util.Scanner;
public class ArrayStackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in the stack:");
		int elementsNo = sc.nextInt();
		String name;
		
		
		
		ArrayStack st1 = new ArrayStack(elementsNo);
		System.out.println("Enter names in the stack:");
		
			for(int i=0;i<=elementsNo-1;i++) {
			st1.push(name = sc.next());
			}
		
		//st1.display();
		//System.out.println(st1.size());
		//System.out.println(st1.pick());
		st1.pop();
		st1.display();

	}

}
