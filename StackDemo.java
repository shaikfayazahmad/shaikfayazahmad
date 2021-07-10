package collections;

import java.util.Collections;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("fayaz");
		st.push("ahmad");
		st.push("shaik");
		System.out.println(st.capacity());
		System.out.println(st.get(1)+st.get(2));
		System.out.println(st.contains("shaik"));
		System.out.println(st);
		System.out.println(st.get(1));
		Collections.sort(st);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.push("hit will rock"));
		System.out.println(st);
		System.err.println(st.empty());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println(st.push("shaik fayaz ahmad"));
	
	  
	}

}
