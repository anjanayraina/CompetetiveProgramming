import java.util.Scanner;

public class RecursiveSolution {

    public static float shell(int  n ){

        if(n ==  1)return (float)1/2;
        return  shell(n-1 ) + (float)n/(n+1);



    }
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int  n  = s.nextInt();
        System.out.println("The answer is  :");
        System.out.println(shell(n));

    }
}
