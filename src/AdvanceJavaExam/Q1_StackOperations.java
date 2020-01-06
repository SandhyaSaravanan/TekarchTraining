package AdvanceJavaExam;

public class Q1_StackOperations {
	
		static final int MAX = 1000; 
    	int top=-1; 
    	String a[] = new String[MAX]; // Maximum size of Stack 
     
    	void push(String name)	
    	{
			if (top >= (MAX - 1)) { 
				System.out.println("Stack Overflow"); 
				} 
			else { 
				a[++top] = name; 
				System.out.println(name + " - pushed into stack"); 
				} 
		} 
  
		String pop() 
		{ 
			if (top < 0) { 
				System.out.println("Stack Underflow"); 
				return "nothing"; 
			} 
			else { 
				String name = a[top--]; 
				return name; 
			} 
		} 
  
		String peek() 
		{ 
			if (top < 0) { 
				System.out.println("Stack Underflow"); 
				return "nothing"; 
			} 
			else { 
				String name = a[top]; 
				return name; 
			} 
		} 
	
	public static void main(String[] args) {
		Q1_StackOperations s = new Q1_StackOperations(); 
        s.push("Ram"); 
        s.push("Ria"); 
        s.push("Sid"); 
        System.out.println(s.pop() + " - Popped from stack"); 
        System.out.println(s.peek() + " - is at the top of the stack");
	}

}
