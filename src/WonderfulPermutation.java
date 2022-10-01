import java.util.PriorityQueue;
import java.util.Scanner;

public class WonderfulPermutation {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0){

            t--;
            int  n =s.nextInt();
            int k = s.nextInt();
            int a[] = new int[n];
            int count =0 ;
            for(int i=0;i<n;i++){

                a[i] = s.nextInt();
                if( i < k && a[i] > k)count++;

            }


            System.out.println(count);

        }

    }
}
