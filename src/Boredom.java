import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Boredom {

    public static int shell(int ind , int max , int a[] , int dp[]){

        if(ind > max)return 0;

        if(ind == max)return a[max];
        if(dp[ind]!=-1)return dp[ind];

        int res = Math.max(shell(ind +1 , max , a , dp) , a[ind]*ind + shell(ind +2 ,max ,a ,dp));
        dp[ind] = res;
        return res;


    }

    public static void main(String args[]){


        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int maxVal = (int)Math.pow(10 , 5 ) + 2;
        int a[] = new int[maxVal];

        for(int i =0;i<n;i++){
            int val = s.nextInt();
              a[val]++;

        }



        int dp[] = new int[maxVal ];
//        Arrays.fill(dp , -1);
//       int res =  shell(0 , max , a , dp);

        dp[0] = 0;
        dp[1] = a[1];
        for(int i=2;i<=maxVal;i++){
            dp[i] = Math.max(dp[i-1] , i*a[i]+dp[i-2]);

        }
        System.out.println(dp[maxVal - 1]);



    }
}
