package Java_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Ex09 {
    public static void main(String[] args) {

        Stack<String> vals = new Stack<>();
        Stack<String> ops = new Stack<>();

        String input = StdIn.readLine();
        String[] inputs = input.split(" ");
//        System.out.println(input);
        for (String s : inputs) {
//            System.out.println(s);
            if      (s.equals("("))               ;
            else if (s.equals(" ")) ;
            else if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/") ||
                    s.equals("sqrt")) ops.push(s);
            else if (s.equals(")"))
            {
                String op = ops.pop();
                String v = vals.pop();

                if (op.equals("+") ||
                        op.equals("-") ||
                        op.equals("*") ||
                        op.equals("/"))
                    v = String.format("( %s %s %s )", vals.pop(), op, v);

                else if (op.equals("sqrt"))
                    v = String.format("( %s %s )", op, v);

                vals.push(v);
            }
            else vals.push(s);
        }
        StdOut.println(vals.pop());
    }

}
