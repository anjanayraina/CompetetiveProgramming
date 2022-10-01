import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class StringTask {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder res = new StringBuilder();
        HashSet<Character>set =  new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('Y');
        set.add('y');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for(char c : s.toCharArray()){

            if(!set.contains(c)){

                int temp  = c - 'A';

                res.append('.');
                if(temp <= 26){


                res.append((char)('a' + temp));
                }

                else{

                    res.append(c);
                }

            }
        }

System.out.println(res.toString());


    }
}
