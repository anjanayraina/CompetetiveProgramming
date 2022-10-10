import java.util.HashSet;
import java.util.Scanner;

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
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String to be tested:");
        String str = s.nextLine();
        set = new HashSet<>();
        set.add('+');
        set.add('-');
        set.add('/');
        set.add('%');
        set.add('*');
        set.add('^');
        System.out.println("The String inputed is :" + (validInput(str) ? "Valid" : "Invalid"));
    }
}
