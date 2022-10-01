import java.util.Scanner;

public class TheatreSquare {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        long n  = s.nextInt();
        long  m = s.nextInt();
        long a = s.nextInt();

        long x = n/a;
        long y   =m/a;
        if(n%a != 0 )x++;
        if(m%a != 0 )y++;

        System.out.println(x*y);

    }
}
