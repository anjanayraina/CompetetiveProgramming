import java.util.*;

public class CalculatorProgram {
    static HashSet<Character> set;
    public static boolean isOperator(char op ){
        return set.contains(op);
    }
    public static boolean validInput(String s){

        int n =s.length();
        for(int i =1;i<n;i++)
        {
            if(s.charAt(i-1) == s.charAt(i) && isOperator(s.charAt(i)))return false;
        }
        return true;
    }

    public static  void createHashMap(){
        set = new HashSet<>();
        set.add('+');
        set.add('-');
        set.add('/');
        set.add('%');
        set.add('*');
        set.add('^');

    }
    public static String Calculator(String str) {
        // will get all numbers and store it to `numberStr`
        String numberStr[] = str.replaceAll("[+*/()-]+"," ").split(" ");
        // will get all operators and store it to `operatorStr`
        String operatorStr[] = str.replaceAll("[0-9()]+","").split("");

        int total = Integer.parseInt(numberStr[0]);

        for (int i=0; i<operatorStr.length; i++) {
            switch (operatorStr[i]) {
                case "+" :
                    total += Integer.parseInt(numberStr[i+1]);
                    break;
                case "-" :
                    total -= Integer.parseInt(numberStr[i+1]);
                    break;
                case "*" :
                    total *= Integer.parseInt(numberStr[i+1]);
                    break;
                case "/" :
                    total /= Integer.parseInt(numberStr[i+1]);
                    break;
            }

            if(i+2 >= operatorStr.length) continue; // if meets the last operands already
            numberStr[i+1] = String.valueOf(total);

        }
        return String.valueOf(total);
    }

    public static  int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int number = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = 10 * number + (int)(c - '0');
            }else if(c == '+'){
                result += sign * number;
                number = 0;
                sign = 1;
            }else if(c == '-'){
                result += sign * number;
                number = 0;
                sign = -1;
            }else if(c == '('){
                //we push the result first, then sign;
                stack.push(result);
                stack.push(sign);
                //reset the sign and result for the value in the parenthesis
                sign = 1;
                result = 0;
            }else if(c == ')'){
                result += sign * number;
                number = 0;
                result *= stack.pop();    //stack.pop() is the sign before the parenthesis
                result += stack.pop();   //stack.pop() now is the result calculated before the parenthesis

            }
        }
        if(number != 0) result += sign * number;
        return result;
    }
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(calculate(str));
    }
}
