package hello;

 
// using autoboxing and unboxing
import java.util.Stack;
public class autounboxx {

	public static void main(String[] args) {
Stack<Integer> mystack=new Stack<Integer>();

mystack.push(12);//autobox
mystack.push(16);
mystack.push(20);//autobox
mystack.push(30);
int stksum=mystack.pop()+mystack.pop();//unbox
System.out.println("the sum of two elements from the stack"
		                                                 +stksum);
System.out.println(mystack.pop());
System.out.println(mystack.pop());
}
}


