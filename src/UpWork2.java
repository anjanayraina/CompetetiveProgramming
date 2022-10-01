import java.util.*;

public class UpWork2 {

    static List<String> al = new ArrayList<>();




    private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }


        findsubsequences(s.substring(1), ans + s.charAt(0));


        findsubsequences(s.substring(1), ans);
    }

    public static boolean isSame(String s){

        int[] freq = new int[26];


        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }


        int prev = freq[s.charAt(0) - 'a'];


        for(int num: freq){

            if(num != 0 && num != prev){
                return false;
            }
        }


        return true;

    }
    public static int countGoodSubsequence(String s){

        findsubsequences(s, ""); // Calling a function
        long res =  0;


        for(String i : al){

            if( !i.equals("") && isSame(i)){
                res = (res +1 )%(int)(Math.pow(10 , 9 ) + 7);

            }

        }

        return (int)res;

    }
    public static void main(String args[]){




    }
}
