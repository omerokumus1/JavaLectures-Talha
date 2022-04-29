package Ch10_ObjectOrientedThinking.Ch10_6_StackClass;

public class StackTest {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(6);
        System.out.println("is stack empty? " + stack.empty());
        System.out.println("peek: " + stack.peek());
        stack.push(1);
//        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.getContent());
        System.out.println("peek: " + stack.peek());
        System.out.println(stack.getContent());

        System.out.println("pop: " + stack.pop());
        System.out.println(stack.getContent());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getContent());
        System.out.println("pop: " + stack.pop());

    }


}
