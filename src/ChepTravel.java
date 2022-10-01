import java.util.Scanner;

public class ChepTravel {

    public static void main(String args[]){


       Scanner s = new Scanner(System.in);
       long n  =s.nextLong();
        long m =s.nextLong();
        long a  =s.nextLong();
        long b  =s.nextLong();

        long rem  = n%m;

        if(a*m < b){

            System.out.println(a*n);
            return ;

        }

        long res  = Math.min(rem*a , b);
        res+=n/m*b;
        System.out.println(res);



    }
}
