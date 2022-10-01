import java.util.Scanner;

public class BhavyaQuestion {


    public static void main(String args[]){


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0){

            t--;
            int n = s.nextInt();
            int a[]  = new int[n];
            for(int i=0;i<n;i++) {

                a[i] = s.nextInt();
            }
                int left[] = new int[n+1];
                int currSum =0;
                int maxSoFarFromLeft  =0;
                for(int i=0;i<n;i++){

                    currSum+=a[i];
                    currSum = Math.max(Math.max(a[i], 0 ) , currSum);
                    maxSoFarFromLeft  = Math.max(maxSoFarFromLeft , currSum);
                    left[i] = maxSoFarFromLeft;
                }

                int right[]  = new int[n+1];
                int sumRight = 0;
                int maxSoFarFromRight = 0;

                for(int i=n-1;i>-1;i--){
                    sumRight+=a[i];
                    sumRight = Math.max(Math.max(a[i], 0 ) , sumRight);
                    maxSoFarFromRight = Math.max(maxSoFarFromRight , sumRight);
                    right[i] = maxSoFarFromRight;
                }
                int res=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){

                    res = Math.max(res , left[i] + right[i+1]);
                }

                System.out.println(res);

            }
        }

    }

