import java.util.Scanner;

public class CutRibbon {

    public static int shell(int n  , int dp [] , int a , int  b , int c){
        if(n < 0)return -1;
        if(n == 0 )return 0;

        if(dp[n]!=0)return dp[n];

        int costA = shell(n-a ,dp , a , b , c);
        int costB = shell(n-b ,dp , a , b , c);
        int costC = shell(n-c ,dp , a , b , c);
        if(costA == -1 && costB == -1 && costC == -1){

            dp[n] = -1;
            return -1;

        }

        dp[n]  =Math.max(costA , Math.max(costB , costC)) + 1;
        return dp[n];


    }
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        int a = s.nextInt();
        int  b  =s.nextInt();
        int c = s.nextInt();
        int dp[] = new int[n+1];
        System.out.println(shell( n ,dp , a , b, c));

    }
}
