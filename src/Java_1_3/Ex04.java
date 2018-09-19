package Java_1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex04 {
    public static void main(){
        String s = StdIn.readString();

        Stack<String> Parentheses = new Stack<>();
        String [] inputs = s.split("");
        for(String input : inputs){
            if (input.equals("(") || input.equals("[")|| input.equals("{")){
                Parentheses.push(input);
            }else if(!Parentheses.isEmpty()) {
                if (input.equals("}")) {
                    if (!Parentheses.pop().equals("{")) {
                        System.out.println("false");
                        return;
                    }
                } else if (input.equals("]")) {
                    if (!Parentheses.pop().equals("[")) {
                        System.out.println("false");
                        return;
                    }
                } else if (input.equals(")")) {
                    if (!Parentheses.pop().equals("(")){
                        System.out.println("false");
                        return ;
                    }
                }
            }
        }
        if(!Parentheses.isEmpty()){
            System.out.println(false);
        }
    }
}
