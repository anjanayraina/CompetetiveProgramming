import java.util.Scanner;

public class UpWork {

    static int countManipulations(String s1, String s2)
    {
        int count = 0;


        int char_count[] = new int[10];


        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - '0']++;


        for (int i = 0; i < s2.length(); i++)
        {
            char_count[s2.charAt(i) - '0']--;
        }

        for(int i = 0; i < 10; ++i)
        {
            if(char_count[i] != 0)
            {
                count+= Math.abs(char_count[i]);
            }
        }

        return (int)Math.ceil(count /2);
    }

    public static int divider(String str){

        String first = str.substring(0 , str.length()/2);
        String second = str.substring(str.length()/2  );
       return countManipulations(first , second);

    }

    public static void main(String args[]){


        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(divider(str));

    }
}
