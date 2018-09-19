package Java_1_3;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

import java.util.Stack;

/*
23*21-/341-*+ -> 2*3/(2-1)+3*(4-1)
 */
public class Ex11 {
    private static void transforms(String s){
//        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        String[] inputs = s.split("");
        for (String input : inputs){
            if (input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")) {
                int now = Integer.valueOf(vals.pop());

                int pre = Integer.valueOf(vals.pop());
                switch (input){
                    case "+":
                        vals.push(String.valueOf(now+pre));
                        break;
                    case "-":
                        vals.push(String.valueOf(pre-now));
                        break;
                    case "*":
                        vals.push(String.valueOf(now*pre));
                        break;
                    case "/":
                        vals.push(String.valueOf(pre/now));
                        break;
                }
            }else{
                vals.push(input);
            }
        }
        System.out.println(vals.pop());
    }

    public static void main(String[] args) {
        transforms("23*21-/341-*+");
    }
}
