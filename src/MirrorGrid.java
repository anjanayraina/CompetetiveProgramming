import java.util.Scanner;

public class MirrorGrid {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int  x =s.nextInt();
        while(x > 0){
            x--;
            int n  =s.nextInt();
            char a [][]  = new char[n][n];
            for(int i=0;i<n;i++){

                String temp = s.nextLine();
                int itr = 0;
                for(char c : temp.toCharArray()){

                    a[i][itr] = c;
                    itr++;
                }
            }
        }
    }
}
