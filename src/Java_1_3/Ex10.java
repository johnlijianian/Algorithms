package Java_1_3;

import com.sun.xml.internal.bind.v2.model.core.ID;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Ex10 {
        //1+2*3 -> false 123*+
        //1*3+2 -> true
        // 2*3/(2-1)+3*(4-1)	23*21-/341-*+

        /*
            1.遇到操作数：直接输出（添加到后缀表达式中）
            2.栈为空时，遇到运算符，直接入栈
            3.遇到左括号：将其入栈
            4.遇到右括号：执行出栈操作，并将出栈的元素输出，直到弹出栈的是左括号，括号不输出。
            5.遇到其他运算符：加减乘除：弹出所有优先级大于或者等于该运算符的栈顶元素，然后将该运算符入栈
            6.最终将栈中的元素依次出栈，输出。
         */

        public static boolean priority(String pre , String now){
            if (now.equals("+")||now.equals("-")&&(pre.equals("(")))
                return true;
            else if ((now.equals("*")||now.equals("/"))&&(pre.equals("*")||pre.equals("/")))
                return true;
            else return false;
        }
        public static void transform(String s){
            String [] inputs = s.split("");
            Stack<String> ops = new Stack<>();
            for (String input : inputs){
                if (input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")){
                    if (ops.isEmpty()) ops.push(input);
                    else {
                        while (priority(ops.peek(),input)) {
                            if (!ops.peek().equals("("))
                                System.out.print(ops.pop());
                            else ops.pop();
                            if (ops.isEmpty()) break;
                        }
                        ops.push(input);
                    }
                }else if(input.equals("(")) ops.push(input);
                else if (input.equals(")")) {
                    while (!ops.peek().equals("(")) {
                        System.out.print(ops.pop());
                        if (ops.isEmpty()) break;
                    }
                }else{
                    System.out.print(input);
                }
            }
        }

        public static void main(String[] args) {
            transform("2*3/(2-1)+3*(4-1)");
        }

}
